package live_coding.sockets;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 1616);
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(outputStream);

            writer.println("Hello!");
            writer.println("World!");

            writer.flush();

            writer.close();

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
