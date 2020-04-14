package prim;

import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(final String[] args) {
    // final int[] myIntArray = new int[10];
    // myIntArray[5] = 50;

    // final double[] myDoubleArray = new double[10];

    // for (int i = 0; i < myIntArray.length; i++) {
    // myIntArray[i] = i * 10;
    // }
    // printArray(myIntArray);

    int[] myIntegers = getIntegers(5);
    printArray(myIntegers);
    System.out.println("average is " + getAverage(myIntegers));
  }

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