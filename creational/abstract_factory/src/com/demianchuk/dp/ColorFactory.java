package com.demianchuk.dp;

public class ColorFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color.equalsIgnoreCase("red"))
            return new Red();
        else if(color.equalsIgnoreCase("blue"))
            return new Blue();
        else if(color.equalsIgnoreCase("green"))
            return new Green();
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        throw new UnsupportedOperationException();
    }
}
