package com.nci.smartcity.discovery.client;

import com.nci.smartcity.ServiceDiscoveryGrpc;
import com.nci.smartcity.DiscoveryServiceInfo;
import com.nci.smartcity.DiscoveryServiceList;
import com.nci.smartcity.DiscoveryServiceRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DiscoveryClient {
    private final ManagedChannel channel;
    private final ServiceDiscoveryGrpc.ServiceDiscoveryBlockingStub blockingStub;

    public DiscoveryClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        this.blockingStub = ServiceDiscoveryGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void registerService(String serviceName, String serviceAddress, int servicePort) {
        DiscoveryServiceInfo request = DiscoveryServiceInfo.newBuilder()
                .setServiceName(serviceName)
                .setServiceAddress(serviceAddress)
                .setServicePort(servicePort)
                .build();

        blockingStub.registerService(request);
    }

    public DiscoveryServiceInfo discoverService(String serviceName) {
        DiscoveryServiceRequest request = DiscoveryServiceRequest.newBuilder()
                .setServiceName(serviceName)
                .build();

        return blockingStub.discoverService(request);
    }

    public List<DiscoveryServiceInfo> discoverAllServices() {
        DiscoveryServiceList serviceList = blockingStub.listServices(com.nci.smartcity.Empty.newBuilder().build());
        return new ArrayList<>(serviceList.getServicesList());
    }
}