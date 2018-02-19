package log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bar {
    static final Logger logger = LogManager.getLogger(Bar.class.getName());

    public boolean doIt() {
        //logger.entry();
        logger.trace("Exiting bar.");
        logger.error("Did it again!");
        return false;
    }
}
