package com.aaomidi.projects.project5.objects;

public class Vieta extends PIEstimation {
    public Vieta(String name) {
        super(name);
    }

    @Override
    public double estimate(double cycles) {
        double numerator = 0, result = 1;

        for (int i = 0; i < cycles; i++) {
            numerator = Math.sqrt(2 + numerator);
            result *= numerator / 2;
        }
        return 2 / result;
    }
}
