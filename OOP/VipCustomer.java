
public class VipCustomer {

  private String name;
  private double creditLimit;
  private String email;

  public VipCustomer(String name, double creditLimit, String email) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public VipCustomer() {
  this("Default", 100.0, "default@mail.com");
  }

  public VipCustomer(String name, double creditLimit) {
    this(name, creditLimit, "unknown@email.com");
  }
}