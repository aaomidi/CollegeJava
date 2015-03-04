package com.aaomidi.projects.project1;

import com.aaomidi.classes.IProject;
import com.aaomidi.projects.project1.objects.FloatingBox;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Amir on 2015-03-03.
 */
public class Project1 extends IProject {

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        double length, width, height;

        trace.say("Please enter the length of the box.");
        length = scanner.nextDouble();

        trace.say("Please enter the width of the box.");
        width = scanner.nextDouble();

        trace.say("Please enter the height of the box.");
        height = scanner.nextDouble();

        try {
            FloatingBox b = new FloatingBox(length, width, height);

            trace.say(b.toString());
        } catch (IllegalArgumentException ex) {
            trace.debug("\nCould not create Box with given information:\n >Length: %d\n >Width: %d\n >Height: %d", length, width, height);
        }

    }

    @Override
    public void test(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int length = random.nextInt(101) - 50;
            int width = random.nextInt(101) - 50;
            int height = random.nextInt(101) - 50;

            try {
                trace.debug("((( Start Box");

                FloatingBox b = new FloatingBox(length, width, height);

                trace.debug("\n" + b.toString());
            } catch (IllegalArgumentException ex) {
                trace.debug("\nCould not create Box with given information:\n >Length: %d\n >Width: %d\n >Height: %d", length, width, height);
            }

        }
        trace.debug("End Box )))");
    }

}
