package prim;

import java.util.ArrayList;

public class GroceryList {
  private ArrayList<String> groceryList = new ArrayList<String>();

  public void addGroceryItem(String item) {
    groceryList.add(item);
  }

  public void printGroceryList() {
    System.out.println("You have " + groceryList.size() + " items");
    for (int i = 0; i < groceryList.size(); i++) {
      System.out.println((i + 1) + ". " + groceryList.get(i));
    }
  }

  public void modifyGroceryItem(String newItem) {
    int position = findItem(newItem);
    if (position >= 0) {
      modifyGroceryItem(position, newItem);
    }
  }

  private void modifyGroceryItem(int position, String newItem) {
    groceryList.set(position, newItem);
    System.out.println("Item " + (position + 1) + "has been modded");
  }

  public void removeItem(String item) {
    int position = findItem(item);
    if (position >= 0) {
      groceryList.remove(position);
    }
  }

  private void removeItem(int position) {
    String theItem = groceryList.get(position);
    groceryList.remove(position);
  }

  public int findItem(String searchItem) {
    // boolean exists = groceryList.contains(searchItem);
    // if (exists) {
    // return searchItem;
    // }
    // return "Nah";
    // int position = groceryList.indexOf(searchItem);
    // if (position >= 0) {
    // return groceryList.get(position);
    // }
    // return null;
    return groceryList.indexOf(searchItem);
  }

}