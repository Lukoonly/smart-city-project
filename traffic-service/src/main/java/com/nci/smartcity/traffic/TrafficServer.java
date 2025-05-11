package com.nci.smartcity.traffic;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import com.nci.smartcity.discovery.client.DiscoveryClient;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class TrafficServer {
    private static final Logger logger = Logger.getLogger(TrafficServer.class.getName());
    private Server server;
    private final int port;

    public TrafficServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        server = ServerBuilder.forPort(port)
                .addService(new TrafficServiceImpl())
                .build()
                .start();
        logger.info("Traffic Server started, listening on " + port);

        // Register with discovery service
        DiscoveryClient discoveryClient = new DiscoveryClient("localhost", 50051);
        discoveryClient.registerService("TrafficService", "localhost", port);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            try {
                TrafficServer.this.stop();
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
        TrafficServer server = new TrafficServer(50052);
        server.start();
        server.blockUntilShutdown();
    }
}