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
    void GivenEmptyShoppingCartWhenAddingTwoItemCountShouldBeTwo() {
        cart.add(new Item());
        cart.add(new Item());
        assertEquals(2, cart.itemCount());
    }

    @Test
    void GivenAShoppingCartWithTwoItemsWhenCalculatingPriceThenTotalShouldBeSumOfTheItemsPrices() {
        cart.add(new Item(new Money(1.00)));
        cart.add(new Item(new Money(2.00)));
        assertEquals(Money.getThree(), cart.totalPrice());
    }

    @Test
    void GivenShoppingCartWithTwoItemsShouldPrintTheReceiptList(){
        cart.add(new Item("Baseball",5.00));
        cart.add(new Item("Baseball bat",15.00));
        String expected=""" 
        Baseball 5,00
        Baseball bat 15,00
        """;
        assertEquals(expected, cart.toString());
    }

    @Test
    void GivenShoppingCartWithTwoItemsShouldPrintTheReceiptList2(){
        cart.add(new Item("Baseball",5.00));
        cart.add(new Item("Baseball hat",2.00));
        String expected=""" 
        Baseball 5,00
        Baseball hat 2,00
        """;
        assertEquals(expected, cart.toString());
    }

}
