package com.titusnachbauer.supermarket;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ShoppingCartTest {
    private ShoppingCart cart = new ShoppingCart();

    @Test
    void NewShoppingCartShouldBeEmpty() {
        assertThat(cart.itemCount(), equalTo(0));
    }

    @Test
    void AfterAddingItemShoppingCartShouldContain1Item() {
        cart.add(new Item());
        assertThat(cart.itemCount(), equalTo(1));
    }
}
