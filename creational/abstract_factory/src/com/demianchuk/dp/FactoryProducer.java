package com.demianchuk.dp;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("shape"))
            return new ShapeFactory();
        else if(factory.equalsIgnoreCase("color"))
            return new ColorFactory();
        return null;
    }
}
