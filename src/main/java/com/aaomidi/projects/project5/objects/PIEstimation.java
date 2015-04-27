package com.aaomidi.projects.project5.objects;

import lombok.Getter;

import java.util.HashSet;

public abstract class PIEstimation {
    public static HashSet<PIEstimation> methods = new HashSet<>();
    @Getter
    private final String name;

    public PIEstimation(String name) {
        this.name = name;
        PIEstimation.register(this);
    }

    public static void printEstimations(double cycles) {
        for (PIEstimation method : methods) {
            System.out.printf("The %s method estimated the value %.20f for %.0f cycles.\n", method.getName(), method.estimate(cycles), cycles);
        }
    }

    public static void register(PIEstimation piEstimation) {
        methods.add(piEstimation);
    }

    public abstract double estimate(double cycles);
}
