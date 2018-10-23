package com.demianchuk.dp;

public class Circle implements Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle: " + getR());
    }
}
