package com.netbrain.ansible.service.rpc;

import com.netbrain.rpc.ansible.AnsibleExecutorGrpc;
import com.netbrain.rpc.ansible.AnsibleJob;
import com.netbrain.rpc.ansible.AnsibleJobResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnsibleRpcClient {

    private static final Logger logger = Logger.getLogger(AnsibleRpcClient.class.getName());

    private final ManagedChannel channel;
    private final AnsibleExecutorGrpc.AnsibleExecutorBlockingStub blockingStub;

    public AnsibleRpcClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext()
                .build());


    }
    AnsibleRpcClient(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = AnsibleExecutorGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }


    public void startJob(AnsibleJob job) {
        logger.info("start job " + job.getName() + " ...");

        Iterator<AnsibleJobResponse> responses;
        try {
            responses= blockingStub.startAnsibleJob(job);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        while(responses.hasNext()){
            AnsibleJobResponse response = responses.next();
            logger.info("got msg " + response.getStatus() + " ..." + response.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        AnsibleRpcClient client = new AnsibleRpcClient("192.168.4.63", 50051);
        try {
            AnsibleJob job = AnsibleJob.newBuilder().setName("Ansible").setId(UUID.randomUUID().toString()).build();
            client.startJob(job);
        } finally {
            client.shutdown();
        }
    }
}