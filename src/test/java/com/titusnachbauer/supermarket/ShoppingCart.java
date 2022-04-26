package com.titusnachbauer.supermarket;

public class ShoppingCart {
    private int count = 0;

    public int itemCount() {
        return count;
    }

    public void add(Item item) {
        count = 1;
    }
}
