package com.nci.smartcity;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: smartcity.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PublicServiceGrpc {

  private PublicServiceGrpc() {}

  public static final String SERVICE_NAME = "PublicService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nci.smartcity.IssueReport,
      com.nci.smartcity.IssueResponse> getReportIssueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportIssue",
      requestType = com.nci.smartcity.IssueReport.class,
      responseType = com.nci.smartcity.IssueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nci.smartcity.IssueReport,
      com.nci.smartcity.IssueResponse> getReportIssueMethod() {
    io.grpc.MethodDescriptor<com.nci.smartcity.IssueReport, com.nci.smartcity.IssueResponse> getReportIssueMethod;
    if ((getReportIssueMethod = PublicServiceGrpc.getReportIssueMethod) == null) {
      synchronized (PublicServiceGrpc.class) {
        if ((getReportIssueMethod = PublicServiceGrpc.getReportIssueMethod) == null) {
          PublicServiceGrpc.getReportIssueMethod = getReportIssueMethod =
              io.grpc.MethodDescriptor.<com.nci.smartcity.IssueReport, com.nci.smartcity.IssueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportIssue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.IssueReport.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.IssueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PublicServiceMethodDescriptorSupplier("ReportIssue"))
              .build();
        }
      }
    }
    return getReportIssueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nci.smartcity.ServiceRequest,
      com.nci.smartcity.ServiceStatus> getGetServiceStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceStatus",
      requestType = com.nci.smartcity.ServiceRequest.class,
      responseType = com.nci.smartcity.ServiceStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nci.smartcity.ServiceRequest,
      com.nci.smartcity.ServiceStatus> getGetServiceStatusMethod() {
    io.grpc.MethodDescriptor<com.nci.smartcity.ServiceRequest, com.nci.smartcity.ServiceStatus> getGetServiceStatusMethod;
    if ((getGetServiceStatusMethod = PublicServiceGrpc.getGetServiceStatusMethod) == null) {
      synchronized (PublicServiceGrpc.class) {
        if ((getGetServiceStatusMethod = PublicServiceGrpc.getGetServiceStatusMethod) == null) {
          PublicServiceGrpc.getGetServiceStatusMethod = getGetServiceStatusMethod =
              io.grpc.MethodDescriptor.<com.nci.smartcity.ServiceRequest, com.nci.smartcity.ServiceStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.ServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.ServiceStatus.getDefaultInstance()))
              .setSchemaDescriptor(new PublicServiceMethodDescriptorSupplier("GetServiceStatus"))
              .build();
        }
      }
    }
    return getGetServiceStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nci.smartcity.ServiceStreamRequest,
      com.nci.smartcity.ServiceUpdate> getStreamServiceUpdatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamServiceUpdates",
      requestType = com.nci.smartcity.ServiceStreamRequest.class,
      responseType = com.nci.smartcity.ServiceUpdate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.nci.smartcity.ServiceStreamRequest,
      com.nci.smartcity.ServiceUpdate> getStreamServiceUpdatesMethod() {
    io.grpc.MethodDescriptor<com.nci.smartcity.ServiceStreamRequest, com.nci.smartcity.ServiceUpdate> getStreamServiceUpdatesMethod;
    if ((getStreamServiceUpdatesMethod = PublicServiceGrpc.getStreamServiceUpdatesMethod) == null) {
      synchronized (PublicServiceGrpc.class) {
        if ((getStreamServiceUpdatesMethod = PublicServiceGrpc.getStreamServiceUpdatesMethod) == null) {
          PublicServiceGrpc.getStreamServiceUpdatesMethod = getStreamServiceUpdatesMethod =
              io.grpc.MethodDescriptor.<com.nci.smartcity.ServiceStreamRequest, com.nci.smartcity.ServiceUpdate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamServiceUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.ServiceStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nci.smartcity.ServiceUpdate.getDefaultInstance()))
              .setSchemaDescriptor(new PublicServiceMethodDescriptorSupplier("StreamServiceUpdates"))
              .build();
        }
      }
    }
    return getStreamServiceUpdatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PublicServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublicServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PublicServiceStub>() {
        @java.lang.Override
        public PublicServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PublicServiceStub(channel, callOptions);
        }
      };
    return PublicServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PublicServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublicServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PublicServiceBlockingStub>() {
        @java.lang.Override
        public PublicServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PublicServiceBlockingStub(channel, callOptions);
        }
      };
    return PublicServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PublicServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublicServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PublicServiceFutureStub>() {
        @java.lang.Override
        public PublicServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PublicServiceFutureStub(channel, callOptions);
        }
      };
    return PublicServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PublicServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void reportIssue(com.nci.smartcity.IssueReport request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.IssueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportIssueMethod(), responseObserver);
    }

    /**
     */
    public void getServiceStatus(com.nci.smartcity.ServiceRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.ServiceStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceStatusMethod(), responseObserver);
    }

    /**
     */
    public void streamServiceUpdates(com.nci.smartcity.ServiceStreamRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.ServiceUpdate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamServiceUpdatesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReportIssueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.nci.smartcity.IssueReport,
                com.nci.smartcity.IssueResponse>(
                  this, METHODID_REPORT_ISSUE)))
          .addMethod(
            getGetServiceStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.nci.smartcity.ServiceRequest,
                com.nci.smartcity.ServiceStatus>(
                  this, METHODID_GET_SERVICE_STATUS)))
          .addMethod(
            getStreamServiceUpdatesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.nci.smartcity.ServiceStreamRequest,
                com.nci.smartcity.ServiceUpdate>(
                  this, METHODID_STREAM_SERVICE_UPDATES)))
          .build();
    }
  }

  /**
   */
  public static final class PublicServiceStub extends io.grpc.stub.AbstractAsyncStub<PublicServiceStub> {
    private PublicServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublicServiceStub(channel, callOptions);
    }

    /**
     */
    public void reportIssue(com.nci.smartcity.IssueReport request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.IssueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportIssueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getServiceStatus(com.nci.smartcity.ServiceRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.ServiceStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamServiceUpdates(com.nci.smartcity.ServiceStreamRequest request,
        io.grpc.stub.StreamObserver<com.nci.smartcity.ServiceUpdate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamServiceUpdatesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PublicServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PublicServiceBlockingStub> {
    private PublicServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublicServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nci.smartcity.IssueResponse reportIssue(com.nci.smartcity.IssueReport request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportIssueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nci.smartcity.ServiceStatus getServiceStatus(com.nci.smartcity.ServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.nci.smartcity.ServiceUpdate> streamServiceUpdates(
        com.nci.smartcity.ServiceStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamServiceUpdatesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PublicServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PublicServiceFutureStub> {
    private PublicServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublicServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nci.smartcity.IssueResponse> reportIssue(
        com.nci.smartcity.IssueReport request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportIssueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nci.smartcity.ServiceStatus> getServiceStatus(
        com.nci.smartcity.ServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REPORT_ISSUE = 0;
  private static final int METHODID_GET_SERVICE_STATUS = 1;
  private static final int METHODID_STREAM_SERVICE_UPDATES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PublicServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PublicServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REPORT_ISSUE:
          serviceImpl.reportIssue((com.nci.smartcity.IssueReport) request,
              (io.grpc.stub.StreamObserver<com.nci.smartcity.IssueResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_STATUS:
          serviceImpl.getServiceStatus((com.nci.smartcity.ServiceRequest) request,
              (io.grpc.stub.StreamObserver<com.nci.smartcity.ServiceStatus>) responseObserver);
          break;
        case METHODID_STREAM_SERVICE_UPDATES:
          serviceImpl.streamServiceUpdates((com.nci.smartcity.ServiceStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.nci.smartcity.ServiceUpdate>) responseObserver);
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

  private static abstract class PublicServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PublicServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nci.smartcity.Smartcity.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PublicService");
    }
  }

  private static final class PublicServiceFileDescriptorSupplier
      extends PublicServiceBaseDescriptorSupplier {
    PublicServiceFileDescriptorSupplier() {}
  }

  private static final class PublicServiceMethodDescriptorSupplier
      extends PublicServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PublicServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PublicServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PublicServiceFileDescriptorSupplier())
              .addMethod(getReportIssueMethod())
              .addMethod(getGetServiceStatusMethod())
              .addMethod(getStreamServiceUpdatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
