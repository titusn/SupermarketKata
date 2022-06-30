package com.titusnachbauer.supermarket;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ShoppingCartTest {
    private ShoppingCart cart = new ShoppingCart();

    @Test
    void GivenNewShoppingCartWhenCountingItemsThenCountShouldBe0() {
        assertThat(cart.itemCount(), equalTo(0));
    }

    @Test
    void GivenNewShoppingCartWhenCheckingThenItShouldBeEmpty() {
        assertThat(cart.isEmpty(), equalTo(true));
    }

    @Test
    void GivenEmptyShoppingCartWhenAddingItemThenCountShouldBe1() {
        cart.add(new Item());
        assertThat(cart.itemCount(), equalTo(1));
    }

    @Test
    void GivenEmptyShoppingCartWhenAddingThenItShouldNotBeEmtpy() {
        cart.add(new Item());
        assertThat(cart.isEmpty(), equalTo(false));
    }

    @Test
    void GivenShoppingCartWith1ItemWhenRemoving1ItemCartShouldBeEmpty() {
        Item item = new Item();
        cart.add(item);
        cart.remove(item);
        assertThat(cart.isEmpty(), equalTo(true));
    }

    @Test
    void GivenEmptyShoppingCartWhenRemoving1ItemCartShouldThrowException() {
        assertThrows(
                ShoppingCart.Underflow.class,
                () -> cart.remove(new Item()));
    }

    @Test
    void GivenShoppingCartWith1ItemWhenCalculatingPriceThenTotalShouldBePriceOfItem() {
        Item item = new Item(2.00);
        cart.add(item);
        assertThat(cart.totalPrice(), equalTo(2.00));
    }

    @Test
    void GivenEmptyShoppingCartWhenAddingTwoItemCountShouldBe2() {
        cart.add(new Item());
        cart.add(new Item());
        assertEquals(2, cart.itemCount());
    }

    @Test
    void GivenAShoppingCartWithTwoItemsWhenCalculatingPriceThenTotalShouldBeSumOfTheItemsPrices() {
        cart.add(new Item(1.00));
        cart.add(new Item(2.00));
        assertEquals(3.00, cart.totalPrice());
    }

}
