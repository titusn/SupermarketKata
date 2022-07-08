package com.titusnachbauer.supermarket;

import org.junit.jupiter.api.Test;

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
}
