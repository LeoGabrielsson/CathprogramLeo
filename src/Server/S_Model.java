package Server;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class S_Model {
    ServerSocket server;
    Socket client;

    PrintWriter out;
    BufferedReader in;

    public S_Model(int port) {
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            System.err.println("Failed to open serversocket.");
            e.printStackTrace();
        }
        System.out.println("Server started...");
    }

    public void sendHello(){
        JOptionPane.showMessageDialog(null, "hello this is the server");
    }
}
