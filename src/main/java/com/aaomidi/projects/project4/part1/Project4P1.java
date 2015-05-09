package com.aaomidi.projects.project4.part1;

import com.aaomidi.classes.Project;
import com.aaomidi.projects.project4.part1.objects.Sets;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Amir on 2015-04-18.
 */
public class Project4P1 extends Project {
    Scanner scanner = new Scanner(System.in);

    public Project4P1(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    @Override
    public void execute() {
        trace.say("Please enter the contents of the first stack. Enter Q when done.");
        HashSet<Integer> set1 = fillArray();
        trace.say("Please enter the contents of the second stack. Enter Q when done.");
        HashSet<Integer> set2 = fillArray();
        // Another method would've been Set#retainAll(Collection<?> c).
        Sets sets = new Sets(set1, set2);
        HashSet<Integer> intersected = sets.intersection();
        trace.say("Intersected sets: ");
        for (Integer i : intersected) {
            System.out.printf("%d ", i);
        }
    }

    private HashSet<Integer> fillArray() {
        HashSet<Integer> set = new HashSet<>();
        do {
            try {
                set.add(scanner.nextInt());
            } catch (Exception ex) {
                scanner.nextLine();
                break;
            }
        } while (true);
        return set;
    }

    @Override
    public void test(int count) {

    }
}
