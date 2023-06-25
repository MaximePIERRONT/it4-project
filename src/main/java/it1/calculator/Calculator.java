package it1.calculator;

/**
 * Abstract base class for a Calculator that performs basic arithmetic operations.
 */
public abstract class Calculator {

    /**
     * Adds two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The sum of the two numbers.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts one number from another.
     *
     * @param a The number to be subtracted from.
     * @param b The number to subtract.
     * @return The result of subtracting b from a.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The product of the two numbers.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides one number by another.
     *
     * @param a The numerator.
     * @param b The denominator.
     * @return The result of dividing a by b.
     * @throws ArithmeticException if b is 0.
     */
    public double divide(double a, double b) {
        if(b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

