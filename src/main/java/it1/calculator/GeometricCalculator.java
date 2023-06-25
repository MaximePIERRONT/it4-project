package it1.calculator;

public class GeometricCalculator extends BasicCalculator implements GeometricFeatures {
    @Override
    public double cos(double a) {
        return Math.cos(a);
    }

    @Override
    public double sin(double a) {
        return Math.sin(a);
    }

    @Override
    public double tan(double a) {
        return Math.tan(a);
    }

    @Override
    public double pi() {
        return Math.PI;
    }
}
