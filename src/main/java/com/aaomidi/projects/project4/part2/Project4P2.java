package com.aaomidi.projects.project4.part2;

import com.aaomidi.classes.Project;
import com.aaomidi.projects.project4.part2.objects.Matrix;

import java.util.Scanner;

public class Project4P2 extends Project {
    public Project4P2(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    @Override
    public void execute() {
        trace.say("Enter the first 3x3 matrix.");
        Matrix m1 = getMatrix();
        trace.say("Enter the second 3x3 matrix.");
        Matrix m2 = getMatrix();
        Matrix m3 = m1.add(m2);
        trace.say("Adding your matrix together yielded the following result: ");
        trace.say(m3.toString());
    }

    private Matrix getMatrix() {
        Scanner scanner = new Scanner(System.in);

        double[][] data = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                data[i][j] = scanner.nextDouble();
            }
        }
        return new Matrix(data);
    }

    @Override
    public void test(int count) {

    }
}
