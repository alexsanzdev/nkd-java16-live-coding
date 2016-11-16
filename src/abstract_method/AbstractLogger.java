package abstract_method;

import java.util.logging.*;


public abstract class AbstractLogger implements Logger {

    @Override
    public void logInfo(String message) {
        logMessage("INFO: "+ message);
    }

    @Override
    public void logError(String message) {
        logMessage("ERROR: "+ message);
    }

    public abstract void logMessage(String message);
}
