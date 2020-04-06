/**
 * CalculateInterest
 */
public class CalculateInterest {

  public static void main(String[] args) {
    // System.out.println(calcInterest(10000.0, 2.0));
    // System.out.println(calcInterest(10000.0, 3.0));
    // System.out.println(calcInterest(10000.0, 4.0));
    // System.out.println(calcInterest(10000.0, 5.0));
    
    for (double i = 1.0; i < 6.0; i++) {
      System.out.println(calcInterest(10000.0, i));
    }
  }

  public static double calcInterest(double amount, double interestRate) {
    return (amount * (interestRate / 100));
  }
}