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

    @Test
    void GivenNewMoneyWhenGettingValueThenReturnsStringValue() {
        Money money = new Money(42.00);
        assertThat(money.toString(), equalTo("42.00"));
    }

    // @Test
    // void GivenTwoMoney5And7AddTogetherAndGet12() {
    //     Money money1 = new Money(5.00);
    //     Money money2 = new Money(7.00);
    //     money1.add(money2);
    //     assertThat(money1.getAmount(), equalTo(BigDecimal.))
    // }

}
