package live_coding.rmi.example_api;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface MessageBox extends Remote {

    String ping() throws RemoteException;

    int getMessageCount() throws RemoteException;

    boolean isEmpty() throws RemoteException;

    List<Message> getMessages() throws RemoteException;

    List<Message> getUnreadMessages() throws RemoteException;

    void addMessage(Message message) throws RemoteException;

}
