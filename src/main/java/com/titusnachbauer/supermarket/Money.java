package com.titusnachbauer.supermarket;

import java.math.BigDecimal;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Money {
    private final BigDecimal amount;

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
        return df.format(amount.doubleValue());
    }

}
