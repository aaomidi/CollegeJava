package com.aaomidi.projects.project2;

import com.aaomidi.classes.IProject;
import com.aaomidi.projects.project2.objects.Projectile;

import java.util.Random;
import java.util.Scanner;

public class Project2 extends IProject {

    public Project2(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        double thrownAngle, initialVelocity;

        trace.say("Please enter the angle which the projectile was thrown.\nThis value should be between 0 and 90 degrees.");
        thrownAngle = scanner.nextDouble();

        trace.say("Please enter the initial velocity of the projectile.\nThis value should be non-negative.");
        initialVelocity = scanner.nextDouble();
        try {
            Projectile projectile = new Projectile(thrownAngle, initialVelocity);
            trace.say(projectile.toString());
        } catch (IllegalArgumentException ex) {
            trace.debug("Couldn't create a projectile with the given information:\n >Thrown Angle: %f\n > Initial Velocity: %f", thrownAngle, initialVelocity);
        }
    }

    @Override
    public void test(int count) {
        Random random = new Random();
        trace.debug("DEBUG START");
        for (int i = 0; i < count; i++) {
            int angle = random.nextInt(181) - 90;
            int velocity = random.nextInt(21) - 10;

            try {
                trace.debug("((( Start Projectile");

                Projectile projectile = new Projectile(angle, velocity);

                trace.debug(projectile.toString());
            } catch (IllegalArgumentException ex) {
                trace.debug("Couldn't create a projectile with the given information:\n >Thrown Angle: %d\n > Initial Velocity: %d", angle, velocity);
            }
            trace.debug("End Projectile )))");
        }
        trace.debug("DEBUG END");
    }
}
