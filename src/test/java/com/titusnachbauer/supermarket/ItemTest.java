package com.titusnachbauer.supermarket;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ItemTest {

    @Test
    void GivenNewItemWhenAskedForPriceThenItReturnPrice() {
        Item item = new Item(1.00);
        assertThat(item.getPrice(), equalTo(1.00));
    }
}
