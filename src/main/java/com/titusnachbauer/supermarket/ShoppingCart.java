package com.titusnachbauer.supermarket;

import java.math.BigDecimal;

public class ShoppingCart {
    private int count = 0;
    private BigDecimal totalPriceBigDecimal = BigDecimal.valueOf(0.00);
    private Money totalPrice = new Money(BigDecimal.valueOf(0.00));

    public String generateReceipt() {
        return "TOTAL                     EUR  0,00";
    }

    public int itemCount() {
        return count;
    }

    public void add(Item item) {
        count += 1;
        totalPriceBigDecimal = totalPriceBigDecimal.add(item.getPriceBigDecimal());
        totalPrice = totalPrice.add(item.getMoneyPrice());
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

    public Money getTotalPriceMoney() {
        return new Money(totalPriceBigDecimal);
    }

    class Underflow extends RuntimeException {
    }
}
