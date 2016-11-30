package live_coding.rmi.example_client;

import live_coding.rmi.example_api.Message;
import live_coding.rmi.example_api.MessageBox;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args) {

        try {

            Registry registry = LocateRegistry.getRegistry(1099);

            MessageBox box  = (MessageBox) registry.lookup("MBOX");

            System.out.println("Message count = " + box.getMessageCount());
            for (Message message : box.getMessages()) {
                System.out.println(message);
            }
            box.addMessage(new Message("Cesar", "Hola", "Hola amigo!"));


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
