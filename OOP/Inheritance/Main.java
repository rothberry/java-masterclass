package Inheritance;

public class Main {
  public static void main(String[] args) {
    // Animal animal = new Animal("animal", 1, 1, 5, 5);
    // Dog dog = new Dog("Chauncy", 8, 40, 2, 4, 1, 20, "Brindle");
    // dog.eat();
    // dog.walk();

    // ? Circle => Cylinder
    // Circle circle = new Circle(3.75);
    // System.out.println("cir.rad()= " + circle.getArea());
    // Cylinder first = new Cylinder(5.55, 7.25);
    // System.out.println("cyl.rad()= " + first.getRadius());
    // System.out.println("cyl.ht()= " + first.getHeight());
    // System.out.println("cyl.area()= " + first.getArea());
    // System.out.println("cyl.vol()= " + first.getVolume());

    // ? Rectangle => Cuboid
    Rectangle rectangle = new Rectangle(5, 10);
    System.out.println("rectangle.width= " + rectangle.getWidth());
    System.out.println("rectangle.length= " + rectangle.getLength());
    System.out.println("rectangle.area= " + rectangle.getArea());
    Cuboid cuboid = new Cuboid(5, 10, 5);
    System.out.println("cuboid.width= " + cuboid.getWidth());
    System.out.println("cuboid.length= " + cuboid.getLength());
    System.out.println("cuboid.area= " + cuboid.getArea());
    System.out.println("cuboid.height= " + cuboid.getHeight());
    System.out.println("cuboid.volume= " + cuboid.getVolume());

  }
}