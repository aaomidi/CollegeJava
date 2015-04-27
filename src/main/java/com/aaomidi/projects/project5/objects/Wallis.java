package com.aaomidi.projects.project5.objects;

public class Wallis extends PIEstimation {

    public Wallis(String name) {
        super(name);
    }

    @Override
    public double estimate(double cycles) {
        double result = 1;
        int numerator = 0, denominator = 0;

        for (int i = 0; i < cycles; i++) {
            denominator = numerator + 1;

            if (i % 2 == 0) {
                numerator += 2;
            }

            result *= (double) numerator / (double) denominator;
        }

        return result * 2;
    }
}
