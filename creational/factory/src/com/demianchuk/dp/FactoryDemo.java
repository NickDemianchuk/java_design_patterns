package com.demianchuk.dp;

public class FactoryDemo {
    public static void main(String[] args) {
        // order a pizza from a pizza store
        PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());
        pizzaStore.orderPizza("cheese");
    }
}
