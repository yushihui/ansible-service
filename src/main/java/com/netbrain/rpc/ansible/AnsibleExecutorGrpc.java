package com.netbrain.rpc.ansible;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: Ansible.proto")
public final class AnsibleExecutorGrpc {

  private AnsibleExecutorGrpc() {}

  public static final String SERVICE_NAME = "com.netbrain.rpc.ansible.AnsibleExecutor";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.netbrain.rpc.ansible.AnsibleJob,
      com.netbrain.rpc.ansible.AnsibleJobResponse> METHOD_START_AUTO_MATION_JOB =
      io.grpc.MethodDescriptor.<com.netbrain.rpc.ansible.AnsibleJob, com.netbrain.rpc.ansible.AnsibleJobResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.netbrain.rpc.ansible.AnsibleExecutor", "StartAutoMationJob"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.netbrain.rpc.ansible.AnsibleJob.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.netbrain.rpc.ansible.AnsibleJobResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnsibleExecutorStub newStub(io.grpc.Channel channel) {
    return new AnsibleExecutorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnsibleExecutorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AnsibleExecutorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnsibleExecutorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AnsibleExecutorFutureStub(channel);
  }

  /**
   */
  public static abstract class AnsibleExecutorImplBase implements io.grpc.BindableService {

    /**
     */
    public void startAutoMationJob(com.netbrain.rpc.ansible.AnsibleJob request,
        io.grpc.stub.StreamObserver<com.netbrain.rpc.ansible.AnsibleJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_START_AUTO_MATION_JOB, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_START_AUTO_MATION_JOB,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.netbrain.rpc.ansible.AnsibleJob,
                com.netbrain.rpc.ansible.AnsibleJobResponse>(
                  this, METHODID_START_AUTO_MATION_JOB)))
          .build();
    }
  }

  /**
   */
  public static final class AnsibleExecutorStub extends io.grpc.stub.AbstractStub<AnsibleExecutorStub> {
    private AnsibleExecutorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnsibleExecutorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnsibleExecutorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnsibleExecutorStub(channel, callOptions);
    }

    /**
     */
    public void startAutoMationJob(com.netbrain.rpc.ansible.AnsibleJob request,
        io.grpc.stub.StreamObserver<com.netbrain.rpc.ansible.AnsibleJobResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_START_AUTO_MATION_JOB, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnsibleExecutorBlockingStub extends io.grpc.stub.AbstractStub<AnsibleExecutorBlockingStub> {
    private AnsibleExecutorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnsibleExecutorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnsibleExecutorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnsibleExecutorBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.netbrain.rpc.ansible.AnsibleJobResponse> startAutoMationJob(
        com.netbrain.rpc.ansible.AnsibleJob request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_START_AUTO_MATION_JOB, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnsibleExecutorFutureStub extends io.grpc.stub.AbstractStub<AnsibleExecutorFutureStub> {
    private AnsibleExecutorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnsibleExecutorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnsibleExecutorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnsibleExecutorFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_START_AUTO_MATION_JOB = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnsibleExecutorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnsibleExecutorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START_AUTO_MATION_JOB:
          serviceImpl.startAutoMationJob((com.netbrain.rpc.ansible.AnsibleJob) request,
              (io.grpc.stub.StreamObserver<com.netbrain.rpc.ansible.AnsibleJobResponse>) responseObserver);
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

  private static final class AnsibleExecutorDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.netbrain.rpc.ansible.AnsibleProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AnsibleExecutorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnsibleExecutorDescriptorSupplier())
              .addMethod(METHOD_START_AUTO_MATION_JOB)
              .build();
        }
      }
    }
    return result;
  }
}
