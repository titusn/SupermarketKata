package com.titusnachbauer.supermarket;

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
}
