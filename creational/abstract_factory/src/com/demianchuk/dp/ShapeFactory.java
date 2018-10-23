package com.demianchuk.dp;

public class ShapeFactory implements AbstractFactory {

    @Override
    public Color getColor(String color) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("circle"))
            return new Circle();
        else if(shape.equalsIgnoreCase("triangle"))
            return new Triangle();
        else if(shape.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        return null;
    }
}
