package test.java;

import implementations.Logger;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTest {

    @Test
    public void checkSameInstance() {

        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();

        assertSame(obj1, obj2);
    }
}