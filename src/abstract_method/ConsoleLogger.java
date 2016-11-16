package abstract_method;


public class ConsoleLogger extends AbstractLogger {

    @Override
    public void logMessage(String message) {
        System.out.println(message);
    }
}
