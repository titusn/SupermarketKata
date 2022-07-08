package com.titusnachbauer.supermarket;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ReceiptTest {
    @Test
    void GivenAShoppingCartWithoutItemsWhenPrintingReceiptThenItShouldPrintEmptyReceiptWithTotalZero() {
        ShoppingCart shoppingCart = new ShoppingCart();
        assertThat(shoppingCart.generateReceipt(), equalTo(
                "TOTAL                     EUR  0,00"
        ));
    }

    @Test
    void GivenAShoppingCartWithOneAppleWhenGeneratingReceiptThenItContainsApplePriceAndTotal() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Item("Apple", new Money(0.15)));
        assertThat(shoppingCart.generateReceipt(), equalTo(
                """
                        Apple                     EUR  0,15
                        
                        
                        TOTAL                     EUR  0,15"""
        ));

    }
}
