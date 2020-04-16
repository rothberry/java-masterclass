package linkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    LinkedList<String> placesToVisit = new LinkedList<String>();
    addInOrder("Sydney", placesToVisit);
    addInOrder("Melbourne", placesToVisit);
    addInOrder("Brisbane", placesToVisit);
    addInOrder("Perth", placesToVisit);
    addInOrder("Camberra", placesToVisit);
    addInOrder("Adelaide", placesToVisit);
    addInOrder("Darwin", placesToVisit);
    printList(placesToVisit);
    // // ? Insert
    // placesToVisit.add(1, "Alice Springs");
    // printList(placesToVisit);
    // // ? Remove
    // placesToVisit.remove(4);
    // printList(placesToVisit);

  }

  private static boolean addInOrder(String newCity, LinkedList<String> linkedList) {
    // ListIterator can go backwards
    ListIterator<String> stringListIterator = linkedList.listIterator();
    // Setting up iterator starts before list, so we need to use .next() inside of loop
    while (stringListIterator.hasNext()) {
      int comparison = stringListIterator.next().compareTo(newCity);
      if (comparison == 0) {
        // do not add
        System.out.println(newCity + " is already included");
        return false;
      } else if (comparison > 0) {
        // newCity should be added before this city
        stringListIterator.previous();
        stringListIterator.add(newCity);
        return true;
      }
    }
    stringListIterator.add(newCity);
    return true;
  }

  private static void visit(LinkedList<String> cities) {
    Scanner scanner = new Scanner(System.in);

    boolean quit = false;
    ListIterator<String> listIterator = cities.listIterator();

    if (cities.isEmpty() ) {
      System.out.println("No Cities");
      return;
    } else {
      System.out.println("Now visiting " + listIterator.next());
    }

  }

  private static void printList(LinkedList<String> linkedList) {
    Iterator<String> i = linkedList.iterator();
    while (i.hasNext()) {
      System.out.println("Now visiting " + i.next());
    }
    System.out.println("=======================");
  }
}