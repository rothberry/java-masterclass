/**
 * SpeedConverter
 */
public class SpeedConverter {

  public static long toMilesPerHour(double kilometersPerHour) {

    if (kilometersPerHour < 0) {
      return -1;
    } else {
      return 0.621371 * kilometersPerHour;
    }

  }
}
