package com.smartcity.traffic;

import io.grpc.stub.StreamObserver;
import com.smartcity.traffic.TrafficProto.*;

public class TrafficManagementServiceImpl extends TrafficManagementServiceGrpc.TrafficManagementServiceImplBase {

    @Override
    public void reportTraffic(TrafficReportRequest request, StreamObserver<TrafficReportResponse> responseObserver) {
        System.out.println("Received traffic report from: " + request.getLocation());

        TrafficReportResponse response = TrafficReportResponse.newBuilder()
                .setResult("Report received for " + request.getLocation())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getCurrentStatus(StatusRequest request, StreamObserver<TrafficStatus> responseObserver) {
        for (int i = 0; i < 3; i++) {
            TrafficStatus status = TrafficStatus.newBuilder()
                    .setLocation(request.getLocation())
                    .setCongestionLevel("MEDIUM")
                    .setTimestamp(String.valueOf(System.currentTimeMillis()))
                    .build();
            responseObserver.onNext(status);
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<TrafficReportRequest> sendBatchReports(StreamObserver<TrafficSummary> responseObserver) {
        return new StreamObserver<>() {
            int count = 0;

            @Override
            public void onNext(TrafficReportRequest value) {
                count++;
                System.out.println("Batch report: " + value.getLocation());
            }

            @Override
            public void onError(Throwable t) {}

            @Override
            public void onCompleted() {
                TrafficSummary summary = TrafficSummary.newBuilder()
                        .setReportsReceived(count)
                        .setOverallStatus("MODERATE")
                        .build();
                responseObserver.onNext(summary);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<TrafficMessage> trafficChat(StreamObserver<TrafficMessage> responseObserver) {
        return new StreamObserver<>() {
            @Override
            public void onNext(TrafficMessage message) {
                System.out.println("Chat from " + message.getSender() + ": " + message.getContent());

                // Echo message
                responseObserver.onNext(TrafficMessage.newBuilder()
                        .setSender("Server")
                        .setContent("Received: " + message.getContent())
                        .build());
            }

            @Override
            public void onError(Throwable t) {}

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}

