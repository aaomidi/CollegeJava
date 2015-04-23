package com.aaomidi.projects.project4.part2.objects;

public class Matrix {
    private final int rows; // rows
    private final int columns; // columns
    private final double[][] data;

    public Matrix(int rows, int n) {
        this.rows = rows;
        this.columns = n;
        data = new double[rows][n];
    }

    public Matrix(double[][] data) {
        this.rows = data.length;
        this.columns = data[0].length;
        this.data = new double[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                this.data[i][j] = data[i][j];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public double[][] getData() {
        return data;
    }

    public Matrix add(Matrix b) {
        if (isIllegal(b)) throw new RuntimeException("Illegal matrix.");
        Matrix c = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                c.data[i][j] = this.data[i][j] + b.data[i][j];
        return c;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sb.append(String.format("%.2f ", data[i][j]));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private boolean isIllegal(Matrix matrix) {
        if (matrix.rows != this.rows || matrix.columns != this.columns) {
            return true;
        }
        return false;
    }
}
