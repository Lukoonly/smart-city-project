package com.nci.smartcity;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: smartcity.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrafficServiceGrpc {

  private TrafficServiceGrpc() {}

  public static final String SERVICE_NAME = "TrafficService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nci.smartcity.TrafficRequest,
      com.nci.smartcity.TrafficResponse> getGetTrafficDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTrafficData",
      requestType = com.nci.smartcity.TrafficRequest.class,
      responseType = com.nci.smartcity.TrafficResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nci.smartcity.TrafficRequest,
      com.nci.smartcity.TrafficResponse> getGetTrafficDataMethod() {
    io.grpc.MethodDescriptor<com.nci.smartcity.TrafficRequest, com.nci.smartcity.TrafficResponse> getGetTrafficDataMethod;
    if ((getGetTrafficDataMethod = TrafficServiceGrpc.getGetTrafficDataMethod) == null) {
      synchronized (TrafficServiceGrpc.class) {
        if ((getGetTrafficDataMethod = TrafficServiceGrpc.getGetTrafficDataMethod) == null) {
          TrafficServiceGrpc.getGetTrafficDataMethod = getGetTrafficDataMethod =
              io.grpc.MethodDescriptor.<com.nci.smartcity.TrafficRequest, com.nci.smartcity.TrafficResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTrafficData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.TrafficRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.TrafficResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrafficServiceMethodDescriptorSupplier("GetTrafficData"))
              .build();
        }
      }
    }
    return getGetTrafficDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nci.smartcity.TrafficLightRequest,
      com.nci.smartcity.TrafficLightResponse> getAdjustTrafficLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustTrafficLights",
      requestType = com.nci.smartcity.TrafficLightRequest.class,
      responseType = com.nci.smartcity.TrafficLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nci.smartcity.TrafficLightRequest,
      com.nci.smartcity.TrafficLightResponse> getAdjustTrafficLightsMethod() {
    io.grpc.MethodDescriptor<com.nci.smartcity.TrafficLightRequest, com.nci.smartcity.TrafficLightResponse> getAdjustTrafficLightsMethod;
    if ((getAdjustTrafficLightsMethod = TrafficServiceGrpc.getAdjustTrafficLightsMethod) == null) {
      synchronized (TrafficServiceGrpc.class) {
        if ((getAdjustTrafficLightsMethod = TrafficServiceGrpc.getAdjustTrafficLightsMethod) == null) {
          TrafficServiceGrpc.getAdjustTrafficLightsMethod = getAdjustTrafficLightsMethod =
              io.grpc.MethodDescriptor.<com.nci.smartcity.TrafficLightRequest, com.nci.smartcity.TrafficLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdjustTrafficLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.TrafficLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.TrafficLightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrafficServiceMethodDescriptorSupplier("AdjustTrafficLights"))
              .build();
        }
      }
    }
    return getAdjustTrafficLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nci.smartcity.TrafficStreamRequest,
      com.nci.smartcity.TrafficUpdate> getStreamTrafficUpdatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamTrafficUpdates",
      requestType = com.nci.smartcity.TrafficStreamRequest.class,
      responseType = com.nci.smartcity.TrafficUpdate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.nci.smartcity.TrafficStreamRequest,
      com.nci.smartcity.TrafficUpdate> getStreamTrafficUpdatesMethod() {
    io.grpc.MethodDescriptor<com.nci.smartcity.TrafficStreamRequest, com.nci.smartcity.TrafficUpdate> getStreamTrafficUpdatesMethod;
    if ((getStreamTrafficUpdatesMethod = TrafficServiceGrpc.getStreamTrafficUpdatesMethod) == null) {
      synchronized (TrafficServiceGrpc.class) {
        if ((getStreamTrafficUpdatesMethod = TrafficServiceGrpc.getStreamTrafficUpdatesMethod) == null) {
          TrafficServiceGrpc.getStreamTrafficUpdatesMethod = getStreamTrafficUpdatesMethod =
              io.grpc.MethodDescriptor.<com.nci.smartcity.TrafficStreamRequest, com.nci.smartcity.TrafficUpdate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamTrafficUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.TrafficStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.TrafficUpdate.getDefaultInstance()))
              .setSchemaDescriptor(new TrafficServiceMethodDescriptorSupplier("StreamTrafficUpdates"))
              .build();
        }
      }
    }
    return getStreamTrafficUpdatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrafficServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrafficServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrafficServiceStub>() {
        @java.lang.Override
        public TrafficServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrafficServiceStub(channel, callOptions);
        }
      };
    return TrafficServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrafficServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrafficServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrafficServiceBlockingStub>() {
        @java.lang.Override
        public TrafficServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrafficServiceBlockingStub(channel, callOptions);
        }
      };
    return TrafficServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrafficServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrafficServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrafficServiceFutureStub>() {
        @java.lang.Override
        public TrafficServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrafficServiceFutureStub(channel, callOptions);
        }
      };
    return TrafficServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TrafficServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTrafficData(com.nci.smartcity.TrafficRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.TrafficResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTrafficDataMethod(), responseObserver);
    }

    /**
     */
    public void adjustTrafficLights(com.nci.smartcity.TrafficLightRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.TrafficLightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAdjustTrafficLightsMethod(), responseObserver);
    }

    /**
     */
    public void streamTrafficUpdates(com.nci.smartcity.TrafficStreamRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.TrafficUpdate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamTrafficUpdatesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTrafficDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.nci.smartcity.TrafficRequest,
                com.nci.smartcity.TrafficResponse>(
                  this, METHODID_GET_TRAFFIC_DATA)))
          .addMethod(
            getAdjustTrafficLightsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.nci.smartcity.TrafficLightRequest,
                com.nci.smartcity.TrafficLightResponse>(
                  this, METHODID_ADJUST_TRAFFIC_LIGHTS)))
          .addMethod(
            getStreamTrafficUpdatesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.nci.smartcity.TrafficStreamRequest,
                com.nci.smartcity.TrafficUpdate>(
                  this, METHODID_STREAM_TRAFFIC_UPDATES)))
          .build();
    }
  }

  /**
   */
  public static final class TrafficServiceStub extends io.grpc.stub.AbstractAsyncStub<TrafficServiceStub> {
    private TrafficServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrafficServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTrafficData(com.nci.smartcity.TrafficRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.TrafficResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTrafficDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void adjustTrafficLights(com.nci.smartcity.TrafficLightRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.TrafficLightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAdjustTrafficLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamTrafficUpdates(com.nci.smartcity.TrafficStreamRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.TrafficUpdate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamTrafficUpdatesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrafficServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TrafficServiceBlockingStub> {
    private TrafficServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrafficServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nci.smartcity.TrafficResponse getTrafficData(com.nci.smartcity.TrafficRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTrafficDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nci.smartcity.TrafficLightResponse adjustTrafficLights(com.nci.smartcity.TrafficLightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAdjustTrafficLightsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.nci.smartcity.TrafficUpdate> streamTrafficUpdates(
        com.nci.smartcity.TrafficStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamTrafficUpdatesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrafficServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TrafficServiceFutureStub> {
    private TrafficServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrafficServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nci.smartcity.TrafficResponse> getTrafficData(
        com.nci.smartcity.TrafficRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTrafficDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nci.smartcity.TrafficLightResponse> adjustTrafficLights(
        com.nci.smartcity.TrafficLightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAdjustTrafficLightsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TRAFFIC_DATA = 0;
  private static final int METHODID_ADJUST_TRAFFIC_LIGHTS = 1;
  private static final int METHODID_STREAM_TRAFFIC_UPDATES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrafficServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrafficServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TRAFFIC_DATA:
          serviceImpl.getTrafficData((com.nci.smartcity.TrafficRequest) request,
              (io.grpc.stub.StreamObserver<com.nci.smartcity.TrafficResponse>) responseObserver);
          break;
        case METHODID_ADJUST_TRAFFIC_LIGHTS:
          serviceImpl.adjustTrafficLights((com.nci.smartcity.TrafficLightRequest) request,
              (io.grpc.stub.StreamObserver<com.nci.smartcity.TrafficLightResponse>) responseObserver);
          break;
        case METHODID_STREAM_TRAFFIC_UPDATES:
          serviceImpl.streamTrafficUpdates((com.nci.smartcity.TrafficStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.nci.smartcity.TrafficUpdate>) responseObserver);
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

  private static abstract class TrafficServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrafficServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nci.smartcity.Smartcity.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrafficService");
    }
  }

  private static final class TrafficServiceFileDescriptorSupplier
      extends TrafficServiceBaseDescriptorSupplier {
    TrafficServiceFileDescriptorSupplier() {}
  }

  private static final class TrafficServiceMethodDescriptorSupplier
      extends TrafficServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrafficServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrafficServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrafficServiceFileDescriptorSupplier())
              .addMethod(getGetTrafficDataMethod())
              .addMethod(getAdjustTrafficLightsMethod())
              .addMethod(getStreamTrafficUpdatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
