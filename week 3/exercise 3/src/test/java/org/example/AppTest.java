package org.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAssertions() {
//        assertEquals
          assertEquals(10, 5 + 5);

//        assert not equals
          assertNotEquals(10, 10 + 15);

//        assert true
          assertTrue(-1 < 0);

//        assert false
          assertFalse(10 < 5);

//        assert null
          assertNull(null);

//        assert not null
          assertNotNull(new App());

//        assert same
          Object object = new Object();
          assertSame(object, object);

//        assert instance of
          assertInstanceOf(Object.class, object);

//        assert not same
          assertNotSame(new Object(), new Object());

//        assert throws
          assertThrows(ArithmeticException.class, () -> {
                throw new ArithmeticException();
          });

//        assert all
          assertAll(
                  () -> assertEquals(15, 10 + 5),
                  () -> assertNotEquals(10, 2 + 3)
          );

//        assert timeout
          assertTimeout(Duration.ofSeconds(2), () -> Thread.sleep(1000));
    }

}