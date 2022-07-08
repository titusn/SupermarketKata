package com.titusnachbauer.supermarket;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ItemTest {

    @Test
    void GivenItemWhenAskedForPriceThenItReturnsPriceAsMoney() {
        Item item = new Item(new Money(1.00));
        assertThat(item.getMoneyPrice(), equalTo(new Money(1.00)));
    }
}
