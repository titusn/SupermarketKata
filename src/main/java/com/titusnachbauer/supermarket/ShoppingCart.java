package com.titusnachbauer.supermarket;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ShoppingCart {
    private int count = 0;
    private final List<Item> items = new ArrayList<>();
    private Money totalPrice = new Money(BigDecimal.valueOf(0.00));

    public String generateReceipt() {
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.GERMAN);
        DecimalFormat df = new DecimalFormat("  #.##", otherSymbols);
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);

        StringBuilder receipt = new StringBuilder();
        for (Item item: items) {
            receipt.append(item.toString());
        }
        if (itemCount() > 0) {
            receipt.append("\n\n\n");
        }
        receipt.append("TOTAL                     EUR");
        receipt.append(df.format(getTotalPrice().getBigDecimalAmount().doubleValue()));
        return receipt.toString();
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
