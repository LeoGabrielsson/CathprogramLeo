package Client;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class C_Model {
    Socket socket;

    PrintWriter out;
    BufferedReader in;

    public C_Model(int port) {
        try {
            String ip = "10.80.46.42";
            //String ip = JOptionPane.showInputDialog("What IP do you want to connect to?");
            socket = new Socket(ip, port);
        } catch (IOException e) {
            System.err.println("Failed to connect to server");
            e.printStackTrace();
            System.exit(13);
        }
        System.out.println("Connection ready...");
    }


    public void getStream() {
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Streams ready...");
    }
}
