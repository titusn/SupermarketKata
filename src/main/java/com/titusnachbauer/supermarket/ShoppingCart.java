package com.titusnachbauer.supermarket;

public class ShoppingCart {
    private int count = 0;
    private Item item;

    public int itemCount() {
        return count;
    }

    public void add(Item item) {
        count += 1;
        this.item = item;
    }

    public void remove(Item item) {
        if (isEmpty()) {
            throw new Underflow();
        }
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public double totalPrice() {
        return item.getPrice();
    }

    class Underflow extends RuntimeException {
    }
}
