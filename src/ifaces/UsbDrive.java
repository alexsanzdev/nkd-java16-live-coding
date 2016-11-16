package ifaces;

public class UsbDrive implements USB {

    private Object storage;

    @Override
    public void sendData(Object data) {
        storage = data;
    }

    @Override
    public Object getData() {
        return storage;
    }

}
