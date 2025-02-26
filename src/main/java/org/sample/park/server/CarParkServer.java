package org.sample.park.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class CarParkServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(5003)
                .addService(new CarParkServiceImpl())
                .build();

        server.start();

        // Server is kept alive for the client to communicate.
        server.awaitTermination();
    }
}
