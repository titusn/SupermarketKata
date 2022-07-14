package com.titusnachbauer.supermarket;

public class Item {
    private final Money price;

    public Item(Money price) {
        this.price = price;
    }

    public Item(double price) {
        this.price = new Money(price);
    }

    public Item() {
        this(0.00);
    }

    public double getPrice() {
        return price.getAmount().doubleValue();
    }
}