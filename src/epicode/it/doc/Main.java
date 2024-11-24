package epicode.it.doc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        LOGGER.info("Logger mio");
        LOGGER.debug("Logger mio debug");
        LOGGER.trace("Logger mio trace");
    }
}
