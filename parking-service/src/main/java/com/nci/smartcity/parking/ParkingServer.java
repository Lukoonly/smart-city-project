package com.nci.smartcity.parking;


import com.nci.smartcity.discovery.client.DiscoveryClient;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class ParkingServer {
    private static final Logger logger = Logger.getLogger(ParkingServer.class.getName());
    private Server server;
    private final int port;

    public ParkingServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        server = ServerBuilder.forPort(port)
                .addService(new ParkingServiceImpl())
                .build()
                .start();
        logger.info("Parking Server started, listening on " + port);

        // Register with discovery service
        DiscoveryClient discoveryClient = new DiscoveryClient("localhost", 50051);
        discoveryClient.registerService("ParkingService", "localhost", port);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            try {
                ParkingServer.this.stop();
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
        ParkingServer server = new ParkingServer(50054);
        server.start();
        server.blockUntilShutdown();
    }
}
