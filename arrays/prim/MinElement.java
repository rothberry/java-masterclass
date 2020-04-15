package prim;

public class MinElement {
  public static void main(String[] args) {
    int[] arr1 = { 5, 6, 7, 8, 9, 21, 5, 6, 5, 3, 5, 10 };
    int[] arr2 = { 10, 9, 8, 7, 6, 5, 4, 3, 3, 2, 1 };

    findMin(arr1);
    findMin(arr2);
  }

  public static int findMin(int[] array) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
        // System.out.println(min);
      }
    }
    System.out.println(min);
    return min;
  }
}