package ac.eoj.proto.oss;

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
    comments = "Source: oss.proto")
public final class OSSServiceGrpc {

  private OSSServiceGrpc() {}

  public static final String SERVICE_NAME = "oss.OSSService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ac.eoj.proto.oss.OSS.GetObjectReq,
      ac.eoj.proto.oss.OSS.GetObjectResp> getGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObject",
      requestType = ac.eoj.proto.oss.OSS.GetObjectReq.class,
      responseType = ac.eoj.proto.oss.OSS.GetObjectResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ac.eoj.proto.oss.OSS.GetObjectReq,
      ac.eoj.proto.oss.OSS.GetObjectResp> getGetObjectMethod() {
    io.grpc.MethodDescriptor<ac.eoj.proto.oss.OSS.GetObjectReq, ac.eoj.proto.oss.OSS.GetObjectResp> getGetObjectMethod;
    if ((getGetObjectMethod = OSSServiceGrpc.getGetObjectMethod) == null) {
      synchronized (OSSServiceGrpc.class) {
        if ((getGetObjectMethod = OSSServiceGrpc.getGetObjectMethod) == null) {
          OSSServiceGrpc.getGetObjectMethod = getGetObjectMethod = 
              io.grpc.MethodDescriptor.<ac.eoj.proto.oss.OSS.GetObjectReq, ac.eoj.proto.oss.OSS.GetObjectResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "oss.OSSService", "GetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ac.eoj.proto.oss.OSS.GetObjectReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ac.eoj.proto.oss.OSS.GetObjectResp.getDefaultInstance()))
                  .setSchemaDescriptor(new OSSServiceMethodDescriptorSupplier("GetObject"))
                  .build();
          }
        }
     }
     return getGetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ac.eoj.proto.oss.OSS.PutObjectReq,
      ac.eoj.proto.oss.OSS.PutObjectResp> getPutObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutObject",
      requestType = ac.eoj.proto.oss.OSS.PutObjectReq.class,
      responseType = ac.eoj.proto.oss.OSS.PutObjectResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ac.eoj.proto.oss.OSS.PutObjectReq,
      ac.eoj.proto.oss.OSS.PutObjectResp> getPutObjectMethod() {
    io.grpc.MethodDescriptor<ac.eoj.proto.oss.OSS.PutObjectReq, ac.eoj.proto.oss.OSS.PutObjectResp> getPutObjectMethod;
    if ((getPutObjectMethod = OSSServiceGrpc.getPutObjectMethod) == null) {
      synchronized (OSSServiceGrpc.class) {
        if ((getPutObjectMethod = OSSServiceGrpc.getPutObjectMethod) == null) {
          OSSServiceGrpc.getPutObjectMethod = getPutObjectMethod = 
              io.grpc.MethodDescriptor.<ac.eoj.proto.oss.OSS.PutObjectReq, ac.eoj.proto.oss.OSS.PutObjectResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "oss.OSSService", "PutObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ac.eoj.proto.oss.OSS.PutObjectReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ac.eoj.proto.oss.OSS.PutObjectResp.getDefaultInstance()))
                  .setSchemaDescriptor(new OSSServiceMethodDescriptorSupplier("PutObject"))
                  .build();
          }
        }
     }
     return getPutObjectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OSSServiceStub newStub(io.grpc.Channel channel) {
    return new OSSServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OSSServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OSSServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OSSServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OSSServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class OSSServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getObject(ac.eoj.proto.oss.OSS.GetObjectReq request,
        io.grpc.stub.StreamObserver<ac.eoj.proto.oss.OSS.GetObjectResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetObjectMethod(), responseObserver);
    }

    /**
     */
    public void putObject(ac.eoj.proto.oss.OSS.PutObjectReq request,
        io.grpc.stub.StreamObserver<ac.eoj.proto.oss.OSS.PutObjectResp> responseObserver) {
      asyncUnimplementedUnaryCall(getPutObjectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ac.eoj.proto.oss.OSS.GetObjectReq,
                ac.eoj.proto.oss.OSS.GetObjectResp>(
                  this, METHODID_GET_OBJECT)))
          .addMethod(
            getPutObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ac.eoj.proto.oss.OSS.PutObjectReq,
                ac.eoj.proto.oss.OSS.PutObjectResp>(
                  this, METHODID_PUT_OBJECT)))
          .build();
    }
  }

  /**
   */
  public static final class OSSServiceStub extends io.grpc.stub.AbstractStub<OSSServiceStub> {
    private OSSServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OSSServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OSSServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OSSServiceStub(channel, callOptions);
    }

    /**
     */
    public void getObject(ac.eoj.proto.oss.OSS.GetObjectReq request,
        io.grpc.stub.StreamObserver<ac.eoj.proto.oss.OSS.GetObjectResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putObject(ac.eoj.proto.oss.OSS.PutObjectReq request,
        io.grpc.stub.StreamObserver<ac.eoj.proto.oss.OSS.PutObjectResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutObjectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OSSServiceBlockingStub extends io.grpc.stub.AbstractStub<OSSServiceBlockingStub> {
    private OSSServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OSSServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OSSServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OSSServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ac.eoj.proto.oss.OSS.GetObjectResp getObject(ac.eoj.proto.oss.OSS.GetObjectReq request) {
      return blockingUnaryCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public ac.eoj.proto.oss.OSS.PutObjectResp putObject(ac.eoj.proto.oss.OSS.PutObjectReq request) {
      return blockingUnaryCall(
          getChannel(), getPutObjectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OSSServiceFutureStub extends io.grpc.stub.AbstractStub<OSSServiceFutureStub> {
    private OSSServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OSSServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OSSServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OSSServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ac.eoj.proto.oss.OSS.GetObjectResp> getObject(
        ac.eoj.proto.oss.OSS.GetObjectReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ac.eoj.proto.oss.OSS.PutObjectResp> putObject(
        ac.eoj.proto.oss.OSS.PutObjectReq request) {
      return futureUnaryCall(
          getChannel().newCall(getPutObjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_OBJECT = 0;
  private static final int METHODID_PUT_OBJECT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OSSServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OSSServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_OBJECT:
          serviceImpl.getObject((ac.eoj.proto.oss.OSS.GetObjectReq) request,
              (io.grpc.stub.StreamObserver<ac.eoj.proto.oss.OSS.GetObjectResp>) responseObserver);
          break;
        case METHODID_PUT_OBJECT:
          serviceImpl.putObject((ac.eoj.proto.oss.OSS.PutObjectReq) request,
              (io.grpc.stub.StreamObserver<ac.eoj.proto.oss.OSS.PutObjectResp>) responseObserver);
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

  private static abstract class OSSServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OSSServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ac.eoj.proto.oss.OSS.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OSSService");
    }
  }

  private static final class OSSServiceFileDescriptorSupplier
      extends OSSServiceBaseDescriptorSupplier {
    OSSServiceFileDescriptorSupplier() {}
  }

  private static final class OSSServiceMethodDescriptorSupplier
      extends OSSServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OSSServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OSSServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OSSServiceFileDescriptorSupplier())
              .addMethod(getGetObjectMethod())
              .addMethod(getPutObjectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
