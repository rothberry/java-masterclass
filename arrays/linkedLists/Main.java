package linkedLists;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // Customer customer = new Customer("Phil", 1200.02);
    // Customer anotherCustomer = customer;
    // anotherCustomer.setBalance(12.10);
    // System.out.println("balance " + customer.getBalance());

    ArrayList<Integer> intList = new ArrayList<Integer>();
    intList.add(1);
    intList.add(3);
    intList.add(4);
    printList(intList);

  }

  public static void printList(ArrayList<Integer> list) {
    System.out.println();
    for (int i = 0; i < list.size(); i++) {
      System.out.println(i + " : " + list.get(i));
    }
  }
}