package com.demianchuk.dp;

public class Triangle implements Shape{
    private int s;

    public Triangle(int s) {
        this.s = s;
    }

    public int getS() {
        return s;
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle: " + getS());
    }
}
