package com.aaomidi.classes;

import lombok.Getter;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Amir on 2015-03-03.
 */
public abstract class Project {
    public static Trace trace = Trace.trace;
    @Getter
    private final String name;
    @Getter
    private final Calendar calendar;

    public Project(String name, int year, int month, int day) {
        this.name = name;
        Calendar cal = GregorianCalendar.getInstance();
        cal.set(year, month, day);
        this.calendar = cal;
    }

    public abstract void execute();

    public abstract void test(int count);
}
