package com.demianchuk.dp;

public class VisitorDemo {
    public static void main(String[] args) {
        // Visitor
        Visitor drawVisitor = new DrawVisitor();
        Shape shape = new ComplexShape(
                new Circle(5),
                new Triangle(7),
                new Rectangle(3 , 5),
                new ComplexShape(
                        new Circle(10),
                        new Triangle(12)
                )
        );
        // Every shape in this structure will accept visitor to perform the action
        shape.accept(drawVisitor);

        // We can easily extend functionality by creating new visitors:
        // ScaleVisitor - scales each shape,
        // RotateVisitor - rotates each shape, etc.
    }
}
