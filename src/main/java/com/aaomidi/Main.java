package com.aaomidi;

import com.aaomidi.classes.Project;
import com.aaomidi.projects.project1.Project1;
import com.aaomidi.projects.project2.Project2;
import com.aaomidi.projects.project3.Project3;
import com.aaomidi.projects.project4.part1.Project4P1;
import com.aaomidi.projects.project4.part2.Project4P2;
import com.aaomidi.projects.project5.Project5;

import java.util.Calendar;

/**
 * Created by Amir on 2015-03-03.
 */
public class Main {

    public static void main(String[] args) {
        Project project1, project2, project3, project4P1, project4P2, project5;

        project1 = new Project1("Floating Box", 2015, Calendar.MARCH, 3);
        project2 = new Project2("Projectile", 2015, Calendar.APRIL, 10);
        project3 = new Project3("Triangles", 2015, Calendar.APRIL, 17);
        project4P1 = new Project4P1("Arrays and Sets", 2015, Calendar.APRIL, 24);
        project4P2 = new Project4P2("Matrices", 2015, Calendar.APRIL, 24);
        project5 = new Project5("PI Estimation", 2015, Calendar.APRIL, 27);

        project5.execute();
    }
}
