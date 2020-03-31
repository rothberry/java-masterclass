/**
 * Operators
 */
public class Operators {
  public static void main(String[] args) {
    // operand is a term used to describe any object manipulated by a operator
    // expression is a way of combining operands and operators to create a result
    int result = 1 + 2;
    System.out.println("1 + 2 = " + result);
    int prevResult = result;
    System.out.println("prevRes: " + prevResult);
    result -= 1;
    System.out.println("3 - 1 = " + result);
    System.out.println("prevRes: " + prevResult);

    result *= 10;
    System.out.println("2 * 10 = " + result);
    result /= 5;
    System.out.println("20 / 5 = " + result);
    result %= 3;
    System.out.println("4 % 3 = " + result);

    boolean isAlien = false;
    if (isAlien == true) {
      System.out.println("Is not alien!");
    }

    int topScore = 80;
    if (topScore < 100) {
      System.out.println("You got the high score!");
    }
    int secondTopScore = 81;
    if ((topScore > secondTopScore) && (topScore < 100)) {
      System.out.println("greater than 2nd top score and less than 60");
    }
    if ((topScore > 90) || (secondTopScore <= 90)) {
      System.out.println("Either or both are true");
    }

    
    boolean isCar = true;
    boolean wasCar = isCar ? true : false;
    if (wasCar) {
      System.out.println("wasCar is true");
    }
  }
}