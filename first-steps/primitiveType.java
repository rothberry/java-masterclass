/**
 * primitiveType
 */
public class primitiveType {

  public static void main(String[] args) {
    // 32 bits
    int myMax = Integer.MAX_VALUE;
    int myMin = Integer.MIN_VALUE;
    System.out.println("Integer Max: " + myMax);
    System.out.println("Integer Min: " + myMin);
    // System.out.println("Busted Max: " + (myMax + 1));
    // System.out.println("Busted Min: " + (myMin - 1));

    // 16 bits
    short myMinShort = Short.MIN_VALUE;
    short myMaxShort = Short.MAX_VALUE;
    System.out.println("Short Max: " + myMaxShort);
    System.out.println("Short Min: " + myMinShort);
    // short bigShort = 32767;

    // 8 bits
    byte myMinByte = Byte.MIN_VALUE;
    byte myMaxByte = Byte.MAX_VALUE;
    System.out.println("Byte Max: " + myMaxByte);
    System.out.println("Byte Min: " + myMinByte);

    // 64 bits
    // long myLongValue = 100;
    // long bigLongValue = 2_147_483_647_234L;
    long myMinLong = Long.MIN_VALUE;
    long myMaxLong = Long.MAX_VALUE;
    System.out.println("Long Max: " + myMaxLong);
    System.out.println("Long Min: " + myMinLong);

    int myTotal = (myMin / 2);
    byte myByteTotal = (byte) (myMinByte / 2);
    short myNewShortValue = (short) (myMinShort / 2);

    // Challenge
    byte myByte = 120;
    short myShort = 4200;
    int myInt = 70_007_807;
    long myLong = (long) 50000 + 10 * (myByte + myShort + myInt);
    System.out.println(myLong);
  }

}
