package com.demianchuk.dp;

public class PizzaFactory {
    public Pizza createPizza(String type){
        if(type.equalsIgnoreCase("cheese"))
            return new CheesePizza();
        else if (type.equalsIgnoreCase("hawaiian"))
            return new HawaiianPizza();
        else if(type.equalsIgnoreCase("veggie"))
            return new VeggiePizza();
        return null;
    }
}
