package it1.calculator;

public class ScientificCalculator extends Calculator implements ScientificFeatures {
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
