
public class Floor {
  private double width;
  private double height;

  public Floor(double width, double height) {
    if (width < 0d) {
      width = 0d;
    }
    if (height < 0d) {
      height = 0d;
    }
    this.width = width;
    this.height = height;
  }

  public double getHeight() {
    return this.height;
  }
  public double getWidth() {
    return this.width;
  }
  public double getArea(){
    return this.height * this.width;
  }
}