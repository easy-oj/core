package ac.eoj.proto.repos;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0-SNAPSHOT)",
    comments = "Source: repos.proto")
public final class ReposServiceGrpc {

  private ReposServiceGrpc() {}

  public static final String SERVICE_NAME = "repos.ReposService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ac.eoj.proto.repos.Repos.CreateRepoReq,
      ac.eoj.proto.repos.Repos.CreateRepoResp> getCreateRepoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRepo",
      requestType = ac.eoj.proto.repos.Repos.CreateRepoReq.class,
      responseType = ac.eoj.proto.repos.Repos.CreateRepoResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ac.eoj.proto.repos.Repos.CreateRepoReq,
      ac.eoj.proto.repos.Repos.CreateRepoResp> getCreateRepoMethod() {
    io.grpc.MethodDescriptor<ac.eoj.proto.repos.Repos.CreateRepoReq, ac.eoj.proto.repos.Repos.CreateRepoResp> getCreateRepoMethod;
    if ((getCreateRepoMethod = ReposServiceGrpc.getCreateRepoMethod) == null) {
      synchronized (ReposServiceGrpc.class) {
        if ((getCreateRepoMethod = ReposServiceGrpc.getCreateRepoMethod) == null) {
          ReposServiceGrpc.getCreateRepoMethod = getCreateRepoMethod = 
              io.grpc.MethodDescriptor.<ac.eoj.proto.repos.Repos.CreateRepoReq, ac.eoj.proto.repos.Repos.CreateRepoResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "repos.ReposService", "CreateRepo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ac.eoj.proto.repos.Repos.CreateRepoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ac.eoj.proto.repos.Repos.CreateRepoResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ReposServiceMethodDescriptorSupplier("CreateRepo"))
                  .build();
          }
        }
     }
     return getCreateRepoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ac.eoj.proto.repos.Repos.FetchRepoReq,
      ac.eoj.proto.repos.Repos.FetchRepoResp> getFetchRepoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchRepo",
      requestType = ac.eoj.proto.repos.Repos.FetchRepoReq.class,
      responseType = ac.eoj.proto.repos.Repos.FetchRepoResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ac.eoj.proto.repos.Repos.FetchRepoReq,
      ac.eoj.proto.repos.Repos.FetchRepoResp> getFetchRepoMethod() {
    io.grpc.MethodDescriptor<ac.eoj.proto.repos.Repos.FetchRepoReq, ac.eoj.proto.repos.Repos.FetchRepoResp> getFetchRepoMethod;
    if ((getFetchRepoMethod = ReposServiceGrpc.getFetchRepoMethod) == null) {
      synchronized (ReposServiceGrpc.class) {
        if ((getFetchRepoMethod = ReposServiceGrpc.getFetchRepoMethod) == null) {
          ReposServiceGrpc.getFetchRepoMethod = getFetchRepoMethod = 
              io.grpc.MethodDescriptor.<ac.eoj.proto.repos.Repos.FetchRepoReq, ac.eoj.proto.repos.Repos.FetchRepoResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "repos.ReposService", "FetchRepo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ac.eoj.proto.repos.Repos.FetchRepoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ac.eoj.proto.repos.Repos.FetchRepoResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ReposServiceMethodDescriptorSupplier("FetchRepo"))
                  .build();
          }
        }
     }
     return getFetchRepoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ac.eoj.proto.repos.Repos.UpdateRepoReq,
      ac.eoj.proto.repos.Repos.UpdateRepoResp> getUpdateRepoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRepo",
      requestType = ac.eoj.proto.repos.Repos.UpdateRepoReq.class,
      responseType = ac.eoj.proto.repos.Repos.UpdateRepoResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ac.eoj.proto.repos.Repos.UpdateRepoReq,
      ac.eoj.proto.repos.Repos.UpdateRepoResp> getUpdateRepoMethod() {
    io.grpc.MethodDescriptor<ac.eoj.proto.repos.Repos.UpdateRepoReq, ac.eoj.proto.repos.Repos.UpdateRepoResp> getUpdateRepoMethod;
    if ((getUpdateRepoMethod = ReposServiceGrpc.getUpdateRepoMethod) == null) {
      synchronized (ReposServiceGrpc.class) {
        if ((getUpdateRepoMethod = ReposServiceGrpc.getUpdateRepoMethod) == null) {
          ReposServiceGrpc.getUpdateRepoMethod = getUpdateRepoMethod = 
              io.grpc.MethodDescriptor.<ac.eoj.proto.repos.Repos.UpdateRepoReq, ac.eoj.proto.repos.Repos.UpdateRepoResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "repos.ReposService", "UpdateRepo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ac.eoj.proto.repos.Repos.UpdateRepoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ac.eoj.proto.repos.Repos.UpdateRepoResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ReposServiceMethodDescriptorSupplier("UpdateRepo"))
                  .build();
          }
        }
     }
     return getUpdateRepoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReposServiceStub newStub(io.grpc.Channel channel) {
    return new ReposServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReposServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReposServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReposServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReposServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ReposServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createRepo(ac.eoj.proto.repos.Repos.CreateRepoReq request,
        io.grpc.stub.StreamObserver<ac.eoj.proto.repos.Repos.CreateRepoResp> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateRepoMethod(), responseObserver);
    }

    /**
     */
    public void fetchRepo(ac.eoj.proto.repos.Repos.FetchRepoReq request,
        io.grpc.stub.StreamObserver<ac.eoj.proto.repos.Repos.FetchRepoResp> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchRepoMethod(), responseObserver);
    }

    /**
     */
    public void updateRepo(ac.eoj.proto.repos.Repos.UpdateRepoReq request,
        io.grpc.stub.StreamObserver<ac.eoj.proto.repos.Repos.UpdateRepoResp> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRepoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateRepoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ac.eoj.proto.repos.Repos.CreateRepoReq,
                ac.eoj.proto.repos.Repos.CreateRepoResp>(
                  this, METHODID_CREATE_REPO)))
          .addMethod(
            getFetchRepoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ac.eoj.proto.repos.Repos.FetchRepoReq,
                ac.eoj.proto.repos.Repos.FetchRepoResp>(
                  this, METHODID_FETCH_REPO)))
          .addMethod(
            getUpdateRepoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ac.eoj.proto.repos.Repos.UpdateRepoReq,
                ac.eoj.proto.repos.Repos.UpdateRepoResp>(
                  this, METHODID_UPDATE_REPO)))
          .build();
    }
  }

  /**
   */
  public static final class ReposServiceStub extends io.grpc.stub.AbstractStub<ReposServiceStub> {
    private ReposServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReposServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReposServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReposServiceStub(channel, callOptions);
    }

    /**
     */
    public void createRepo(ac.eoj.proto.repos.Repos.CreateRepoReq request,
        io.grpc.stub.StreamObserver<ac.eoj.proto.repos.Repos.CreateRepoResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateRepoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchRepo(ac.eoj.proto.repos.Repos.FetchRepoReq request,
        io.grpc.stub.StreamObserver<ac.eoj.proto.repos.Repos.FetchRepoResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchRepoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRepo(ac.eoj.proto.repos.Repos.UpdateRepoReq request,
        io.grpc.stub.StreamObserver<ac.eoj.proto.repos.Repos.UpdateRepoResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRepoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReposServiceBlockingStub extends io.grpc.stub.AbstractStub<ReposServiceBlockingStub> {
    private ReposServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReposServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReposServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReposServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ac.eoj.proto.repos.Repos.CreateRepoResp createRepo(ac.eoj.proto.repos.Repos.CreateRepoReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateRepoMethod(), getCallOptions(), request);
    }

    /**
     */
    public ac.eoj.proto.repos.Repos.FetchRepoResp fetchRepo(ac.eoj.proto.repos.Repos.FetchRepoReq request) {
      return blockingUnaryCall(
          getChannel(), getFetchRepoMethod(), getCallOptions(), request);
    }

    /**
     */
    public ac.eoj.proto.repos.Repos.UpdateRepoResp updateRepo(ac.eoj.proto.repos.Repos.UpdateRepoReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRepoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReposServiceFutureStub extends io.grpc.stub.AbstractStub<ReposServiceFutureStub> {
    private ReposServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReposServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReposServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReposServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ac.eoj.proto.repos.Repos.CreateRepoResp> createRepo(
        ac.eoj.proto.repos.Repos.CreateRepoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateRepoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ac.eoj.proto.repos.Repos.FetchRepoResp> fetchRepo(
        ac.eoj.proto.repos.Repos.FetchRepoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchRepoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ac.eoj.proto.repos.Repos.UpdateRepoResp> updateRepo(
        ac.eoj.proto.repos.Repos.UpdateRepoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRepoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_REPO = 0;
  private static final int METHODID_FETCH_REPO = 1;
  private static final int METHODID_UPDATE_REPO = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReposServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReposServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_REPO:
          serviceImpl.createRepo((ac.eoj.proto.repos.Repos.CreateRepoReq) request,
              (io.grpc.stub.StreamObserver<ac.eoj.proto.repos.Repos.CreateRepoResp>) responseObserver);
          break;
        case METHODID_FETCH_REPO:
          serviceImpl.fetchRepo((ac.eoj.proto.repos.Repos.FetchRepoReq) request,
              (io.grpc.stub.StreamObserver<ac.eoj.proto.repos.Repos.FetchRepoResp>) responseObserver);
          break;
        case METHODID_UPDATE_REPO:
          serviceImpl.updateRepo((ac.eoj.proto.repos.Repos.UpdateRepoReq) request,
              (io.grpc.stub.StreamObserver<ac.eoj.proto.repos.Repos.UpdateRepoResp>) responseObserver);
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

  private static abstract class ReposServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReposServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ac.eoj.proto.repos.Repos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReposService");
    }
  }

  private static final class ReposServiceFileDescriptorSupplier
      extends ReposServiceBaseDescriptorSupplier {
    ReposServiceFileDescriptorSupplier() {}
  }

  private static final class ReposServiceMethodDescriptorSupplier
      extends ReposServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReposServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReposServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReposServiceFileDescriptorSupplier())
              .addMethod(getCreateRepoMethod())
              .addMethod(getFetchRepoMethod())
              .addMethod(getUpdateRepoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
