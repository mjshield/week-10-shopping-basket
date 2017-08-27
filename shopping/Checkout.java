package shopping;

import java.util.ArrayList;

public class Checkout {

  public static double getTotal(Basket basket, boolean loyaltyCard) {
    double total = 0.00;
    ArrayList<Item> contents = basket.getContents();

    for (Item item : contents) {
      if (!item.getBogofOffered()) {
        total += item.getPrice();
      }
      else if (item.getBogofOffered() && !item.getBogofReady()) {
        item.switchBogofReady();
        total += item.getPrice();
      }
      else if (item.getBogofOffered() && item.getBogofReady()) {
        item.switchBogofReady();
      }

    }

    if (total > 20.00) {
      total = total * 0.9;
    }

    if (loyaltyCard) {
      total = total * 0.98;
    }

    total = Math.round(total*100)/100.0d;
    return total;

  }


}