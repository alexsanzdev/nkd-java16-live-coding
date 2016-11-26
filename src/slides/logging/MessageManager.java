package slides.logging;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MessageManager {

    private static final Logger log = Logger.getLogger(MessageManager.class.getName());

    public void start() {
        log.info("Starting service");
    }

    public void doOperation() {
        log.info("Running operation...");

        try {
            new ArrayList().get(10);
        } catch (Exception e) {
            log.log(Level.SEVERE, "Something wrong occured", e);
            throw e;
        }

        log.info("Operation completed succesfully");
    }

    public void stop() {
        log.info("Stopping service");
    }
}
