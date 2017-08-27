package shopping;

public class Item {

  private String name;
  private double price;
  private boolean bogofOffered;
  private boolean bogofReady;

  public Item(String name, double price, boolean bogofOffered) {
    this.name = name;
    this.price = price;
    this.bogofOffered = bogofOffered;
    this.bogofReady = false;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  public boolean getBogofOffered() {
    return this.bogofOffered;
  }

  public boolean getBogofReady() {
    return this.bogofReady;
  }

  public void switchBogofReady() {
    if (this.bogofReady) {
      this.bogofReady = false;
    }
    else if (!this.bogofReady) {
      this.bogofReady = true;
    }
  }



}