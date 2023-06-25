package it1.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeometricCalculatorTest {
    GeometricCalculator calculator = new GeometricCalculator();

    @Test
    public void testCos() {
        assertEquals(1, calculator.cos(0), 0.001, "Expected cosine of 0 to be 1");
    }

    @Test
    public void testSin() {
        assertEquals(0, calculator.sin(0), 0.001, "Expected sine of 0 to be 0");
    }

    @Test
    public void testTan() {
        assertEquals(0, calculator.tan(0), 0.001, "Expected tangent of 0 to be 0");
    }

    @Test
    public void testPi() {
        assertEquals(Math.PI, calculator.pi(), 0.001, "Expected pi to be equal to Math.PI");
    }
}