package com.smartcity.traffic;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: traffic.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrafficManagementServiceGrpc {

  private TrafficManagementServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "TrafficManagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartcity.traffic.TrafficProto.TrafficReportRequest,
      com.smartcity.traffic.TrafficProto.TrafficReportResponse> getReportTrafficMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportTraffic",
      requestType = com.smartcity.traffic.TrafficProto.TrafficReportRequest.class,
      responseType = com.smartcity.traffic.TrafficProto.TrafficReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcity.traffic.TrafficProto.TrafficReportRequest,
      com.smartcity.traffic.TrafficProto.TrafficReportResponse> getReportTrafficMethod() {
    io.grpc.MethodDescriptor<com.smartcity.traffic.TrafficProto.TrafficReportRequest, com.smartcity.traffic.TrafficProto.TrafficReportResponse> getReportTrafficMethod;
    if ((getReportTrafficMethod = TrafficManagementServiceGrpc.getReportTrafficMethod) == null) {
      synchronized (TrafficManagementServiceGrpc.class) {
        if ((getReportTrafficMethod = TrafficManagementServiceGrpc.getReportTrafficMethod) == null) {
          TrafficManagementServiceGrpc.getReportTrafficMethod = getReportTrafficMethod =
              io.grpc.MethodDescriptor.<com.smartcity.traffic.TrafficProto.TrafficReportRequest, com.smartcity.traffic.TrafficProto.TrafficReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportTraffic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.traffic.TrafficProto.TrafficReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.traffic.TrafficProto.TrafficReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrafficManagementServiceMethodDescriptorSupplier("ReportTraffic"))
              .build();
        }
      }
    }
    return getReportTrafficMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartcity.traffic.TrafficProto.StatusRequest,
      com.smartcity.traffic.TrafficProto.TrafficStatus> getGetCurrentStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentStatus",
      requestType = com.smartcity.traffic.TrafficProto.StatusRequest.class,
      responseType = com.smartcity.traffic.TrafficProto.TrafficStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.smartcity.traffic.TrafficProto.StatusRequest,
      com.smartcity.traffic.TrafficProto.TrafficStatus> getGetCurrentStatusMethod() {
    io.grpc.MethodDescriptor<com.smartcity.traffic.TrafficProto.StatusRequest, com.smartcity.traffic.TrafficProto.TrafficStatus> getGetCurrentStatusMethod;
    if ((getGetCurrentStatusMethod = TrafficManagementServiceGrpc.getGetCurrentStatusMethod) == null) {
      synchronized (TrafficManagementServiceGrpc.class) {
        if ((getGetCurrentStatusMethod = TrafficManagementServiceGrpc.getGetCurrentStatusMethod) == null) {
          TrafficManagementServiceGrpc.getGetCurrentStatusMethod = getGetCurrentStatusMethod =
              io.grpc.MethodDescriptor.<com.smartcity.traffic.TrafficProto.StatusRequest, com.smartcity.traffic.TrafficProto.TrafficStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.traffic.TrafficProto.StatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.traffic.TrafficProto.TrafficStatus.getDefaultInstance()))
              .setSchemaDescriptor(new TrafficManagementServiceMethodDescriptorSupplier("GetCurrentStatus"))
              .build();
        }
      }
    }
    return getGetCurrentStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartcity.traffic.TrafficProto.TrafficReportRequest,
      com.smartcity.traffic.TrafficProto.TrafficSummary> getSendBatchReportsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendBatchReports",
      requestType = com.smartcity.traffic.TrafficProto.TrafficReportRequest.class,
      responseType = com.smartcity.traffic.TrafficProto.TrafficSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.smartcity.traffic.TrafficProto.TrafficReportRequest,
      com.smartcity.traffic.TrafficProto.TrafficSummary> getSendBatchReportsMethod() {
    io.grpc.MethodDescriptor<com.smartcity.traffic.TrafficProto.TrafficReportRequest, com.smartcity.traffic.TrafficProto.TrafficSummary> getSendBatchReportsMethod;
    if ((getSendBatchReportsMethod = TrafficManagementServiceGrpc.getSendBatchReportsMethod) == null) {
      synchronized (TrafficManagementServiceGrpc.class) {
        if ((getSendBatchReportsMethod = TrafficManagementServiceGrpc.getSendBatchReportsMethod) == null) {
          TrafficManagementServiceGrpc.getSendBatchReportsMethod = getSendBatchReportsMethod =
              io.grpc.MethodDescriptor.<com.smartcity.traffic.TrafficProto.TrafficReportRequest, com.smartcity.traffic.TrafficProto.TrafficSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendBatchReports"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.traffic.TrafficProto.TrafficReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.traffic.TrafficProto.TrafficSummary.getDefaultInstance()))
              .setSchemaDescriptor(new TrafficManagementServiceMethodDescriptorSupplier("SendBatchReports"))
              .build();
        }
      }
    }
    return getSendBatchReportsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartcity.traffic.TrafficProto.TrafficMessage,
      com.smartcity.traffic.TrafficProto.TrafficMessage> getTrafficChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrafficChat",
      requestType = com.smartcity.traffic.TrafficProto.TrafficMessage.class,
      responseType = com.smartcity.traffic.TrafficProto.TrafficMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.smartcity.traffic.TrafficProto.TrafficMessage,
      com.smartcity.traffic.TrafficProto.TrafficMessage> getTrafficChatMethod() {
    io.grpc.MethodDescriptor<com.smartcity.traffic.TrafficProto.TrafficMessage, com.smartcity.traffic.TrafficProto.TrafficMessage> getTrafficChatMethod;
    if ((getTrafficChatMethod = TrafficManagementServiceGrpc.getTrafficChatMethod) == null) {
      synchronized (TrafficManagementServiceGrpc.class) {
        if ((getTrafficChatMethod = TrafficManagementServiceGrpc.getTrafficChatMethod) == null) {
          TrafficManagementServiceGrpc.getTrafficChatMethod = getTrafficChatMethod =
              io.grpc.MethodDescriptor.<com.smartcity.traffic.TrafficProto.TrafficMessage, com.smartcity.traffic.TrafficProto.TrafficMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrafficChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.traffic.TrafficProto.TrafficMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.traffic.TrafficProto.TrafficMessage.getDefaultInstance()))
              .setSchemaDescriptor(new TrafficManagementServiceMethodDescriptorSupplier("TrafficChat"))
              .build();
        }
      }
    }
    return getTrafficChatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrafficManagementServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrafficManagementServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrafficManagementServiceStub>() {
        @java.lang.Override
        public TrafficManagementServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrafficManagementServiceStub(channel, callOptions);
        }
      };
    return TrafficManagementServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrafficManagementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrafficManagementServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrafficManagementServiceBlockingStub>() {
        @java.lang.Override
        public TrafficManagementServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrafficManagementServiceBlockingStub(channel, callOptions);
        }
      };
    return TrafficManagementServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrafficManagementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrafficManagementServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrafficManagementServiceFutureStub>() {
        @java.lang.Override
        public TrafficManagementServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrafficManagementServiceFutureStub(channel, callOptions);
        }
      };
    return TrafficManagementServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void reportTraffic(com.smartcity.traffic.TrafficProto.TrafficReportRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.traffic.TrafficProto.TrafficReportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportTrafficMethod(), responseObserver);
    }

    /**
     */
    default void getCurrentStatus(com.smartcity.traffic.TrafficProto.StatusRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.traffic.TrafficProto.TrafficStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentStatusMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.smartcity.traffic.TrafficProto.TrafficReportRequest> sendBatchReports(
        io.grpc.stub.StreamObserver<com.smartcity.traffic.TrafficProto.TrafficSummary> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendBatchReportsMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.smartcity.traffic.TrafficProto.TrafficMessage> trafficChat(
        io.grpc.stub.StreamObserver<com.smartcity.traffic.TrafficProto.TrafficMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getTrafficChatMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TrafficManagementService.
   */
  public static abstract class TrafficManagementServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TrafficManagementServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TrafficManagementService.
   */
  public static final class TrafficManagementServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TrafficManagementServiceStub> {
    private TrafficManagementServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficManagementServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrafficManagementServiceStub(channel, callOptions);
    }

    /**
     */
    public void reportTraffic(com.smartcity.traffic.TrafficProto.TrafficReportRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.traffic.TrafficProto.TrafficReportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportTrafficMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrentStatus(com.smartcity.traffic.TrafficProto.StatusRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.traffic.TrafficProto.TrafficStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetCurrentStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.smartcity.traffic.TrafficProto.TrafficReportRequest> sendBatchReports(
        io.grpc.stub.StreamObserver<com.smartcity.traffic.TrafficProto.TrafficSummary> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSendBatchReportsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.smartcity.traffic.TrafficProto.TrafficMessage> trafficChat(
        io.grpc.stub.StreamObserver<com.smartcity.traffic.TrafficProto.TrafficMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getTrafficChatMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TrafficManagementService.
   */
  public static final class TrafficManagementServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TrafficManagementServiceBlockingStub> {
    private TrafficManagementServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficManagementServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrafficManagementServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.smartcity.traffic.TrafficProto.TrafficReportResponse reportTraffic(com.smartcity.traffic.TrafficProto.TrafficReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportTrafficMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.smartcity.traffic.TrafficProto.TrafficStatus> getCurrentStatus(
        com.smartcity.traffic.TrafficProto.StatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetCurrentStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TrafficManagementService.
   */
  public static final class TrafficManagementServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TrafficManagementServiceFutureStub> {
    private TrafficManagementServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficManagementServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrafficManagementServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcity.traffic.TrafficProto.TrafficReportResponse> reportTraffic(
        com.smartcity.traffic.TrafficProto.TrafficReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportTrafficMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REPORT_TRAFFIC = 0;
  private static final int METHODID_GET_CURRENT_STATUS = 1;
  private static final int METHODID_SEND_BATCH_REPORTS = 2;
  private static final int METHODID_TRAFFIC_CHAT = 3;

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
        case METHODID_REPORT_TRAFFIC:
          serviceImpl.reportTraffic((com.smartcity.traffic.TrafficProto.TrafficReportRequest) request,
              (io.grpc.stub.StreamObserver<com.smartcity.traffic.TrafficProto.TrafficReportResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENT_STATUS:
          serviceImpl.getCurrentStatus((com.smartcity.traffic.TrafficProto.StatusRequest) request,
              (io.grpc.stub.StreamObserver<com.smartcity.traffic.TrafficProto.TrafficStatus>) responseObserver);
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
        case METHODID_SEND_BATCH_REPORTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendBatchReports(
              (io.grpc.stub.StreamObserver<com.smartcity.traffic.TrafficProto.TrafficSummary>) responseObserver);
        case METHODID_TRAFFIC_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.trafficChat(
              (io.grpc.stub.StreamObserver<com.smartcity.traffic.TrafficProto.TrafficMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getReportTrafficMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.smartcity.traffic.TrafficProto.TrafficReportRequest,
              com.smartcity.traffic.TrafficProto.TrafficReportResponse>(
                service, METHODID_REPORT_TRAFFIC)))
        .addMethod(
          getGetCurrentStatusMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.smartcity.traffic.TrafficProto.StatusRequest,
              com.smartcity.traffic.TrafficProto.TrafficStatus>(
                service, METHODID_GET_CURRENT_STATUS)))
        .addMethod(
          getSendBatchReportsMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.smartcity.traffic.TrafficProto.TrafficReportRequest,
              com.smartcity.traffic.TrafficProto.TrafficSummary>(
                service, METHODID_SEND_BATCH_REPORTS)))
        .addMethod(
          getTrafficChatMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.smartcity.traffic.TrafficProto.TrafficMessage,
              com.smartcity.traffic.TrafficProto.TrafficMessage>(
                service, METHODID_TRAFFIC_CHAT)))
        .build();
  }

  private static abstract class TrafficManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrafficManagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartcity.traffic.TrafficProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrafficManagementService");
    }
  }

  private static final class TrafficManagementServiceFileDescriptorSupplier
      extends TrafficManagementServiceBaseDescriptorSupplier {
    TrafficManagementServiceFileDescriptorSupplier() {}
  }

  private static final class TrafficManagementServiceMethodDescriptorSupplier
      extends TrafficManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TrafficManagementServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TrafficManagementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrafficManagementServiceFileDescriptorSupplier())
              .addMethod(getReportTrafficMethod())
              .addMethod(getGetCurrentStatusMethod())
              .addMethod(getSendBatchReportsMethod())
              .addMethod(getTrafficChatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
