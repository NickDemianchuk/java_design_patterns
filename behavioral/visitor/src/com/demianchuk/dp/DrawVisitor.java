package com.demianchuk.dp;

public class DrawVisitor implements Visitor {
    @Override
    public void visit(Rectangle r) {
        System.out.println("Drawing rectangle: "
                + r.getH() + ", " + r.getW());
    }

    @Override
    public void visit(Circle c) {
        System.out.println("Drawing circle: " + c.getR());
    }

    @Override
    public void visit(Triangle t) {
        System.out.println("Drawing triangle: " + t.getS());
    }
}
