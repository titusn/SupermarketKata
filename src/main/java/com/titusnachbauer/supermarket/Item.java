package com.titusnachbauer.supermarket;

public class Item {
    private final Money price;

    public Item() {
        this(new Money(0.00));
    }

    public Item(Money money) {
        price = money;
    }

    public Money getPrice() {
        return price;
    }
}
