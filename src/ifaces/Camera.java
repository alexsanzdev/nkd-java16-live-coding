package ifaces;

public class Camera implements USB {

    private Object photo;

    @Override
    public void sendData(Object data) {
        photo = data;
    }

    @Override
    public Object getData() {
        return photo;
    }
}
