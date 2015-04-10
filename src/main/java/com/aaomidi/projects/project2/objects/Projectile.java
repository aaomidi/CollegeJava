package com.aaomidi.projects.project2.objects;

import lombok.Getter;

public class Projectile {
    public final static int GRAVITY_ACCELERATION = 10; // ms^-2
    @Getter
    private final double thrownAngle; // Between 0 and 90
    @Getter
    private final double initialVelocity; // Non negative.

    /* Class use only */
    private Double horizontalVelocity;
    private Double verticalVelocity;
    private Double travelTime;
    private Double travelDistance;

    public Projectile(double thrownAngle, double initialVelocity) throws IllegalArgumentException {
        if (thrownAngle > 90 || thrownAngle < 0 || initialVelocity < 0) {
            throw new IllegalArgumentException("The input did not have correct information. Angle must be between 0 and 90.\nInitial speed must be a non negative number.");
        }

        this.thrownAngle = thrownAngle;
        this.initialVelocity = initialVelocity;
    }

    public Double getVerticalVelocity() {
        if (verticalVelocity != null) return verticalVelocity;

        verticalVelocity = this.getInitialVelocity() * Math.sin(Math.toRadians(getThrownAngle()));
        return verticalVelocity;
    }

    public Double getHorizontalVelocity() {
        if (horizontalVelocity != null) return horizontalVelocity;

        horizontalVelocity = this.getInitialVelocity() * Math.cos(Math.toRadians(getThrownAngle()));
        return horizontalVelocity;
    }

    public Double getTravelTime() {
        if (travelTime != null) return travelTime;

        travelTime = (2 * getVerticalVelocity()) / GRAVITY_ACCELERATION;
        return travelTime;
    }

    public Double getTravelDistance() {
        if (travelDistance != null) return travelDistance;

        travelDistance = getHorizontalVelocity() * getTravelTime();
        return travelDistance;
    }

    @Override
    public String toString() {
        return String.format("Given information:\n >Thrown Angle: %.2f\n >Initial Velocity: %.2f\n>>Vertical Component of Velocity: %.2f\n>>Horizontal Component of Velocity: %.2f\n>>Travel Time: %.2f\n>>Travel Distance: %.2f",
                getThrownAngle(), getInitialVelocity(), getVerticalVelocity(), getHorizontalVelocity(), getTravelTime(), getTravelDistance());
    }
}
