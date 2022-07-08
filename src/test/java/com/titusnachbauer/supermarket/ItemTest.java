package com.titusnachbauer.supermarket;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ItemTest {

    @Test
    void GivenNewItemWhenAskedForPriceThenItReturnsPriceAsBigDecimal() {
        Item item = new Item(1.00);
        assertThat(item.getPriceBigDecimal(), equalTo(BigDecimal.valueOf(1.00)));
    }

    @Test
    void GivenItemWhenAskedForPriceThenItReturnsPriceAsMoney() {
        Item item = new Item(1.00);
        assertThat(item.getMoneyPrice(), equalTo(new Money(1.00)));
    }
}
