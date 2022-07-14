package com.titusnachbauer.supermarket;

import java.math.BigDecimal;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Money {
    private BigDecimal amount;
    static final private BigDecimal three = BigDecimal.valueOf(3.00);

    static public double getThree() {
        return three.doubleValue();
    }

    public Money(double amount) {
        this.amount = BigDecimal.valueOf(amount);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String toString() {
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.GERMAN);
        DecimalFormat df = new DecimalFormat("#.##", otherSymbols);
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        return df.format(amount.doubleValue());
    }

    public void add(Money more_money) {
        amount = getAmount().add(more_money.getAmount());
    }
}
