package com.aaomidi.projects.project4.part1.objects;

import java.util.HashSet;

public class Sets {
    private final HashSet<Integer> set1;
    private final HashSet<Integer> set2;

    public Sets(HashSet<Integer> set2, HashSet<Integer> set1) {
        this.set2 = set2;
        this.set1 = set1;
    }

    public HashSet<Integer> intersection() {
        HashSet<Integer> intersected = new HashSet<>();
        for (Integer i : set1) {
            if (!set2.contains(i)) continue;
            intersected.add(i);
        }
        return intersected;
    }
}
