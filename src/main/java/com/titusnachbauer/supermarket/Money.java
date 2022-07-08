package com.titusnachbauer.supermarket;

import java.math.BigDecimal;

public class Money {
    final double amount;
    BigDecimal bigDecimalAmount;

    Money(double amount) {
        this.amount = amount;
        this.bigDecimalAmount = BigDecimal.valueOf(amount);
    }

    public double getAmount() {
        return amount;
    }

    public BigDecimal getBigDecimalAmount() {
        return bigDecimalAmount;
    }
}
