package live_coding.rmi.example_server;

import live_coding.rmi.example_api.MessageBox;
import live_coding.rmi.example_api.Message;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

    public static void main(String[] args) {
        runRegistry();

        try {

            MessageBox box = new MessageBoxImpl();
            box.addMessage(new Message("Rand", "Hej!", "Hej Alex"));

            Remote remoteBox = UnicastRemoteObject.exportObject(box, 0);
            LocateRegistry.getRegistry(1099).bind("MBOX", remoteBox);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void runRegistry() {
        try {
            LocateRegistry.createRegistry(1099);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
