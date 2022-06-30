package com.titusnachbauer.supermarket;

public class Item {
    private final double price;

    public Item(double price) {
        this.price = price;
    }

    public Item() {
        this(0.00);
    }

    public double getPrice() {
        return price;
    }
}
