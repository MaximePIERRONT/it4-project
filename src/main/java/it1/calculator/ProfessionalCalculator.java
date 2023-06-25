package it1.calculator;

public class ProfessionalCalculator extends BasicCalculator implements ScientificFeatures, GeometricFeatures {
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

    @Override
    public double square(double a) {
        return Math.pow(a, 2);
    }

    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double abs(double a) {
        return Math.abs(a);
    }

    @Override
    public double log(double a) {
        return Math.log(a);
    }

    @Override
    public double e() {
        return Math.E;
    }
}
