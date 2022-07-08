package com.titusnachbauer.supermarket;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ItemTest {

    @Test
    void GivenItemWhenAskedForPriceThenItReturnsPriceAsMoney() {
        Item item = new Item(new Money(1.00));
        assertThat(item.getPrice(), equalTo(new Money(1.00)));
    }

    @Test
    void GivenItemWhenConvertingToStringThenShouldContainNameAndPrice() {
        Item item = new Item("Apple", new Money(0.15));
        assertThat(item.toString(), equalTo("Apple                     EUR  0,15"));
    }
}
