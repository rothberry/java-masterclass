/**
 * DigitSumChallenge
 */
public class DigitSumChallenge {

  public static void main(String[] args) {
    System.out.println(sumDigits(125));
    System.out.println(sumDigits(4));
  }

  public static int sumDigits(int number) {
    int n = 0;
    int sum = 0;
    System.out.println(Math.pow(10, 0));
    while (number % n != number % (n + 1)) {
      
      sum += ((number % Math.pow(10, (n + 1))) - (number % Math.pow(10, n)) / (Math.pow(10, n)));
    }
    return sum;
  }
}