package WerewolfJudge.grpc;

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
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: game.proto")
public final class PlayerActionGrpc {

  private PlayerActionGrpc() {}

  public static final String SERVICE_NAME = "PlayerAction";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<WerewolfJudge.grpc.Game.ActionRequest,
      WerewolfJudge.grpc.Game.ActionResponse> getActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "action",
      requestType = WerewolfJudge.grpc.Game.ActionRequest.class,
      responseType = WerewolfJudge.grpc.Game.ActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<WerewolfJudge.grpc.Game.ActionRequest,
      WerewolfJudge.grpc.Game.ActionResponse> getActionMethod() {
    io.grpc.MethodDescriptor<WerewolfJudge.grpc.Game.ActionRequest, WerewolfJudge.grpc.Game.ActionResponse> getActionMethod;
    if ((getActionMethod = PlayerActionGrpc.getActionMethod) == null) {
      synchronized (PlayerActionGrpc.class) {
        if ((getActionMethod = PlayerActionGrpc.getActionMethod) == null) {
          PlayerActionGrpc.getActionMethod = getActionMethod =
              io.grpc.MethodDescriptor.<WerewolfJudge.grpc.Game.ActionRequest, WerewolfJudge.grpc.Game.ActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "action"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WerewolfJudge.grpc.Game.ActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WerewolfJudge.grpc.Game.ActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerActionMethodDescriptorSupplier("action"))
              .build();
        }
      }
    }
    return getActionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlayerActionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerActionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerActionStub>() {
        @java.lang.Override
        public PlayerActionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerActionStub(channel, callOptions);
        }
      };
    return PlayerActionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlayerActionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerActionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerActionBlockingStub>() {
        @java.lang.Override
        public PlayerActionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerActionBlockingStub(channel, callOptions);
        }
      };
    return PlayerActionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlayerActionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerActionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerActionFutureStub>() {
        @java.lang.Override
        public PlayerActionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerActionFutureStub(channel, callOptions);
        }
      };
    return PlayerActionFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PlayerActionImplBase implements io.grpc.BindableService {

    /**
     */
    public void action(WerewolfJudge.grpc.Game.ActionRequest request,
        io.grpc.stub.StreamObserver<WerewolfJudge.grpc.Game.ActionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                WerewolfJudge.grpc.Game.ActionRequest,
                WerewolfJudge.grpc.Game.ActionResponse>(
                  this, METHODID_ACTION)))
          .build();
    }
  }

  /**
   */
  public static final class PlayerActionStub extends io.grpc.stub.AbstractAsyncStub<PlayerActionStub> {
    private PlayerActionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerActionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerActionStub(channel, callOptions);
    }

    /**
     */
    public void action(WerewolfJudge.grpc.Game.ActionRequest request,
        io.grpc.stub.StreamObserver<WerewolfJudge.grpc.Game.ActionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PlayerActionBlockingStub extends io.grpc.stub.AbstractBlockingStub<PlayerActionBlockingStub> {
    private PlayerActionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerActionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerActionBlockingStub(channel, callOptions);
    }

    /**
     */
    public WerewolfJudge.grpc.Game.ActionResponse action(WerewolfJudge.grpc.Game.ActionRequest request) {
      return blockingUnaryCall(
          getChannel(), getActionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PlayerActionFutureStub extends io.grpc.stub.AbstractFutureStub<PlayerActionFutureStub> {
    private PlayerActionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerActionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerActionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<WerewolfJudge.grpc.Game.ActionResponse> action(
        WerewolfJudge.grpc.Game.ActionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PlayerActionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PlayerActionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTION:
          serviceImpl.action((WerewolfJudge.grpc.Game.ActionRequest) request,
              (io.grpc.stub.StreamObserver<WerewolfJudge.grpc.Game.ActionResponse>) responseObserver);
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

  private static abstract class PlayerActionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlayerActionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return WerewolfJudge.grpc.Game.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PlayerAction");
    }
  }

  private static final class PlayerActionFileDescriptorSupplier
      extends PlayerActionBaseDescriptorSupplier {
    PlayerActionFileDescriptorSupplier() {}
  }

  private static final class PlayerActionMethodDescriptorSupplier
      extends PlayerActionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PlayerActionMethodDescriptorSupplier(String methodName) {
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
      synchronized (PlayerActionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlayerActionFileDescriptorSupplier())
              .addMethod(getActionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
