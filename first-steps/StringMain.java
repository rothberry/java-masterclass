/**
 * StringMain
 */
public class StringMain {
  public static void main(String[] args) {
    // byte
    // short
    // !int
    // long
    // float
    // !double
    // char
    // !boolean
    // String is not a primitive datatype

    String myString = "This is a String";
    System.out.println("myString is: " + myString);
    myString = myString + ", and my Name a jeff.";
    System.out.println("myString is: " + myString);
    myString = myString + "\u00A9 2020";
    System.out.println("myString is: " + myString);
    String numberString = "250.55";
    numberString = numberString + "49.95";
    System.out.println("myNumString is: " + numberString);
    int myInt = 50;
    String lastString = "10";
    lastString = lastString + myInt;
    System.out.println("Last String: " + lastString);
  }
}