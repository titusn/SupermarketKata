package com.titusnachbauer.supermarket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int count = 0;
    private final List<Item> items = new ArrayList<>();
    private Money totalPrice = new Money(BigDecimal.valueOf(0.00));

    public String generateReceipt() {
        return "TOTAL                     EUR  0,00";
    }

    public int itemCount() {
        return count;
    }

    public void add(Item item) {
        count += 1;
        totalPrice = totalPrice.add(item.getPrice());
        items.add(item);
    }

    public void remove(Item item) {
        if (isEmpty()) {
            throw new Underflow();
        }
        items.remove(item);
        count--;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public Money getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(Item item) {
        return items.contains(item);
    }

    class Underflow extends RuntimeException {
    }
}
