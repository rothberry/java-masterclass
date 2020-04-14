package composition;

public class Main {
  Dimensions dimensions = new Dimensions(20, 20, 5);
  Case newCase = new Case("2200", "dell", "240", dimensions);
  Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
  MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

  PC computer = new PC(newCase, theMonitor, motherBoard);
  
  
}