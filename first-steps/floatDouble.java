/**
 * floatDouble
 */

public class floatDouble {
  public static void main(String[] args) {
    // 32 bits
    float myMinFloat = Float.MIN_VALUE;
    float myMaxFloat = Float.MAX_VALUE;
    System.out.println("Float Max: " + myMaxFloat);
    System.out.println("Float Min: " + myMinFloat);

    // 64 bits
    double myMinDouble = Double.MIN_VALUE;
    double myMaxDouble = Double.MAX_VALUE;
    System.out.println("Double Max: " + myMaxDouble);
    System.out.println("Double Min: " + myMinDouble);

    int myInt = 5 / 3;
    float myFloat = 5f / 3f;
    double myDouble = 5.00 / 3.00;
    System.out.println("myInt: " + myInt);
    System.out.println("myFloat: " + myFloat);
    System.out.println("myDouble: " + myDouble);

    // Challenge
    double pounds = 200d;
    double kilos = (pounds * .45359237d);
    System.out.println(kilos);
    System.out.println();
  }
}