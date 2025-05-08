package com.smartcity;

import com.smartcity.traffic.TrafficManagementServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(9090)
                .addService(new TrafficManagementServiceImpl())
                .build();

        System.out.println("Starting server on port 9090...");
        server.start();
        server.awaitTermination();
    }
}
