package slides.logging;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.LogManager;

public class LogExample {

    public static void main(String[] args) {
        setupLogging();

        Service service = new Service();
        service.start();
        service.doOperation();
        service.stop();
    }

    private static void setupLogging() {
        String loggingFilePath = "/Users/alex-training/IdeaProjects/java16-live-coding/logging.properties";
        try (FileInputStream fileInputStream = new FileInputStream(loggingFilePath)) {
            LogManager.getLogManager().readConfiguration(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Could not load log properties.", e);
        }
    }
}
