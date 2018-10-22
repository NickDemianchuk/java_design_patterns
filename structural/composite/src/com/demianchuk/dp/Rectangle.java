package com.demianchuk.dp;

public class Rectangle implements Shape {
    private int h;
    private int w;

    public Rectangle(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with height " + h + " and width " + w);
    }
}
