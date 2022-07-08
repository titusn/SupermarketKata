package com.titusnachbauer.supermarket;

public class Item {
    private final Money moneyPrice;

    public Item() {
        this(new Money(0.00));
    }

    public Item(Money money) {
        moneyPrice = money;
    }

    public Money getMoneyPrice() {
        return moneyPrice;
    }
}
