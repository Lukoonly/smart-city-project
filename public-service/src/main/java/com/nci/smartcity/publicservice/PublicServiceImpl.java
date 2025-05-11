package com.nci.smartcity.publicservice;

import com.nci.smartcity.*;
import io.grpc.stub.StreamObserver;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class PublicServiceImpl extends PublicServiceGrpc.PublicServiceImplBase {
    private final Map<String, CityService> services = new HashMap<>();
    private final Random random = new Random();

    public PublicServiceImpl() {
        // Initialize city services
        services.put("water", new CityService("water", "Water Supply"));
        services.put("electricity", new CityService("electricity", "Electricity Grid"));
        services.put("waste", new CityService("waste", "Waste Management"));
    }

    @Override
    public void reportIssue(PublicIssueReport request, StreamObserver<PublicIssueResponse> responseObserver) {
        String ticketId = "TICKET-" + System.currentTimeMillis();

        PublicIssueResponse response = PublicIssueResponse.newBuilder()
                .setTicketId(ticketId)
                .setStatus("RECEIVED")
                .setMessage("Your " + request.getIssueType() + " issue at " +
                        request.getLocation() + " has been logged")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getServiceStatus(PublicServiceRequest request, StreamObserver<PublicServiceStatus> responseObserver) {
        CityService service = services.get(request.getServiceType());

        if (service != null) {
            String[] statuses = {"OPERATIONAL", "MINOR_ISSUES", "MAJOR_OUTAGE"};
            String status = statuses[random.nextInt(statuses.length)];
            int responseTime = 5 + random.nextInt(30);

            PublicServiceStatus response = PublicServiceStatus.newBuilder()
                    .setStatus(status)
                    .setResponseTime(responseTime)
                    .build();

            responseObserver.onNext(response);
        } else {
            responseObserver.onError(new IllegalArgumentException("Service not found"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void streamServiceUpdates(PublicServiceStreamRequest request, StreamObserver<PublicServiceUpdate> responseObserver) {
        AtomicInteger counter = new AtomicInteger(0);
        Runnable task = () -> {
            try {
                while (counter.getAndIncrement() < 10) {
                    for (String serviceType : request.getServiceTypesList()) {
                        CityService service = services.get(serviceType);
                        if (service != null) {
                            String[] updates = {
                                    "All systems normal",
                                    "Scheduled maintenance in progress",
                                    "Increased demand detected",
                                    "Minor disruption reported",
                                    "No issues reported"
                            };

                            PublicServiceUpdate update = PublicServiceUpdate.newBuilder()
                                    .setServiceType(serviceType)
                                    .setStatus("OPERATIONAL")
                                    .setUpdateMessage(updates[random.nextInt(updates.length)])
                                    .setTimestamp(String.valueOf(System.currentTimeMillis()))
                                    .build();

                            responseObserver.onNext(update);
                        }
                    }
                    Thread.sleep(3000);
                }
                responseObserver.onCompleted();
            } catch (InterruptedException e) {
                responseObserver.onError(e);
            }
        };
        new Thread(task).start();
    }

    private static class CityService {
        private final String id;
        private final String name;

        public CityService(String id, String name) {
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
