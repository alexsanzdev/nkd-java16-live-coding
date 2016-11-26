package slides.logging;

import java.util.logging.Logger;

public class MatchEngine {

    private static final Logger log = Logger.getLogger(MatchEngine.class.getName());

    public String match(long price) {
        log.info("Matching with price: " + price);
        log.fine("Secret detail...");
        return "";
    }

}
