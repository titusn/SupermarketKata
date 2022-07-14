package com.titusnachbauer.supermarket;

import java.math.BigDecimal;

public class Money {
    private final BigDecimal amount;

    public Money(double amount) {
        this.amount = BigDecimal.valueOf(amount);
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
