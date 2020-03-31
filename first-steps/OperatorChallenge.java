/**
 * OperatorChallenge
 */
public class OperatorChallenge {
  public static void main(String[] args) {
    // Create double variable val 20.00
    // create double var val 80.00
    // add both numbers together and multiply by 100.00
    // use the remainer of 40.00
    // create boolean var says true if #4 is 0
    // output boolean
    // if-then statement got some remainder if bool is true

    double first = 20.00d;
    double second = 80.00d;
    double sum = (first + second) * 100.00d;
    System.out.println(sum);
    double remainder = sum % 40.00d;
    System.out.println(remainder);
    boolean isMod = (remainder == 0) ? true : false;
    System.out.println(isMod);
    if (!isMod) {
      System.out.println("Got some");
    }
  }

}