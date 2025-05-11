package com.nci.smartcity.traffic;

import com.nci.smartcity.*;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class TrafficServiceImpl extends TrafficServiceGrpc.TrafficServiceImplBase {
    private final Map<String, Intersection> intersections = new HashMap<>();
    private final Random random = new Random();

    public TrafficServiceImpl() {
        // Initialize some intersections
        intersections.put("intersection-1", new Intersection("intersection-1", "Main St & 1st Ave"));
        intersections.put("intersection-2", new Intersection("intersection-2", "2nd Ave & Elm St"));
        intersections.put("intersection-3", new Intersection("intersection-3", "Central Square"));
    }

    @Override
    public void getTrafficData(TrafficRequest request, StreamObserver<TrafficResponse> responseObserver) {
        String intersectionId = request.getIntersectionId();
        Intersection intersection = intersections.get(intersectionId);

        if (intersection != null) {
            // Simulate traffic data
            int vehicleCount = 10 + random.nextInt(50);
            double avgSpeed = 30 + (random.nextDouble() * 20);
            String congestion = vehicleCount > 40 ? "HIGH" : vehicleCount > 20 ? "MEDIUM" : "LOW";

            TrafficResponse response = TrafficResponse.newBuilder()
                    .setVehicleCount(vehicleCount)
                    .setAverageSpeed(avgSpeed)
                    .setCongestionLevel(congestion)
                    .build();

            responseObserver.onNext(response);
        } else {
            responseObserver.onError(new IllegalArgumentException("Intersection not found"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void adjustTrafficLights(TrafficLightRequest request, StreamObserver<TrafficLightResponse> responseObserver) {
        String intersectionId = request.getIntersectionId();
        Intersection intersection = intersections.get(intersectionId);

        if (intersection != null) {
            TrafficLightResponse response = TrafficLightResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Traffic lights adjusted for " + intersection.getName())
                    .build();

            responseObserver.onNext(response);
        } else {
            TrafficLightResponse response = TrafficLightResponse.newBuilder()
                    .setSuccess(false)
                    .setMessage("Intersection not found")
                    .build();

            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void streamTrafficUpdates(TrafficStreamRequest request, StreamObserver<TrafficUpdate> responseObserver) {
        AtomicInteger counter = new AtomicInteger(0);
        Runnable task = () -> {
            try {
                while (counter.getAndIncrement() < 15) {
                    for (String intersectionId : request.getIntersectionIdsList()) {
                        Intersection intersection = intersections.get(intersectionId);
                        if (intersection != null) {
                            int vehicleCount = 10 + random.nextInt(50);

                            TrafficUpdate update = TrafficUpdate.newBuilder()
                                    .setIntersectionId(intersectionId)
                                    .setVehicleCount(vehicleCount)
                                    .setTimestamp(String.valueOf(System.currentTimeMillis()))
                                    .build();

                            responseObserver.onNext(update);
                        }
                    }
                    Thread.sleep(2000);
                }
                responseObserver.onCompleted();
            } catch (InterruptedException e) {
                responseObserver.onError(e);
            }
        };
        new Thread(task).start();
    }

    private static class Intersection {
        private final String id;
        private final String name;

        public Intersection(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
