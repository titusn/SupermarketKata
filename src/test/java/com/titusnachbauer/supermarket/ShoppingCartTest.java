package com.titusnachbauer.supermarket;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ShoppingCartTest {
    private ShoppingCart cart = new ShoppingCart();

    @Test
    void GivenNewShoppingCartWhenCountingItemsThenCountShouldBeZero() {
        assertThat(cart.itemCount(), equalTo(0));
    }

    @Test
    void GivenNewShoppingCartWhenCheckingThenItShouldBeEmpty() {
        assertThat(cart.isEmpty(), equalTo(true));
    }

    @Test
    void GivenEmptyShoppingCartWhenAddingItemThenCountShouldBeOne() {
        cart.add(new Item());
        assertThat(cart.itemCount(), equalTo(1));
    }

    @Test
    void GivenEmptyShoppingCartWhenAddingThenItShouldNotBeEmtpy() {
        cart.add(new Item());
        assertThat(cart.isEmpty(), equalTo(false));
    }

    @Test
    void GivenShoppingCartWithOneItemWhenRemoving1ItemCartShouldBeEmpty() {
        Item item = new Item();
        cart.add(item);
        cart.remove(item);
        assertThat(cart.isEmpty(), equalTo(true));
    }

    @Test
    void GivenEmptyShoppingCartWhenRemovingOneItemCartShouldThrowException() {
        assertThrows(
                ShoppingCart.Underflow.class,
                () -> cart.remove(new Item()));
    }

    @Test
    void GivenShoppingCartWithOneItemWhenCalculatingPriceThenTotalShouldBePriceOfItemAsMoney() {
        Item item = new Item(new Money(2.00));
        cart.add(item);
        assertThat(cart.getTotalPrice(), equalTo(new Money(BigDecimal.valueOf(2.00))));
    }

    @Test
    void GivenEmptyShoppingCartWhenAddingTwoItemCountShouldBeTwo() {
        cart.add(new Item());
        cart.add(new Item());
        assertEquals(2, cart.itemCount());
    }

    @Test
    void GivenAShoppingCartWithTwoItemsWhenCalculatingPriceThenTotalShouldBeSumOfTheItemsPricesAsMoney() {
        cart.add(new Item(new Money(1.00)));
        cart.add(new Item(new Money(2.00)));
        assertThat(cart.getTotalPrice(), equalTo(new Money(3.00)));
    }
}
