/**
 * fiveAndThree
 */
public class fiveAndThree {

  public static void main(String[] args) {
    // int counter = 0;
    // int sum = 0;
    // for (int i = 1; i < 1000; i++) {
    // if (i % 3 == 0 && i % 5 == 0) {
    // System.out.println(i);
    // sum += i;
    // counter++;
    // }
    // if (counter == 5) {
    // break;
    // }
    // }
    // System.out.println(sum);

    // ? sumOdd
    // System.out.println(sumOdd(1, 100));
    // System.out.println(sumOdd(-1, 100));
    // System.out.println(sumOdd(100, 100));
    // System.out.println(sumOdd(13, 13));
    // System.out.println(sumOdd(100, -100));
    // System.out.println(sumOdd(100, 1000));

    // ? sumEven
    System.out.println(sumEven(1, 100));
    // System.out.println(sumEven(-1, 100));
    // System.out.println(sumEven(100, 100));
    // System.out.println(sumEven(13, 13));
    // System.out.println(sumEven(100, -100));
    // System.out.println(sumEven(100, 1000));

  }

  public static boolean isOdd(int number) {
    if (number < 0 || number % 2 == 0) {
      return false;
    }
    return true;
  }

  public static int sumOdd(int start, int end) {
    // use for loop to sum all odd number in range
    if (start < 0 || start > end) {
      return -1;
    }
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (isOdd(i)) {
        sum += i;
      }
    }
    return sum;
  }

  public static boolean isEven(int number) {
    if (number < 0 || number % 2 != 0) {
      return false;
    }
    return true;
  }

  public static int sumEven(int start, int end) {
    if (start < 0 || start > end) {
      return -1;
    }
    int sum = 0;
    int counter = start;
    while (counter < end) {
      if (counter % 2 == 0) {
        sum += counter;
      }
      counter++;
    }
    return sum;
  }
}