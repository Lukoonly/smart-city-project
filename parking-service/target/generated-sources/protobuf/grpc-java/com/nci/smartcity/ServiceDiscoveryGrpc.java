package com.nci.smartcity;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ========== Service Discovery ==========
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: smartcity.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceDiscoveryGrpc {

  private ServiceDiscoveryGrpc() {}

  public static final String SERVICE_NAME = "ServiceDiscovery";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nci.smartcity.DiscoveryServiceInfo,
      com.nci.smartcity.DiscoveryServiceResponse> getRegisterServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterService",
      requestType = com.nci.smartcity.DiscoveryServiceInfo.class,
      responseType = com.nci.smartcity.DiscoveryServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nci.smartcity.DiscoveryServiceInfo,
      com.nci.smartcity.DiscoveryServiceResponse> getRegisterServiceMethod() {
    io.grpc.MethodDescriptor<com.nci.smartcity.DiscoveryServiceInfo, com.nci.smartcity.DiscoveryServiceResponse> getRegisterServiceMethod;
    if ((getRegisterServiceMethod = ServiceDiscoveryGrpc.getRegisterServiceMethod) == null) {
      synchronized (ServiceDiscoveryGrpc.class) {
        if ((getRegisterServiceMethod = ServiceDiscoveryGrpc.getRegisterServiceMethod) == null) {
          ServiceDiscoveryGrpc.getRegisterServiceMethod = getRegisterServiceMethod =
              io.grpc.MethodDescriptor.<com.nci.smartcity.DiscoveryServiceInfo, com.nci.smartcity.DiscoveryServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.DiscoveryServiceInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.DiscoveryServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceDiscoveryMethodDescriptorSupplier("RegisterService"))
              .build();
        }
      }
    }
    return getRegisterServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nci.smartcity.DiscoveryServiceRequest,
      com.nci.smartcity.DiscoveryServiceInfo> getDiscoverServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DiscoverService",
      requestType = com.nci.smartcity.DiscoveryServiceRequest.class,
      responseType = com.nci.smartcity.DiscoveryServiceInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nci.smartcity.DiscoveryServiceRequest,
      com.nci.smartcity.DiscoveryServiceInfo> getDiscoverServiceMethod() {
    io.grpc.MethodDescriptor<com.nci.smartcity.DiscoveryServiceRequest, com.nci.smartcity.DiscoveryServiceInfo> getDiscoverServiceMethod;
    if ((getDiscoverServiceMethod = ServiceDiscoveryGrpc.getDiscoverServiceMethod) == null) {
      synchronized (ServiceDiscoveryGrpc.class) {
        if ((getDiscoverServiceMethod = ServiceDiscoveryGrpc.getDiscoverServiceMethod) == null) {
          ServiceDiscoveryGrpc.getDiscoverServiceMethod = getDiscoverServiceMethod =
              io.grpc.MethodDescriptor.<com.nci.smartcity.DiscoveryServiceRequest, com.nci.smartcity.DiscoveryServiceInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DiscoverService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.DiscoveryServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.DiscoveryServiceInfo.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceDiscoveryMethodDescriptorSupplier("DiscoverService"))
              .build();
        }
      }
    }
    return getDiscoverServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nci.smartcity.Empty,
      com.nci.smartcity.DiscoveryServiceList> getListServicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListServices",
      requestType = com.nci.smartcity.Empty.class,
      responseType = com.nci.smartcity.DiscoveryServiceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nci.smartcity.Empty,
      com.nci.smartcity.DiscoveryServiceList> getListServicesMethod() {
    io.grpc.MethodDescriptor<com.nci.smartcity.Empty, com.nci.smartcity.DiscoveryServiceList> getListServicesMethod;
    if ((getListServicesMethod = ServiceDiscoveryGrpc.getListServicesMethod) == null) {
      synchronized (ServiceDiscoveryGrpc.class) {
        if ((getListServicesMethod = ServiceDiscoveryGrpc.getListServicesMethod) == null) {
          ServiceDiscoveryGrpc.getListServicesMethod = getListServicesMethod =
              io.grpc.MethodDescriptor.<com.nci.smartcity.Empty, com.nci.smartcity.DiscoveryServiceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListServices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.DiscoveryServiceList.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceDiscoveryMethodDescriptorSupplier("ListServices"))
              .build();
        }
      }
    }
    return getListServicesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceDiscoveryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceDiscoveryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceDiscoveryStub>() {
        @java.lang.Override
        public ServiceDiscoveryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceDiscoveryStub(channel, callOptions);
        }
      };
    return ServiceDiscoveryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceDiscoveryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceDiscoveryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceDiscoveryBlockingStub>() {
        @java.lang.Override
        public ServiceDiscoveryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceDiscoveryBlockingStub(channel, callOptions);
        }
      };
    return ServiceDiscoveryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceDiscoveryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceDiscoveryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceDiscoveryFutureStub>() {
        @java.lang.Override
        public ServiceDiscoveryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceDiscoveryFutureStub(channel, callOptions);
        }
      };
    return ServiceDiscoveryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ========== Service Discovery ==========
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void registerService(com.nci.smartcity.DiscoveryServiceInfo request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.DiscoveryServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterServiceMethod(), responseObserver);
    }

    /**
     */
    default void discoverService(com.nci.smartcity.DiscoveryServiceRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.DiscoveryServiceInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDiscoverServiceMethod(), responseObserver);
    }

    /**
     */
    default void listServices(com.nci.smartcity.Empty request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.DiscoveryServiceList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListServicesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServiceDiscovery.
   * <pre>
   * ========== Service Discovery ==========
   * </pre>
   */
  public static abstract class ServiceDiscoveryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServiceDiscoveryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServiceDiscovery.
   * <pre>
   * ========== Service Discovery ==========
   * </pre>
   */
  public static final class ServiceDiscoveryStub
      extends io.grpc.stub.AbstractAsyncStub<ServiceDiscoveryStub> {
    private ServiceDiscoveryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceDiscoveryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceDiscoveryStub(channel, callOptions);
    }

    /**
     */
    public void registerService(com.nci.smartcity.DiscoveryServiceInfo request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.DiscoveryServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void discoverService(com.nci.smartcity.DiscoveryServiceRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.DiscoveryServiceInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDiscoverServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listServices(com.nci.smartcity.Empty request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.DiscoveryServiceList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListServicesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServiceDiscovery.
   * <pre>
   * ========== Service Discovery ==========
   * </pre>
   */
  public static final class ServiceDiscoveryBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServiceDiscoveryBlockingStub> {
    private ServiceDiscoveryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceDiscoveryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceDiscoveryBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nci.smartcity.DiscoveryServiceResponse registerService(com.nci.smartcity.DiscoveryServiceInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nci.smartcity.DiscoveryServiceInfo discoverService(com.nci.smartcity.DiscoveryServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDiscoverServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nci.smartcity.DiscoveryServiceList listServices(com.nci.smartcity.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListServicesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServiceDiscovery.
   * <pre>
   * ========== Service Discovery ==========
   * </pre>
   */
  public static final class ServiceDiscoveryFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServiceDiscoveryFutureStub> {
    private ServiceDiscoveryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceDiscoveryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceDiscoveryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nci.smartcity.DiscoveryServiceResponse> registerService(
        com.nci.smartcity.DiscoveryServiceInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nci.smartcity.DiscoveryServiceInfo> discoverService(
        com.nci.smartcity.DiscoveryServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDiscoverServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nci.smartcity.DiscoveryServiceList> listServices(
        com.nci.smartcity.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListServicesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_SERVICE = 0;
  private static final int METHODID_DISCOVER_SERVICE = 1;
  private static final int METHODID_LIST_SERVICES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_SERVICE:
          serviceImpl.registerService((com.nci.smartcity.DiscoveryServiceInfo) request,
              (io.grpc.stub.StreamObserver<com.nci.smartcity.DiscoveryServiceResponse>) responseObserver);
          break;
        case METHODID_DISCOVER_SERVICE:
          serviceImpl.discoverService((com.nci.smartcity.DiscoveryServiceRequest) request,
              (io.grpc.stub.StreamObserver<com.nci.smartcity.DiscoveryServiceInfo>) responseObserver);
          break;
        case METHODID_LIST_SERVICES:
          serviceImpl.listServices((com.nci.smartcity.Empty) request,
              (io.grpc.stub.StreamObserver<com.nci.smartcity.DiscoveryServiceList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRegisterServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nci.smartcity.DiscoveryServiceInfo,
              com.nci.smartcity.DiscoveryServiceResponse>(
                service, METHODID_REGISTER_SERVICE)))
        .addMethod(
          getDiscoverServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nci.smartcity.DiscoveryServiceRequest,
              com.nci.smartcity.DiscoveryServiceInfo>(
                service, METHODID_DISCOVER_SERVICE)))
        .addMethod(
          getListServicesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nci.smartcity.Empty,
              com.nci.smartcity.DiscoveryServiceList>(
                service, METHODID_LIST_SERVICES)))
        .build();
  }

  private static abstract class ServiceDiscoveryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceDiscoveryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nci.smartcity.Smartcity.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceDiscovery");
    }
  }

  private static final class ServiceDiscoveryFileDescriptorSupplier
      extends ServiceDiscoveryBaseDescriptorSupplier {
    ServiceDiscoveryFileDescriptorSupplier() {}
  }

  private static final class ServiceDiscoveryMethodDescriptorSupplier
      extends ServiceDiscoveryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceDiscoveryMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServiceDiscoveryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceDiscoveryFileDescriptorSupplier())
              .addMethod(getRegisterServiceMethod())
              .addMethod(getDiscoverServiceMethod())
              .addMethod(getListServicesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
