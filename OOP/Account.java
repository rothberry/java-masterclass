public class Account {
  private String number;
  private double balance;
  private String customerName;
  private String customerEmail;

  public Account() {
    this("12345", 2.50, "Default Name", "Default Email");
  }

  public Account(String customerName, String customerEmail) {
    this("99999", 0.0, customerName, customerEmail);
  }

  public Account(String number, double balance, String customerName, String customerEmail) {
    this.number = number;
    this.balance = balance;
    this.customerName = customerName;
    this.customerEmail = customerEmail;
  }

}