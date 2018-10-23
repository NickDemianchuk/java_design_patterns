package com.demianchuk.dp;

public class WeekendDiscounter implements Discountable {
    @Override
    public double getDiscountedPrice(double price) {
        return price * .9;
    }
}
