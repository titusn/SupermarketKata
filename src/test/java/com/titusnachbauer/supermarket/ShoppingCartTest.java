package com.titusnachbauer.supermarket;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ShoppingCartTest {

    @Test
    void NewShoppingCartShouldBeEmpty() {
        ShoppingCart cart = new ShoppingCart();
        assertThat(cart.itemCount(), equalTo(0));
    }
}
