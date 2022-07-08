package com.titusnachbauer.supermarket;

import java.math.BigDecimal;
import java.util.Objects;

public class Money {
    BigDecimal bigDecimalAmount;

    Money(double amount) {
        this.bigDecimalAmount = BigDecimal.valueOf(amount);
    }

    public Money(BigDecimal amount) {
        this.bigDecimalAmount = amount;
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
