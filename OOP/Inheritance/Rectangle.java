package Inheritance;

public class Rectangle {
  private double width;
  private double length;

  public Rectangle(double width, double length) {
    // assume all valid
    this.width = width;
    this.length = length;
  }

  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

  public double getArea() {
    return this.width * this.length;
  }

}