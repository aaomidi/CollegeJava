package com.aaomidi;

import com.aaomidi.projects.project1.Project1;
import com.aaomidi.projects.project2.Project2;

import java.util.Calendar;

/**
 * Created by Amir on 2015-03-03.
 */
public class Main {

    public static void main(String[] args) {
        Project1 project1;
        Project2 project2;
        project1 = new Project1("Floating Box", 2015, Calendar.MARCH, 3);
        project2 = new Project2("Projectile", 2015, Calendar.APRIL, 10);

        project2.test(100);
    }
}
