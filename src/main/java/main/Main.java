package main;

import Server.EchoServer;
import config.Config;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        Config cfg = new Config("localhost", 8080);
        EchoServer server = new EchoServer(cfg);

        server.run();
    }

}
