package ac.eoj.proto.queue;

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
    comments = "Source: queue.proto")
public final class QueueServiceGrpc {

  private QueueServiceGrpc() {}

  public static final String SERVICE_NAME = "queue.QueueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ac.eoj.proto.queue.Queue.PutMessageReq,
      ac.eoj.proto.queue.Queue.PutMessageResp> getPutMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutMessage",
      requestType = ac.eoj.proto.queue.Queue.PutMessageReq.class,
      responseType = ac.eoj.proto.queue.Queue.PutMessageResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ac.eoj.proto.queue.Queue.PutMessageReq,
      ac.eoj.proto.queue.Queue.PutMessageResp> getPutMessageMethod() {
    io.grpc.MethodDescriptor<ac.eoj.proto.queue.Queue.PutMessageReq, ac.eoj.proto.queue.Queue.PutMessageResp> getPutMessageMethod;
    if ((getPutMessageMethod = QueueServiceGrpc.getPutMessageMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getPutMessageMethod = QueueServiceGrpc.getPutMessageMethod) == null) {
          QueueServiceGrpc.getPutMessageMethod = getPutMessageMethod = 
              io.grpc.MethodDescriptor.<ac.eoj.proto.queue.Queue.PutMessageReq, ac.eoj.proto.queue.Queue.PutMessageResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "queue.QueueService", "PutMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ac.eoj.proto.queue.Queue.PutMessageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ac.eoj.proto.queue.Queue.PutMessageResp.getDefaultInstance()))
                  .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("PutMessage"))
                  .build();
          }
        }
     }
     return getPutMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ac.eoj.proto.queue.Queue.GetMessageReq,
      ac.eoj.proto.queue.Queue.GetMessageResp> getGetMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMessage",
      requestType = ac.eoj.proto.queue.Queue.GetMessageReq.class,
      responseType = ac.eoj.proto.queue.Queue.GetMessageResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ac.eoj.proto.queue.Queue.GetMessageReq,
      ac.eoj.proto.queue.Queue.GetMessageResp> getGetMessageMethod() {
    io.grpc.MethodDescriptor<ac.eoj.proto.queue.Queue.GetMessageReq, ac.eoj.proto.queue.Queue.GetMessageResp> getGetMessageMethod;
    if ((getGetMessageMethod = QueueServiceGrpc.getGetMessageMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getGetMessageMethod = QueueServiceGrpc.getGetMessageMethod) == null) {
          QueueServiceGrpc.getGetMessageMethod = getGetMessageMethod = 
              io.grpc.MethodDescriptor.<ac.eoj.proto.queue.Queue.GetMessageReq, ac.eoj.proto.queue.Queue.GetMessageResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "queue.QueueService", "GetMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ac.eoj.proto.queue.Queue.GetMessageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ac.eoj.proto.queue.Queue.GetMessageResp.getDefaultInstance()))
                  .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("GetMessage"))
                  .build();
          }
        }
     }
     return getGetMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueueServiceStub newStub(io.grpc.Channel channel) {
    return new QueueServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueueServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueueServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class QueueServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void putMessage(ac.eoj.proto.queue.Queue.PutMessageReq request,
        io.grpc.stub.StreamObserver<ac.eoj.proto.queue.Queue.PutMessageResp> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMessageMethod(), responseObserver);
    }

    /**
     */
    public void getMessage(ac.eoj.proto.queue.Queue.GetMessageReq request,
        io.grpc.stub.StreamObserver<ac.eoj.proto.queue.Queue.GetMessageResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ac.eoj.proto.queue.Queue.PutMessageReq,
                ac.eoj.proto.queue.Queue.PutMessageResp>(
                  this, METHODID_PUT_MESSAGE)))
          .addMethod(
            getGetMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ac.eoj.proto.queue.Queue.GetMessageReq,
                ac.eoj.proto.queue.Queue.GetMessageResp>(
                  this, METHODID_GET_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class QueueServiceStub extends io.grpc.stub.AbstractStub<QueueServiceStub> {
    private QueueServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueueServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueueServiceStub(channel, callOptions);
    }

    /**
     */
    public void putMessage(ac.eoj.proto.queue.Queue.PutMessageReq request,
        io.grpc.stub.StreamObserver<ac.eoj.proto.queue.Queue.PutMessageResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMessage(ac.eoj.proto.queue.Queue.GetMessageReq request,
        io.grpc.stub.StreamObserver<ac.eoj.proto.queue.Queue.GetMessageResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class QueueServiceBlockingStub extends io.grpc.stub.AbstractStub<QueueServiceBlockingStub> {
    private QueueServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueueServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueueServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ac.eoj.proto.queue.Queue.PutMessageResp putMessage(ac.eoj.proto.queue.Queue.PutMessageReq request) {
      return blockingUnaryCall(
          getChannel(), getPutMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public ac.eoj.proto.queue.Queue.GetMessageResp getMessage(ac.eoj.proto.queue.Queue.GetMessageReq request) {
      return blockingUnaryCall(
          getChannel(), getGetMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class QueueServiceFutureStub extends io.grpc.stub.AbstractStub<QueueServiceFutureStub> {
    private QueueServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueueServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueueServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ac.eoj.proto.queue.Queue.PutMessageResp> putMessage(
        ac.eoj.proto.queue.Queue.PutMessageReq request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ac.eoj.proto.queue.Queue.GetMessageResp> getMessage(
        ac.eoj.proto.queue.Queue.GetMessageReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT_MESSAGE = 0;
  private static final int METHODID_GET_MESSAGE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueueServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueueServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT_MESSAGE:
          serviceImpl.putMessage((ac.eoj.proto.queue.Queue.PutMessageReq) request,
              (io.grpc.stub.StreamObserver<ac.eoj.proto.queue.Queue.PutMessageResp>) responseObserver);
          break;
        case METHODID_GET_MESSAGE:
          serviceImpl.getMessage((ac.eoj.proto.queue.Queue.GetMessageReq) request,
              (io.grpc.stub.StreamObserver<ac.eoj.proto.queue.Queue.GetMessageResp>) responseObserver);
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

  private static abstract class QueueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ac.eoj.proto.queue.Queue.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueueService");
    }
  }

  private static final class QueueServiceFileDescriptorSupplier
      extends QueueServiceBaseDescriptorSupplier {
    QueueServiceFileDescriptorSupplier() {}
  }

  private static final class QueueServiceMethodDescriptorSupplier
      extends QueueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueueServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueueServiceFileDescriptorSupplier())
              .addMethod(getPutMessageMethod())
              .addMethod(getGetMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
