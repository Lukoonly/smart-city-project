package com.nci.smartcity.discovery;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.logging.Logger;

public class DiscoveryServer {
    private static final Logger logger = Logger.getLogger(DiscoveryServer.class.getName());
    private Server server;
    private final int port;

    public DiscoveryServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        server = ServerBuilder.forPort(port)
                .addService(new DiscoveryServiceImpl())
                .build()
                .start();
        logger.info("Discovery Server started, listening on " + port);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            DiscoveryServer.this.stop();
            System.err.println("*** server shut down");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        DiscoveryServer server = new DiscoveryServer(50051);
        server.start();
        server.blockUntilShutdown();
    }
}
