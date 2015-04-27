package com.aaomidi.projects.project5;

import com.aaomidi.classes.IProject;
import com.aaomidi.projects.project5.objects.PIEstimation;
import com.aaomidi.projects.project5.objects.Vieta;
import com.aaomidi.projects.project5.objects.Wallis;

import java.util.Scanner;

public class Project5 extends IProject {
    public Project5(String name, int year, int month, int day) {
        super(name, year, month, day);
        PIEstimation vieta = new Vieta("Vieta");
        PIEstimation wallis = new Wallis("Wallis");
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        trace.say("Please enter the number of cycles you want the Vieta and Wallis PI Estimation method to calculate.");
        double cycle = scanner.nextDouble();

        PIEstimation.printEstimations(cycle);
    }

    @Override
    public void test(int count) {

    }
}
