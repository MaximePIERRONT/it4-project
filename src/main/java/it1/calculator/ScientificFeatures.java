package it1.calculator;

public interface ScientificFeatures {
    /**
     * Calculates the square of a number.
     * @param a The number to be squared.
     * @return The square of the number.
     */
    double square(double a);

    /**
     * Calculates the square root of a number.
     * @param a The number for which to calculate the square root.
     * @return The square root of the number.
     */
    double sqrt(double a);

    /**
     * Calculates the absolute value of a number.
     * @param a The number for which to calculate the absolute value.
     * @return The absolute value of the number.
     */
    double abs(double a);

    /**
     * Calculates the natural logarithm of a number.
     * @param a The number for which to calculate the natural logarithm.
     * @return The natural logarithm of the number.
     */
    double log(double a);

    /**
     * Returns the mathematical constant e.
     * @return The value of e.
     */
    double e();
}