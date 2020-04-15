package prim;

import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] arr2 = { 10, 9, 8, 7, 6, 5, 4, 3, 3, 2, 1 };

    reverse(arr1);
    reverse(arr2);
  }

  public static void reverse(int[] array) {
    // ? With New Arr
    // int[] revArr = new int[array.length];
    // int count = 0;
    // for (int i = revArr.length - 1; i >= 0; i--) {
    // revArr[i] = array[count];
    // count++;
    // }

    // ? Reverse Array in place
    int lastIdx = array.length - 1;
    for (int startIdx = 0; startIdx < array.length / 2; startIdx++) {
      int temp = array[startIdx];
      array[startIdx] = array[lastIdx];
      array[lastIdx] = temp;

      lastIdx--;
    }
    System.out.println("output: " + Arrays.toString(array));
  }

}