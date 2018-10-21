package com.demianchuk.dp;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Adding toppings:");
        for (String topping : toppings)
            System.out.println("\t" + topping);
    }

    public void bake() {
        System.out.println("Baking the pizza at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Boxing the pizza");
    }
}
