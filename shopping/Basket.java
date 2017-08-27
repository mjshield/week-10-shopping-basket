package shopping;

import java.util.ArrayList;

public class Basket {

  private ArrayList<Item> contents;

  public Basket() {
    this.contents = new ArrayList<Item>();
  }

  public Item getItem(int index) {
    Item item = this.contents.get(index);
    return item;
  }

  public void addItem(Item item) {
    this.contents.add(item);
  }

  public void removeItem(int index) {
    this.contents.remove(index);
  }

  public void emptyContents() {
    this.contents.clear();
  }

  public int count() {
    return this.contents.size();
  }

}