package com.titusnachbauer.supermarket;

import java.math.BigDecimal;

public class ShoppingCart {
    private int count = 0;
    private BigDecimal totalPriceBigDecimal = BigDecimal.valueOf(0.00);

    public String generateReceipt() {
        return "TOTAL                     EUR  0,00";
    }

    public int itemCount() {
        return count;
    }

    public void add(Item item) {
        count += 1;
        totalPrice += item.getPrice();
        totalPriceBigDecimal = totalPriceBigDecimal.add(item.getPriceBigDecimal());
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

    public BigDecimal getTotalPriceBigDecimal() {
        return totalPriceBigDecimal;
    }

    class Underflow extends RuntimeException {
    }
}
