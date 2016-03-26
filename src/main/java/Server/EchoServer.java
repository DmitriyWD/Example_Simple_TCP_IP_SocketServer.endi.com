package Server;

import config.Config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class EchoServer {
    private Config cfg;


    public EchoServer(Config cfg) {
        this.cfg = cfg;
    }

    public void run() throws IOException {

        System.out.println("SERVER RUN");

        try (
                ServerSocket serverSocket =
                        new ServerSocket(cfg.getPortNumber());
                Socket clientSocket = serverSocket.accept();
                PrintWriter out =
                        new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
        ) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                out.println(inputLine);
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                    + cfg.getPortNumber() + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
}
