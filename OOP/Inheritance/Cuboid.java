package Inheritance;

public class Cuboid extends Rectangle {
  private double height;

  public Cuboid(double width, double length, double height) {
    // assume all valid
    super(width, length);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public double getVolume(){
    return getArea() * this.height;
  }

}