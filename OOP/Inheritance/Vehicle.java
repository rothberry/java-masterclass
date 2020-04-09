package Inheritance;

public class Vehicle {
  private String name;
  private String size;
  private int velocity;
  private int direction;

  public Vehicle(String name, String size) {
    this.name = name;
    this.size = size;
    this.velocity = 0;
    this.direction = 0;
  }

  public void steer(int direction) {
    this.direction += direction;
    System.out.println("Steering at " + direction);
  }

  public void move(int velocity, int direction) {
    this.velocity = velocity;
    this.direction = direction;
    System.out.println("Moving at " + this.velocity + " by " + this.direction);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public int getVelocity() {
    return velocity;
  }

  public void setVelocity(int velocity) {
    this.velocity = velocity;
  }

  public int getDirection() {
    return direction;
  }

  public void setDirection(int direction) {
    this.direction = direction;
  }
  
}