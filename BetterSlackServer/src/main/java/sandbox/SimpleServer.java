package sandbox;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SimpleServer {
    private ServerSocket serverSocket;
    private List<Socket> connectedClients = new ArrayList<>();
    private PrintWriter output;
    private BufferedReader input;
    private Thread acceptingThread;

    private boolean online;

    public boolean isOnline() {
        return online;
    }

    public void startServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("running");
        online = true;

//        acceptingThread = new Thread(() -> {
//        while (online) {
//            Socket clientSocket = serverSocket.accept();
//            connectedClients.add(clientSocket);
//
//            System.out.println("Client has been connected. " + "Users online: " + connectedClients.size());


//        input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//        output = new PrintWriter(clientSocket.getOutputStream(), true);
//
//        System.out.println("user connected");
//
//        while(true) {
//            String text = input.readLine();
//            if(text.toLowerCase().equals("quit")) break;
//            System.out.println(text);
//        }

//        output.println("Hello from server");


//        while (!clientSocket.isClosed()) {
//            clientSocket.isConnected();
//        }
//        System.out.println("client dissconnected");
        }
//    });
//
//
//
//}
}
