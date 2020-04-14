package prim;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    // Sort input array in desc order from the keyboard
    int[] values = getIntegers(5);
    System.out.println("initial");
    printArray(values);
    int[] sorted = sortIntegers(values);
    System.out.println("Sorted");
    printArray(sorted);
    int[] testVal = { 1, 2, 3, 4, 5 };
    int[] testSort = sortIntegers(testVal);
    printArray(testSort);
  }

  public static void printArray(int[] myIntArray) {
    for (int i = 0; i < myIntArray.length; i++) {
      // System.out.println("element " + i + " val of " + myIntArray[i]);
      System.out.println("val of " + myIntArray[i]);
    }
  }

  public static int[] getIntegers(int number) {
    System.out.println("enter " + number + " integer values.\r");
    int[] values = new int[number];
    for (int i = 0; i < values.length; i++) {
      values[i] = scanner.nextInt();
    }
    return values;
  }

  public static int[] sortIntegers(int[] array) {
    int[] sortedArray = Arrays.copyOf(array, array.length);
    // int[] sortedArray = new int[array.length];
    // for (int i = 0; i < array.length; i++) {
    // sortedArray[i] = array[i];
    // }
    boolean flag = true;
    int temp;
    int count = 0;

    while (flag) {
      count++;
      System.out.println("count is " + count);
      flag = false;
      for (int i = 0; i < sortedArray.length - 1; i++) {
        if (sortedArray[i] < sortedArray[i + 1]) {
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i + 1];
          sortedArray[i + 1] = temp;
          flag = true;
        }
      }
    }
    return sortedArray;

  }

}