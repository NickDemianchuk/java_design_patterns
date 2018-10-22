package com.demianchuk.dp;

public class Triangle implements Shape {
    private int s;

    public Triangle(int s){
        this.s = s;
    }

    @Override
    public void draw() {
        System.out.println("Drawing an equilateral triangle with all sides " + s);
    }
}
