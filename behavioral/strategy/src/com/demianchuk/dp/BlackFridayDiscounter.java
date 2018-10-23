package com.demianchuk.dp;

public class BlackFridayDiscounter implements Discountable {
    @Override
    public double getDiscountedPrice(double price) {
        return price * .4;
    }
}
