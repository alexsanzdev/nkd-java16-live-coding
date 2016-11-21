package slides.logging;

public class LogExample {

    public static void main(String[] args) {
        Service service = new Service();
        service.start();
        service.doOperation();
        service.stop();
    }
}
