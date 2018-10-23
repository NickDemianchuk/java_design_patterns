package com.demianchuk.dp;

import java.util.Arrays;
import java.util.List;

public class ComplexShape implements Shape {
    private List<Shape> shapes;

    public ComplexShape(Shape... shapes){
        this.shapes = Arrays.asList(shapes);
    }

    @Override
    public void accept(Visitor v) {
        shapes.stream()
                .forEach(s -> s.accept(v));
    }
}
