import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import shopping.*;

public class BasketTest {

  Basket basket;
  Item item1;
  Item item2;
  Item item3;

  @Before
  public void before() {
    basket = new Basket();
    item1 = new Item("Orange Juice", 1.50, true);
    item2 = new Item("Orange Juice", 1.50, true);
    item3 = new Item("Whole Turkey", 19.00, false);
  }

  @Test
  public void contentsStartsEmpty() {
    assertEquals(0, basket.count());
  }

  @Test
  public void canAddItem() {
    basket.addItem(item1);
    assertEquals(1, basket.count());
  }

  @Test
  public void canAddItems() {
    basket.addItem(item1);
    basket.addItem(item2);
    assertEquals(2, basket.count());
  }

  @Test
  public void canRemoveItem() {
    basket.addItem(item1);
    basket.addItem(item2);
    basket.removeItem(1);
    assertEquals(1, basket.count());
  }

  @Test
  public void canEmptyContents() {
    basket.addItem(item1);
    basket.addItem(item2);
    basket.addItem(item3);
    basket.emptyContents();
    assertEquals(0, basket.count());
  }

  @Test
  public void canGetContentsArray() {
    assertNotNull(basket.getContents());
  }

}