package com.aaomidi.projects.project4.part1;

import com.aaomidi.classes.IProject;
import com.aaomidi.projects.project4.part1.objects.Sets;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Amir on 2015-04-18.
 */
public class Project4P1 extends IProject {

    public Project4P1(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    @Override
    public void execute() {
        trace.say("Please enter the contents of the first stack. Enter Q when done.");
        HashSet<Integer> set1 = fillArray();
        trace.say("Please enter the contents of the second stack. Enter Q when done.");
        HashSet<Integer> set2 = fillArray();
        Sets sets = new Sets(set1, set2);
        HashSet<Integer> intersected = sets.intersection();
        for (Integer i : intersected) {
            System.out.println(i);
        }
    }

    private HashSet<Integer> fillArray() {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        do {
            try {
                set.add(scanner.nextInt());
            } catch (Exception ex) {
                break;
            }
        } while (true);
        System.out.flush();
        return set;
    }

    @Override
    public void test(int count) {

    }
}
