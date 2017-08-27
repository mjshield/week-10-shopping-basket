import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import shopping.*;

public class CheckoutTest {

  Basket basket;
  Item item1;
  Item item2;
  Item item3;

  @Before
  public void before() {
    basket = new Basket();
    item1 = new Item("Orange Juice", 1.50, true);
    item2 = new Item("Whole Turkey", 19.00, false);
    item3 = new Item("Milk", 0.50, false);
  }

  @Test
  public void canTotalOneItem() {
    basket.addItem(item1);
    assertEquals(1.50, Checkout.getTotal(basket, false), 0.00001);
  }

  @Test
  public void canTotalTwoItems() {
    basket.addItem(item3);
    basket.addItem(item3);
    assertEquals(1.00, Checkout.getTotal(basket, false), 0.00001);
  }

  @Test 
  public void canTotalBogof() {
  basket.addItem(item1);
  basket.addItem(item1);
  assertEquals(1.50, Checkout.getTotal(basket, false), 0.00001);
  }

  @Test
  public void canBogofOnlyPairs() {
    basket.addItem(item1);
    basket.addItem(item1);
    basket.addItem(item1);
    assertEquals(3.00, Checkout.getTotal(basket, false), 0.00001);
  }

  @Test 
  public void canApplyOver20Discount() {
    basket.addItem(item2);
    basket.addItem(item3);
    basket.addItem(item3);
    basket.addItem(item3);
    assertEquals(18.45, Checkout.getTotal(basket, false), 0.00001);
  }

  @Test
  public void canApplyLoyaltyDiscount() {
    basket.addItem(item3);
    assertEquals(0.49, Checkout.getTotal(basket, true), 0.00001);
  }

  @Test
  public void canApplyBothAllDiscounts() {
    basket.addItem(item1);
    basket.addItem(item1);
    basket.addItem(item2);
    basket.addItem(item3);
    assertEquals(18.52, Checkout.getTotal(basket, true), 0.00001);
  }

}