package it1.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfessionalCalculatorTest {
    ProfessionalCalculator calculator = new ProfessionalCalculator();

    @Test
    public void testSquare() {
        assertEquals(9, calculator.square(3), "Expected the square of 3 to be 9");
    }

    @Test
    public void testSqrt() {
        assertEquals(3, calculator.sqrt(9), 0.001, "Expected the square root of 9 to be 3");
    }

    @Test
    public void testAbsPositive() {
        assertEquals(3, calculator.abs(3), "Expected the absolute of 3 to be 3");
    }

    @Test
    public void testAbsNegative() {
        assertEquals(3, calculator.abs(-3), "Expected the absolute of -3 to be 3");
    }

    @Test
    public void testLog() {
        assertEquals(0, calculator.log(1), 0.001, "Expected the natural logarithm of 1 to be 0");
    }

    @Test
    public void testE() {
        assertEquals(Math.E, calculator.e(), 0.001, "Expected e to be equal to Math.E");
    }

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
