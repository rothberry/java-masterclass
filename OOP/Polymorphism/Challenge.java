package Polymorphism;

class Car {
  private String name;
  private int cylinder;
  private int doors;

  public Car(String name, int cylinder, int doors) {
    this.name = name;
    this.cylinder = cylinder;
    this.doors = doors;
  }

  public String getName() {
    return name;
  }

  public int getCylinder() {
    return cylinder;
  }

  public int getDoors() {
    return doors;
  }

  public void startEngine() {
    System.out.println("Car.startEngine()");
  }

  public void accelerate() {
    System.out.println("Car accelerating");
  }

  public void brake() {
    System.out.println("Car is braking");
  }
}

class Blazer extends Car {

  public Blazer() {
    super("Blazer", 6, 4);
  }

  @Override
  public void startEngine() {
    System.out.println("Blazer is starting");
  }
}

class Escape extends Car {
  public Escape() {
    super("Escape", 4, 2);
  }

  @Override
  public void startEngine() {
    System.out.println("Escape is starting");
  }

  @Override
  public void brake() {
    System.out.println("escape is braking");
  }
}

class Caddy extends Car {
  public Caddy() {
    super("Caddy", 4, 2);
  }

  @Override
  public void accelerate() {
    System.out.println("caddy moving");
  }

  @Override
  public void brake() {
    System.out.println("caddy stops");
  }

  @Override
  public void startEngine() {
    System.out.println("caddy starting");
  }
}

public class Challenge {
  public static void main(String[] args) {
    Car car = new Car("base", 2, 2);
    car.startEngine();
    car.accelerate();
    car.brake();

    Blazer blazer = new Blazer();
    blazer.accelerate();
    blazer.startEngine();
  }

}