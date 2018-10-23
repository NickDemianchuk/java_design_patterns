package com.demianchuk.dp;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // create a factory of factories
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape circle = shapeFactory.getShape("circle");
        Shape triangle = shapeFactory.getShape("triangle");

        AbstractFactory colorFactor = FactoryProducer.getFactory("color");
        Color red = shapeFactory.getColor("red");
    }
}