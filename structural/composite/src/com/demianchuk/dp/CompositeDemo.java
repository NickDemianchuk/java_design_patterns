package com.demianchuk.dp;

public class CompositeDemo {
    public static void main(String[] args) {
        Shape shape = new ComplexShape(
                new Circle(5),
                new Triangle(7),
                new Rectangle(3 , 5),
                new ComplexShape(
                        new Circle(10),
                        new Triangle(12)
                )
        );
        shape.draw();
    }
}
