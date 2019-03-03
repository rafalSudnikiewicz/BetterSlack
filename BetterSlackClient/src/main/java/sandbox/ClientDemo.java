package sandbox;

import java.io.IOException;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        SimpleClient client = new SimpleClient();
        client.connectToServer("192.168.1.74",55555);
//        client.connectToServer("127.0.0.1",55555);



//        client.disconnect();
    }
}
