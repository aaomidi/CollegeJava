package com.aaomidi.projects.project3;

import com.aaomidi.classes.IProject;
import com.aaomidi.projects.project3.objects.Triangle;

import java.util.Scanner;

public class Project3 extends IProject {
    public Project3(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        double sideA, sideB, sideC;
        trace.say("Please enter the three sides of the triangle. Separate your entries with spaces.");
        sideA = scanner.nextDouble();
        sideB = scanner.nextDouble();
        sideC = scanner.nextDouble();
        try {
            Triangle triangle = new Triangle(sideA, sideB, sideC);
            trace.say(triangle.toString());
            trace.say(triangle.getTriangleType().toString());
        } catch (IllegalArgumentException ex) {
            trace.debug("Couldn't create a triangle with the given information:\n >Side 1: %f\n >Side 2: %f\n >Side 3: %f", sideA, sideB, sideC);
        }

    }

    @Override
    public void test(int count) {

    }
}
