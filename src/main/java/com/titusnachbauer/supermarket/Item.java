package com.titusnachbauer.supermarket;

public class Item {
    private final Money price;
    private final String name;

    public Item(Money price) {
        this.price = price;
        this.name = "";
    }

    public Item(double price) {
        this("", price);
    }

    public Item() {
        this(0.00);
    }

    public Item(String name, double price) {
        this.price = new Money(price);
        this.name = name;
    }

    public double getPrice() {
        return price.getAmount().doubleValue();
    }

    public String getName() {
        return name;
    }
}