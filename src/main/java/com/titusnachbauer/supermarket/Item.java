package com.titusnachbauer.supermarket;

public class Item {
    private final Money moneyPrice;

    public Item(double price) {
        this.moneyPrice = new Money(price);
    }

    public Item() {
        this(0.00);
    }

    public Item(Money money) {
        moneyPrice = money;
    }

    public Money getMoneyPrice() {
        return moneyPrice;
    }
}
