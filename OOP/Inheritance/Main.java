package Inheritance;

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal("animal", 1, 1, 5, 5);
    Dog dog = new Dog("Chauncy", 8, 40, 2, 4, 1, 20, "Brindle");
    dog.eat();
    dog.walk();
  }
}