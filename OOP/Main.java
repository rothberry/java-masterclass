public class Main {
  public static void main(String[] args) {
    // Creates new object of porsche based on Car()
    // Car porsche = new Car();
    // porsche.setModel("Careera");
    // System.out.println(porsche.getModel());

    // SimpleCalculator calc = new SimpleCalculator();
    // calc.setFirstNumber(190.90);
    // calc.setSecondNumber(9.99);
    // System.out.println(calc.getFirstNumber());
    // System.out.println(calc.getSecondNumber());
    // System.out.println(calc.getClass());

    // Person per = new Person();
    // per.setFirstName("Phil");
    // per.setLastName("Roth");
    // per.setAge(29);
    // System.out.println(per.isTeen());
    // System.out.println(per.getFullName());

    // Account bobsaccount = new Account();
    // Account yolaccount = new Account("12345", 100.0, "Yol", "dmail");
    // Account philaccount = new Account("phil", "gmail");

    // VipCustomer vip = new VipCustomer();

    // System.out.println();

    // Wall wallA = new Wall();
    // Wall wallB = new Wall(100.0,200.0);
    // wallA.setHeight(-50000.0);
    // System.out.println(wallB.getArea());

    // System.out.println(wallA.getHeight());
    // System.out.println(wallB.getHeight());

    Point firstPoint = new Point(6,5);
    Point secondPoint = new Point(3,1);
    System.out.println(firstPoint.distance());
    System.out.println(firstPoint.distance(secondPoint.getX(), secondPoint.getY()));
    System.out.println(firstPoint.distance(2,2));
    Point point = new Point();
    System.out.println(point.distance());

  }
}