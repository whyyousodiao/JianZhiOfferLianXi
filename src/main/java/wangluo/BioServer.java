package wangluo;

import sun.reflect.generics.tree.Tree;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class BioServer {

    public static void main(String[] args) throws IOException {
        byte[] bs = new byte[1024];
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress(9876));

        while(true){
            System.out.println("wait connection");
            Socket socket = serverSocket.accept();
            System.out.println("connection established");
            Thread thread = new Thread(new ExecuteSocket(socket));
            thread.start();

        }


    }

    static class ExecuteSocket implements Runnable{
        byte[] bs = new byte[1024];
        Socket socket;
        public ExecuteSocket(Socket socket){
            this.socket = socket;
        }
        @Override
        public void run() {
            try {
                socket.getInputStream().read(bs);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
