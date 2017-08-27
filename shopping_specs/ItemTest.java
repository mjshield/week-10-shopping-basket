import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import shopping.*;

public class ItemTest {

  Item item;


  @Before
  public void before () {
    item = new Item("Orange Juice", 1.50, true);
  }

  @Test
  public void canGetName() {
    assertEquals("Orange Juice", item.getName());
  }

  @Test
  public void canGetPrice() {
    assertEquals(1.50, item.getPrice(), 0.00001);
  }

  @Test
  public void canGetBogofOffered() {
    assertEquals(true, item.getBogofOffered());
  }

  @Test
  public void canGetBogofReady() {
    assertEquals(false, item.getBogofReady());
  }

  @Test
  public void canSwitchBogofReady() {
    item.switchBogofReady();
    assertEquals(true, item.getBogofReady());
  }

}