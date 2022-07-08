package com.titusnachbauer.supermarket;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class MoneyTest {
    @Test
    void GivenNewMoneyWhenAskedAmountThenAmountShouldBeZero() {
        Money money = new Money();
        assertThat(money.getBigDecimalAmount(), equalTo(BigDecimal.ZERO));
    }

    @Test
    void GivenMoneyAmountTwoWhenAddingMoneyAmountTwoThenResultuingAmountShouldBeFour() {
        Money money = new Money(BigDecimal.valueOf(2));
        assertThat(money.add(new Money(BigDecimal.valueOf(2))), equalTo(new Money(BigDecimal.valueOf(4))));
    }

    @Test
    void GivenMoneyAmountTenWhenConvertingToStringThenShouldBeTenAsString() {
        Money money = new Money(10);
        assertThat(money.toString(), equalTo("10.0"));
    }
}
