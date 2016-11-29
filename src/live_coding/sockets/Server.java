package live_coding.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket(1616);

            while(true) {

                Socket clientSocket = serverSocket.accept();

                new Thread(
                        new Runnable() {

                            public void run() {
                                try {
                                    InputStream inputStream = clientSocket.getInputStream();
                                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                                    BufferedReader reader = new BufferedReader(inputStreamReader);

                                    for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                                        System.out.println(line);
                                    }

                                    reader.close();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                        }
                ).start();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
