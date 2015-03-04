package com.aaomidi.classes;

/**
 * Created by Amir on 2015-03-03.
 */
public abstract class IProject {
    public static Trace trace = Trace.trace;

    public abstract void execute();

    public abstract void test(int count);
}
