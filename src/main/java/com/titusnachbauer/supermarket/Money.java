package com.titusnachbauer.supermarket;

import java.math.BigDecimal;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        else if (!(o instanceof Money money)) {
            return false;
        } else {
            return getBigDecimalAmount().equals(money.getBigDecimalAmount());
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBigDecimalAmount());
    }
}
