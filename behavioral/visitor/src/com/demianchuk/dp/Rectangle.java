package com.demianchuk.dp;

public class Rectangle implements Shape {
    private int h;
    private int w;

    public Rectangle(int h, int w) {
        this.h = h;
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
