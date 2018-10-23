package com.demianchuk.dp;

public class DecoratorDemo {
    public static void main(String[] args) {
        // order a beverage with condiments
        Beverage espresso = new Espresso();
        Beverage mocha = new Mocha(espresso);
        Beverage whip = new Whip(mocha);
        mocha = new Mocha(whip);

        System.out.println(mocha.getDescription() + " $" + mocha.cost());

    }
}
