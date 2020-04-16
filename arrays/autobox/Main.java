package autobox;

import java.util.ArrayList;

class IntClass {
  private int myValue;

  public IntClass(int myValue) {
    this.myValue = myValue;
  }

  public int getMyValue() {
    return myValue;
  }

  public void setMyValue(int myValue) {
    this.myValue = myValue;
  }

}

public class Main {
  public static void main(String[] args) {
    String[] strArray = new String[10];
    int[] intArray = new int[10];

    ArrayList<String> strArrayList = new ArrayList<String>();
    strArrayList.add("Phil");

    ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
    intClassArrayList.add(new IntClass(54));
    Integer integer = new Integer(54);
    Double doubleValue = new Double(12.25);

    ArrayList<Integer> intArrayList = new ArrayList<Integer>();
    for (int i = 0; i <= 10; i++) {
      intArrayList.add(Integer.valueOf(i));
    }
    for (int j = 0; j <= 10; j++) {
      System.out.println(j + " --> " + intArrayList.get(j).intValue());
    }

    Integer myIntValue = 50;

  }
}