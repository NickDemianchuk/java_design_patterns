package com.demianchuk.dp;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ComplexShape implements Shape {
    private List<Shape> shapes;

    public ComplexShape(Shape... shapes){
        this.shapes = Arrays.asList(shapes);
    }

    @Override
    public void draw() {
        shapes.stream()
            .forEach(Shape::draw);
    }
}
