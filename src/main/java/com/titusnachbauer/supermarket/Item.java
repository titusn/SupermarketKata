package com.titusnachbauer.supermarket;

import java.math.BigDecimal;

public class Item {
    private final Money moneyPrice;

    public Item(double price) {
        this.moneyPrice = new Money(price);
    }

    public Item() {
        this(0.00);
    }

    public double getPrice() {
        return moneyPrice.getAmount();
    }

    public BigDecimal getPriceBigDecimal() {
        return moneyPrice.getBigDecimalAmount();
    }
}
