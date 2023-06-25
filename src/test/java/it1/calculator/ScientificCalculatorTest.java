package it1.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {
    ScientificCalculator calculator = new ScientificCalculator();

    @Test
    public void testSquare() {
        assertEquals(9, calculator.square(3), 0.001);
    }

    @Test
    public void testSqrt() {
        assertEquals(2, calculator.sqrt(4), 0.001);
    }

    @Test
    public void testAbs() {
        assertEquals(5, calculator.abs(-5), 0.001);
    }

    @Test
    public void testAbsZero() {
        assertEquals(0, calculator.abs(0), 0.001);
    }

    @Test
    public void testLog() {
        assertEquals(1, calculator.log(Math.E), 0.001);
    }

    @Test
    public void testLogOne() {
        assertEquals(0, calculator.log(1), 0.001);
    }

    @Test
    public void testE() {
        assertEquals(Math.E, calculator.e(), 0.001);
    }
}
