package wangluo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        socket.connect((new InetSocketAddress("127.0.0.1",9876)));
        Scanner scanner = new Scanner(System.in);
        while(true){
            String text = scanner.next();
            socket.getOutputStream().write(text.getBytes());
        }

    }

}
