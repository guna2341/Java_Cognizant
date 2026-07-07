package org.example;

import org.slf4j.Logger;

public class App
{

    private static final Slfj4Logger logger = LoggerFactory.getLogger(App.class);
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        logger.trace("This is an trace message");
        logger.debug("This is an debug message");
        logger.info("This is an info message");
        logger.warn("This is an warning message");
        logger.error("This is an error message");
        logger.error("Exception", new ArithmeticException("Arithmetic Exception"));
    }
}
