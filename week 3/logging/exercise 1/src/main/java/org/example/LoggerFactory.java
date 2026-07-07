package org.example;

public class LoggerFactory {

    public static Slfj4Logger getLogger(Class<?> clazz) {
        return new Slfj4Logger(clazz);
    }
}
