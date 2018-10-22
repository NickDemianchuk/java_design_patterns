package com.demianchuk.dp;

public class CompositeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(10);

        circle.draw();
        triangle.draw();
        System.out.println();

        Shape complexShape = new ComplexShape(
                new Circle(5),
                new Rectangle(4,5),
                new Triangle(7),
                circle);

        complexShape.draw();
    }
}
