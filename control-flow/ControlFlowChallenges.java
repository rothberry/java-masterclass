import java.util.Hashtable;

/**
 * ControlFlowChallenges
 */
public class ControlFlowChallenges {

  public static void main(String[] args) {
    // ? Number Palindrome
    // System.out.println(NumberPalindrome(-1221));
    // System.out.println(NumberPalindrome(707));
    // System.out.println(NumberPalindrome(11212));
    // System.out.println(NumberPalindrome(0));
    // ? Sum first last
    // System.out.println(sumFirstAndLastDigit(252));  // 4
    // System.out.println(sumFirstAndLastDigit(257));  // 9
    // System.out.println(sumFirstAndLastDigit(0));    // 0
    // System.out.println(sumFirstAndLastDigit(5));    // 10
    // System.out.println(sumFirstAndLastDigit(-10));  // -1
    // ? even sum
    // System.out.println(getEvenDigitSum(123456789));  // 20
    // System.out.println(getEvenDigitSum(252));  // 20
    // System.out.println(getEvenDigitSum(-1290));  // 20
    // ? shared digit
    // System.out.println(hasSharedDigit(12, 23));
    // System.out.println(hasSharedDigit(0, 99));
    // System.out.println(hasSharedDigit(15,55));
  }

  // public static boolean hasSharedDigit(int firstNum, int secondNum) {
  // make hash table and increase if it exist, rtn true if anything greater than 2
  //   if (firstNum < 10 || secondNum > 99) {
  //     return false;
  //   }
  //   int firstNumDigitOne = firstNum % 10;
  //   int firstNumDigitTwo = firstNum % 100 / 10;
  //   int secondNumDigitOne = secondNum % 10;
  //   int secondNumDigitTwo = secondNum % 100 / 10;
  // }

  public static int getEvenDigitSum(int number) {
    if (number < 0) {
      return -1;
    }
    int sum = 0;
    while (number > 0)  {
      int digit = number % 10;
      if (digit % 2 == 0) {
        sum += digit;
      }
      number /= 10;
    }
    return sum;
  }

  public static int sumFirstAndLastDigit(int number) {
    if (number < 0 ) {
      return -1;
    }
    int reverseNumber = Reverse(number);
    int firstDigit = number % 10;
    int lastDigit = reverseNumber % 10;
    return firstDigit + lastDigit;
  }

  public static boolean NumberPalindrome(int number) {
    number = Math.abs(number);
    int reverseNumber = Reverse(number);
    return number == reverseNumber;
  }

  public static int Reverse(int number) {
    int output = 0;
    while (number > 0) {
      int lastDigit = number % 10;
      output = output * 10 + lastDigit;
      number /= 10;
    }
    return output;
  }
}