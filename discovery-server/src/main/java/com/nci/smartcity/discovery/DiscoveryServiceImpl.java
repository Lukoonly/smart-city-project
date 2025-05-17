package com.nci.smartcity.discovery;

import com.nci.smartcity.ServiceDiscoveryGrpc;
import com.nci.smartcity.DiscoveryServiceInfo;
import com.nci.smartcity.DiscoveryServiceList;
import com.nci.smartcity.DiscoveryServiceRequest;
import io.grpc.stub.StreamObserver;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DiscoveryServiceImpl extends ServiceDiscoveryGrpc.ServiceDiscoveryImplBase {
    private static final Map<String, DiscoveryServiceInfo> registeredServices = new ConcurrentHashMap<>();

    @Override
    public void registerService(DiscoveryServiceInfo request, StreamObserver<com.nci.smartcity.DiscoveryServiceResponse> responseObserver) {
        registeredServices.put(request.getServiceName(), request);
        System.out.println("Service registered: " + request.getServiceName() + " at " + request.getServiceAddress());

        com.nci.smartcity.DiscoveryServiceResponse response = com.nci.smartcity.DiscoveryServiceResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Service registered successfully")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void discoverService(DiscoveryServiceRequest request, StreamObserver<DiscoveryServiceInfo> responseObserver) {
        DiscoveryServiceInfo serviceInfo = registeredServices.get(request.getServiceName());
        if (serviceInfo != null) {
            responseObserver.onNext(serviceInfo);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void listServices(com.nci.smartcity.Empty request, StreamObserver<DiscoveryServiceList> responseObserver) {
        DiscoveryServiceList.Builder builder = DiscoveryServiceList.newBuilder();
        registeredServices.values().forEach(builder::addServices);
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}