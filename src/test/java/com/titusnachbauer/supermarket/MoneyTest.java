package com.titusnachbauer.supermarket;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MoneyTest {
    @Test
    void GivenNewMoneyWhenGettingValueThenReturnsValue() {
        Money money = new Money(42.00);
        assertThat(money.getAmount(), equalTo(BigDecimal.valueOf(42)));
    }
}
