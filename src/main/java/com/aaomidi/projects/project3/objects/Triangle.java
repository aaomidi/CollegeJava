package com.aaomidi.projects.project3.objects;


public class Triangle {
    public static final double MAX_ANGLE = 180;

    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final double angle1;
    private final double angle2;
    private final double angle3;
    private TriangleType triangleType;

    public Triangle(double sideA, double sideB, double sideC) throws IllegalArgumentException {
        if (sideA > 100 || sideB > 100 || sideC > 100 || sideA <= 0 || sideB <= 0 || sideC <= 0 || sideA >= sideB + sideC || sideB >= sideA + sideC || sideC >= sideA + sideB) {
            throw new IllegalArgumentException("Sides must be between 0 and 100. The triangle must be a valid triangle");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.angle1 = Math.toDegrees(Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC)));
        this.angle2 = Math.toDegrees(Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC)));
        this.angle3 = MAX_ANGLE - (angle1 + angle2);

    }

    @Override
    public String toString() {
        return String.format("The triangle has sides %f, %f and %f units.\nThe angles are %f, %f and %f degrees.", sideA, sideB, sideC, angle1, angle2, angle3);
    }

    public TriangleType getTriangleType() {
        if (triangleType != null) return triangleType;
        this.triangleType = new TriangleType(this);
        return triangleType;
    }

    public double getAngle1() {
        return angle1;
    }

    public double getAngle2() {
        return angle2;
    }

    public double getAngle3() {
        return angle3;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Triangle)) {
            return false;
        }
        Triangle t = (Triangle) obj;
        if (t.getSideA() == this.sideA && t.getSideB() == this.sideB && t.getSideC() == this.sideC) {
            return true;
        }
        return false;
    }
}

