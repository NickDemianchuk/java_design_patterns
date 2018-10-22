package com.demianchuk.dp;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "Dark roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
