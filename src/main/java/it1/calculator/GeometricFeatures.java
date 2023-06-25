package it1.calculator;

public interface GeometricFeatures {
    /**
     * Calculates the cosine of a number.
     * @param a The number for which to calculate the cosine.
     * @return The cosine of the number.
     */
    double cos(double a);

    /**
     * Calculates the sine of a number.
     * @param a The number for which to calculate the sine.
     * @return The sine of the number.
     */
    double sin(double a);

    /**
     * Calculates the tangent of a number.
     * @param a The number for which to calculate the tangent.
     * @return The tangent of the number.
     */
    double tan(double a);

    /**
     * Returns the mathematical constant pi.
     * @return The value of pi.
     */
    double pi();
}

