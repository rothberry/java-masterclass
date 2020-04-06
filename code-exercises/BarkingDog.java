/**
 * BarkingDog
 */
public class BarkingDog {

  public static void main(String[] args) {
    System.out.println(shouldWakeUp(true, 1) // true

    );
    shouldWakeUp(false, 2); // false
    shouldWakeUp(true, 8); // false
    shouldWakeUp(true, -1); // false
  }

  public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {
    if (hourOfTheDay < 0 || hourOfTheDay > 23) {
      return false;
    } else if (hourOfTheDay < 8 || hourOfTheDay > 22) {
      return barking;
    } else {
      return barking;
    }
  }
}