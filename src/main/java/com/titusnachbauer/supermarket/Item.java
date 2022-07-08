package com.titusnachbauer.supermarket;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Item {
    private final Money price;
    private final String name;

    public Item() {
        this("", new Money(0.00));
    }

    public Item(Money money) {
        this("", money);
    }

    public Item(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public Money getPrice() {
        return price;
    }

    @Override
    public String toString() {
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.GERMAN);
        DecimalFormat df = new DecimalFormat("  #.##", otherSymbols);
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);

        return name + "                     EUR" + df.format(price.getBigDecimalAmount().doubleValue());
    }
}
