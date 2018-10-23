package com.demianchuk.dp;

public class StrategyDemo {
    public static void main(String[] args) {
        Discountable bf = new BlackFridayDiscounter();
        System.out.println(bf.getDiscountedPrice(1000));
        Discountable w = new WeekendDiscounter();
        System.out.println(w.getDiscountedPrice(5));

        // using an anonymous inner class
        Discountable discountable = new Discountable() {
            @Override
            public double getDiscountedPrice(double price) {
                return price * .2;
            }
        };

        // using a lambda expression
        Discountable lambdaDiscountable = d -> d * .75;
    }
}
