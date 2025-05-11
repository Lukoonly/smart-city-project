package com.nci.smartcity.publicservice;


import com.nci.smartcity.discovery.client.DiscoveryClient;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class PublicServer {
    private static final Logger logger = Logger.getLogger(PublicServer.class.getName());
    private Server server;
    private final int port;

    public PublicServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        server = ServerBuilder.forPort(port)
                .addService(new PublicServiceImpl())
                .build()
                .start();
        logger.info("Public Service Server started, listening on " + port);

        // Register with discovery service
        DiscoveryClient discoveryClient = new DiscoveryClient("localhost", 50051);
        discoveryClient.registerService("PublicService", "localhost", port);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            try {
                PublicServer.this.stop();
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
            System.err.println("*** server shut down");
        }));
    }

    private void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        PublicServer server = new PublicServer(50053);
        server.start();
        server.blockUntilShutdown();
    }
}