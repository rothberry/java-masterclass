/**
 * MegaBytesConverter
 */
public class MegaBytesConverter {

  public static void main(String[] args) {
    printMegaBytesAndKiloBytes(2500);
  }

  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    // "XX KB = YY MB and ZZ KB"
    if (kiloBytes < 0) {
      System.out.println("Invalid Value");
    } else {
      int megaBytes = Math.round(kiloBytes / 1024);
      int remainingKilos = kiloBytes % 1024;
      System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilos + " KB");

    }
  }
}