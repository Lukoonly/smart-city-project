package com.nci.smartcity;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ========== Parking Service ==========
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: smartcity.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ParkingServiceGrpc {

  private ParkingServiceGrpc() {}

  public static final String SERVICE_NAME = "ParkingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nci.smartcity.ParkingRequest,
      com.nci.smartcity.ParkingResponse> getFindAvailableParkingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAvailableParking",
      requestType = com.nci.smartcity.ParkingRequest.class,
      responseType = com.nci.smartcity.ParkingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nci.smartcity.ParkingRequest,
      com.nci.smartcity.ParkingResponse> getFindAvailableParkingMethod() {
    io.grpc.MethodDescriptor<com.nci.smartcity.ParkingRequest, com.nci.smartcity.ParkingResponse> getFindAvailableParkingMethod;
    if ((getFindAvailableParkingMethod = ParkingServiceGrpc.getFindAvailableParkingMethod) == null) {
      synchronized (ParkingServiceGrpc.class) {
        if ((getFindAvailableParkingMethod = ParkingServiceGrpc.getFindAvailableParkingMethod) == null) {
          ParkingServiceGrpc.getFindAvailableParkingMethod = getFindAvailableParkingMethod =
              io.grpc.MethodDescriptor.<com.nci.smartcity.ParkingRequest, com.nci.smartcity.ParkingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindAvailableParking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.ParkingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.ParkingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ParkingServiceMethodDescriptorSupplier("FindAvailableParking"))
              .build();
        }
      }
    }
    return getFindAvailableParkingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nci.smartcity.ParkingReservation,
      com.nci.smartcity.ParkingConfirmation> getReserveParkingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReserveParking",
      requestType = com.nci.smartcity.ParkingReservation.class,
      responseType = com.nci.smartcity.ParkingConfirmation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nci.smartcity.ParkingReservation,
      com.nci.smartcity.ParkingConfirmation> getReserveParkingMethod() {
    io.grpc.MethodDescriptor<com.nci.smartcity.ParkingReservation, com.nci.smartcity.ParkingConfirmation> getReserveParkingMethod;
    if ((getReserveParkingMethod = ParkingServiceGrpc.getReserveParkingMethod) == null) {
      synchronized (ParkingServiceGrpc.class) {
        if ((getReserveParkingMethod = ParkingServiceGrpc.getReserveParkingMethod) == null) {
          ParkingServiceGrpc.getReserveParkingMethod = getReserveParkingMethod =
              io.grpc.MethodDescriptor.<com.nci.smartcity.ParkingReservation, com.nci.smartcity.ParkingConfirmation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReserveParking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.ParkingReservation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.ParkingConfirmation.getDefaultInstance()))
              .setSchemaDescriptor(new ParkingServiceMethodDescriptorSupplier("ReserveParking"))
              .build();
        }
      }
    }
    return getReserveParkingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nci.smartcity.ParkingStreamRequest,
      com.nci.smartcity.ParkingUpdate> getStreamParkingUpdatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamParkingUpdates",
      requestType = com.nci.smartcity.ParkingStreamRequest.class,
      responseType = com.nci.smartcity.ParkingUpdate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.nci.smartcity.ParkingStreamRequest,
      com.nci.smartcity.ParkingUpdate> getStreamParkingUpdatesMethod() {
    io.grpc.MethodDescriptor<com.nci.smartcity.ParkingStreamRequest, com.nci.smartcity.ParkingUpdate> getStreamParkingUpdatesMethod;
    if ((getStreamParkingUpdatesMethod = ParkingServiceGrpc.getStreamParkingUpdatesMethod) == null) {
      synchronized (ParkingServiceGrpc.class) {
        if ((getStreamParkingUpdatesMethod = ParkingServiceGrpc.getStreamParkingUpdatesMethod) == null) {
          ParkingServiceGrpc.getStreamParkingUpdatesMethod = getStreamParkingUpdatesMethod =
              io.grpc.MethodDescriptor.<com.nci.smartcity.ParkingStreamRequest, com.nci.smartcity.ParkingUpdate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamParkingUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.ParkingStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.ParkingUpdate.getDefaultInstance()))
              .setSchemaDescriptor(new ParkingServiceMethodDescriptorSupplier("StreamParkingUpdates"))
              .build();
        }
      }
    }
    return getStreamParkingUpdatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParkingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParkingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParkingServiceStub>() {
        @java.lang.Override
        public ParkingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParkingServiceStub(channel, callOptions);
        }
      };
    return ParkingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParkingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParkingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParkingServiceBlockingStub>() {
        @java.lang.Override
        public ParkingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParkingServiceBlockingStub(channel, callOptions);
        }
      };
    return ParkingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParkingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParkingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParkingServiceFutureStub>() {
        @java.lang.Override
        public ParkingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParkingServiceFutureStub(channel, callOptions);
        }
      };
    return ParkingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ========== Parking Service ==========
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void findAvailableParking(com.nci.smartcity.ParkingRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.ParkingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAvailableParkingMethod(), responseObserver);
    }

    /**
     */
    default void reserveParking(com.nci.smartcity.ParkingReservation request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.ParkingConfirmation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReserveParkingMethod(), responseObserver);
    }

    /**
     */
    default void streamParkingUpdates(com.nci.smartcity.ParkingStreamRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.ParkingUpdate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamParkingUpdatesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ParkingService.
   * <pre>
   * ========== Parking Service ==========
   * </pre>
   */
  public static abstract class ParkingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ParkingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ParkingService.
   * <pre>
   * ========== Parking Service ==========
   * </pre>
   */
  public static final class ParkingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ParkingServiceStub> {
    private ParkingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParkingServiceStub(channel, callOptions);
    }

    /**
     */
    public void findAvailableParking(com.nci.smartcity.ParkingRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.ParkingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAvailableParkingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reserveParking(com.nci.smartcity.ParkingReservation request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.ParkingConfirmation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReserveParkingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamParkingUpdates(com.nci.smartcity.ParkingStreamRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.ParkingUpdate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamParkingUpdatesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ParkingService.
   * <pre>
   * ========== Parking Service ==========
   * </pre>
   */
  public static final class ParkingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ParkingServiceBlockingStub> {
    private ParkingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParkingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nci.smartcity.ParkingResponse findAvailableParking(com.nci.smartcity.ParkingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAvailableParkingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nci.smartcity.ParkingConfirmation reserveParking(com.nci.smartcity.ParkingReservation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReserveParkingMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.nci.smartcity.ParkingUpdate> streamParkingUpdates(
        com.nci.smartcity.ParkingStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamParkingUpdatesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ParkingService.
   * <pre>
   * ========== Parking Service ==========
   * </pre>
   */
  public static final class ParkingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ParkingServiceFutureStub> {
    private ParkingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParkingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nci.smartcity.ParkingResponse> findAvailableParking(
        com.nci.smartcity.ParkingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAvailableParkingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nci.smartcity.ParkingConfirmation> reserveParking(
        com.nci.smartcity.ParkingReservation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReserveParkingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_AVAILABLE_PARKING = 0;
  private static final int METHODID_RESERVE_PARKING = 1;
  private static final int METHODID_STREAM_PARKING_UPDATES = 2;

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
        case METHODID_FIND_AVAILABLE_PARKING:
          serviceImpl.findAvailableParking((com.nci.smartcity.ParkingRequest) request,
              (io.grpc.stub.StreamObserver<com.nci.smartcity.ParkingResponse>) responseObserver);
          break;
        case METHODID_RESERVE_PARKING:
          serviceImpl.reserveParking((com.nci.smartcity.ParkingReservation) request,
              (io.grpc.stub.StreamObserver<com.nci.smartcity.ParkingConfirmation>) responseObserver);
          break;
        case METHODID_STREAM_PARKING_UPDATES:
          serviceImpl.streamParkingUpdates((com.nci.smartcity.ParkingStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.nci.smartcity.ParkingUpdate>) responseObserver);
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
          getFindAvailableParkingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nci.smartcity.ParkingRequest,
              com.nci.smartcity.ParkingResponse>(
                service, METHODID_FIND_AVAILABLE_PARKING)))
        .addMethod(
          getReserveParkingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.nci.smartcity.ParkingReservation,
              com.nci.smartcity.ParkingConfirmation>(
                service, METHODID_RESERVE_PARKING)))
        .addMethod(
          getStreamParkingUpdatesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.nci.smartcity.ParkingStreamRequest,
              com.nci.smartcity.ParkingUpdate>(
                service, METHODID_STREAM_PARKING_UPDATES)))
        .build();
  }

  private static abstract class ParkingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ParkingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nci.smartcity.Smartcity.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ParkingService");
    }
  }

  private static final class ParkingServiceFileDescriptorSupplier
      extends ParkingServiceBaseDescriptorSupplier {
    ParkingServiceFileDescriptorSupplier() {}
  }

  private static final class ParkingServiceMethodDescriptorSupplier
      extends ParkingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ParkingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ParkingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ParkingServiceFileDescriptorSupplier())
              .addMethod(getFindAvailableParkingMethod())
              .addMethod(getReserveParkingMethod())
              .addMethod(getStreamParkingUpdatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
