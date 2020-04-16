package prim;

import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
  private static GroceryList groceryList = new GroceryList();

  public static void main(final String[] args) {
    // final int[] myIntArray = new int[10];
    // myIntArray[5] = 50;

    // final double[] myDoubleArray = new double[10];

    // for (int i = 0; i < myIntArray.length; i++) {
    // myIntArray[i] = i * 10;
    // }
    // printArray(myIntArray);

    // int[] myIntegers = getIntegers(5);
    // printArray(myIntegers);
    // System.out.println("average is " + getAverage(myIntegers));

    // ? GroceryList
    boolean quit = true;
    int choice = 0;
    printInstructions();
    while (quit) {
      System.out.println("Enter your Choice: ");
      choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 0:
          printInstructions();
          break;
        case 1:
          groceryList.printGroceryList();
          ;
          break;
        case 2:
          addItem();
          break;
        case 3:
          modItem();
          break;
        case 4:
          deleteItem();
          break;
        case 5:
          searchForItem();
          break;
        case 6:
          quit = false;
          break;

      }
    }

  }

  // ?????????????????????????????????????
  private static void addItem() {
    System.out.print("Add Item: ");
    groceryList.addGroceryItem(scanner.nextLine());
  }

  private static void modItem() {
    // System.out.print("Enter Number: ");
    // int itemNum = scanner.nextInt();
    System.out.print("New Item: ");
    String newItem = scanner.nextLine();
    // groceryList.modifyGroceryItem(itemNum - 1, newItem);
  }

  private static void deleteItem() {
    System.out.print("Enter Number: ");
    // groceryList.removeItem(scanner.nextInt() - 1);
  }

  private static void searchForItem() {
    System.out.print("Seach Term: ");
    String term = scanner.nextLine();
    if (groceryList.findItem(term) >= 0) {
      System.out.println("Found in list");
    } else {
      System.out.println("Search Item not in list");
    }
  }

  private static void printInstructions() {
    System.out.println("\nPress ");
    System.out.println("\t 0 - Print Options.");
    System.out.println("\t 1 - Print Grocery List.");
    System.out.println("\t 2 - Add Item to list.");
    System.out.println("\t 3 - Modify Item on list.");
    System.out.println("\t 4 - Remove Item from list.");
    System.out.println("\t 5 - Search for item on list.");
    System.out.println("\t 6 - Quit Program.");
  }

  // ?????????????????????????????????????
  public static int[] getIntegers(int number) {
    System.out.println("enter " + number + " integer values.\n");
    int[] values = new int[number];
    for (int i = 0; i < values.length; i++) {
      values[i] = scanner.nextInt();
    }
    return values;
  }

  public static void printArray(int[] myIntArray) {
    for (int i = 0; i < myIntArray.length; i++) {
      System.out.println("element " + i + " val of " + myIntArray[i]);
    }
  }

  public static double getAverage(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return (double) sum / (double) array.length;
  }
}