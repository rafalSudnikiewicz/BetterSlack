import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class SimpleServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter output;
    private BufferedReader input;

    public void startServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("running");
        clientSocket = serverSocket.accept();

        input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        output = new PrintWriter(clientSocket.getOutputStream(), true);

        System.out.println("user connected");

        while(true) {
            String text = input.readLine();
            if(text.toLowerCase().equals("quit")) break;
            System.out.println(text);
        }

//        output.println("Hello from server");




//        while (!clientSocket.isClosed()) {
//            clientSocket.isConnected();
//        }
//        System.out.println("client dissconnected");
    }

}
