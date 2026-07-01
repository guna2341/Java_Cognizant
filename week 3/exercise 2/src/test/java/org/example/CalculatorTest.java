package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setupCalculator() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"5, 2, 3", "10, 4, 6", "-3, -2, -1"})
    public void testAdd(int expected, int num1, int num2) {
        assertEquals(expected, calculator.add(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({"5, 10, 5", "-2, -8, -6", "20, 50, 30"})
    public void testSub(int expected, int num1, int num2) {
        assertEquals(expected, calculator.subtract(num1, num2));
    }

    @TestFactory
    Stream<DynamicTest> multiplyTestFactory() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        return list.stream().map(x -> DynamicTest.dynamicTest(x + "*" + x, () -> assertEquals(x * x, calculator.multiply(x, x))));
    }

    @Test
    public void zeroDivisionTest() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }

    @TestFactory
    Stream<DynamicTest> divideTestFactory() {
        List<Integer> list = Arrays.asList(2, 3, 4, 5);
        return list.stream().map(x -> DynamicTest.dynamicTest(x + "/" + "2",
                () -> assertEquals((float)x/2, calculator.divide(x, 2))));
    }

}
