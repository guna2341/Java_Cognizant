package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slfj4Logger {

    private final Logger logger;

    public Slfj4Logger(Class<?> clazz) {
        this.logger = LoggerFactory.getLogger(clazz);
    }

    public void trace(String msg) {
        logger.trace(msg);
    }

    public void debug(String msg) {
        logger.debug(msg);
    }

    public void info(String msg) {
        logger.info(msg);
    }

    public void warn(String msg) {
        logger.warn(msg);
    }

    public void error(String msg) {
        logger.error(msg);
    }

    public void error(String message, Throwable throwable) {
        logger.error(message, throwable);
    }

}
