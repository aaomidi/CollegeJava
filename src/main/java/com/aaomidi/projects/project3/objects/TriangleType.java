package com.aaomidi.projects.project3.objects;

public class TriangleType {
    private final SideType sideType;
    private final AngleType angleType;

    public TriangleType(Triangle triangle) {
        double sideA = triangle.getSideA();
        double sideB = triangle.getSideB();
        double sideC = triangle.getSideC();
        double angle1 = triangle.getAngle1();
        double angle2 = triangle.getAngle2();
        double angle3 = triangle.getAngle3();

        if (sideA == sideB && sideA == sideC) {
            this.sideType = SideType.EQUILATERAL;
        } else if (sideA == sideB || sideB == sideC || sideC == sideA) {
            this.sideType = SideType.ISOSCELES;
        } else {
            this.sideType = SideType.SCALENE;
        }

        if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
            this.angleType = AngleType.ACUTE;
        } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
            this.angleType = AngleType.RIGHT;
        } else {
            this.angleType = AngleType.OBTUSE;
        }
    }

    @Override
    public String toString() {
        return String.format("The triangle is a/an %s %s Triangle", angleType.toString(), sideType.toString());
    }

    public enum SideType {
        SCALENE("Scalene"),
        ISOSCELES("Isosceles"),
        EQUILATERAL("Equilateral");

        private final String n;

        SideType(String n) {
            this.n = n;
        }

        @Override
        public String toString() {
            return n;
        }
    }

    public enum AngleType {
        ACUTE("Acute"),
        RIGHT("Right"),
        OBTUSE("Obtuse");
        private final String n;

        AngleType(String n) {
            this.n = n;
        }

        @Override
        public String toString() {
            return n;
        }
    }
}
