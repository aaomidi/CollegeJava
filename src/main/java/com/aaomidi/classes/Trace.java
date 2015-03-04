package com.aaomidi.classes;

public class Trace {
    public static Trace trace = new Trace();

    public void debug(String text) {
        System.out.printf("[%.3f] %s%n", System.currentTimeMillis() / 1000.0, text);
    }

    public void debug(String format, Object... args) {
        debug(String.format(format, args));
    }

    public void say(String text) {
        System.out.printf("%s%n", text);
    }

    public void say(String format, Object... args) {
        say(String.format(format, args));
    }
}
