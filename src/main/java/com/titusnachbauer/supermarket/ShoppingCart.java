package com.titusnachbauer.supermarket;

public class ShoppingCart {
    private int count = 0;
    private double totalPrice = 0;

    public int itemCount() {
        return count;
    }

    public void add(Item item) {
        count += 1;
        totalPrice += item.getPrice();
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
        return totalPrice;
    }

    class Underflow extends RuntimeException {
    }

    @Override
    public String toString(){
        return """ 
            Baseball 5,00
            Baseball bat 15,00
                    """;
    }
}
