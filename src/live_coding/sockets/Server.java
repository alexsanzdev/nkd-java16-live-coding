package live_coding.sockets;

import java.io.*;
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

                                    OutputStream outputStream = clientSocket.getOutputStream();
                                    PrintWriter writer = new PrintWriter(outputStream);

                                    BufferedReader reader = new BufferedReader(inputStreamReader);
                                    for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                                        System.out.println(line);
                                        writer.println("Message received: " + line);
                                        writer.flush();
                                        if (line.equals("exit")) {
                                            break;
                                        }
                                    }

                                    reader.close();
                                    writer.close();
                                    clientSocket.close();
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
