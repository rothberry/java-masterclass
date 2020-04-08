/**
 * DigitSumChallenge
 */
public class DigitSumChallenge {
  public static void main(String[] args) {
    System.out.println(sumDigits(125));
    System.out.println(sumDigits(12649));
  }

  public static int sumDigits(int number) {
    if (number < 10) {
      return -1;
    }
    int sum = 0;
    while (number > 0) {
      int digit = number % 10;
      sum += digit;
      number /= 10;
      // sum += ((number % Math.pow(10, (n + 1))) - (number % Math.pow(10, n)) / (Math.pow(10, n)));
    }
    return sum;
  }
}