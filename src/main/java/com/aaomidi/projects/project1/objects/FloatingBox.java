package com.aaomidi.projects.project1.objects;

/**
 * Created by Amir on 2015-03-03.
 */
public class FloatingBox {
    // Static, because there is no reason to waste extra memory space for a constant value between the servers.
    private static final double constant = 1.06;
    private final double length;
    private final double width;
    private final double height;
    private Double surfaceArea;
    private Double mass;
    private Double draft;

    /**
     * @param length Length of the floating box.
     * @param width  Width of the floating box.
     * @param height Height of the floating box.
     */
    public FloatingBox(double length, double width, double height) {
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException();
        }

        this.length = length;
        this.width = width;
        this.height = height;
    }


    /**
     * @return Surface area of the floating box.
     */
    public double getSurfaceArea() {
        if (surfaceArea != null) {
            return surfaceArea;
        }

        surfaceArea = 2 * height * (length + width) + length * width;
        return surfaceArea;
    }

    /**
     * @return Mass of the floating box.
     */
    public double getMass() {
        if (mass != null) {
            return mass;
        }

        mass = this.getSurfaceArea() * constant;
        return mass;
    }

    /**
     * @return Draft of the floating box.
     */
    public double getDraft() {
        if (draft != null) {
            return draft;
        }

        draft = this.getMass() / (length * width);
        return draft;
    }

    @Override
    public String toString() {
        return String.format("Given information:\n >Length: %.2f\n >Width: %.2f\n >Height: %.2f\n>>Surface Area: %.2f\n>>Mass: %.2f\n>>Draft: %.2f\n",
                length, width, height, getSurfaceArea(), getMass(), getDraft());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FloatingBox)) return false;

        FloatingBox floatingBox = (FloatingBox) o;

        if (Double.compare(floatingBox.height, height) != 0) return false;
        if (Double.compare(floatingBox.length, length) != 0) return false;
        if (Double.compare(floatingBox.width, width) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(length);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
