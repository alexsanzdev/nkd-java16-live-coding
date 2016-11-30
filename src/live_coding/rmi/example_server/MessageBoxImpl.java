package live_coding.rmi.example_server;

import live_coding.rmi.example_api.MessageBox;
import live_coding.rmi.example_api.Message;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class MessageBoxImpl implements MessageBox {

    private ArrayList<Message> messages = new ArrayList<>();

    @Override
    public String ping() throws RemoteException {
        System.out.println("PING!!!");
        return "PONG!!!";
    }

    @Override
    public int getMessageCount() {
        return messages.size();
    }

    @Override
    public boolean isEmpty() {
        return messages.isEmpty();
    }

    @Override
    public List<Message> getMessages() {
        return messages;
    }

    @Override
    public List<Message> getUnreadMessages() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void addMessage(Message message) {
        messages.add(message);
        System.out.println("Messaged added:");
        System.out.println(message);
        System.out.println("New message count = " + getMessageCount());
    }
}
