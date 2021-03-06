package composition;

public class PC {
  private Case theCase;
  private Monitor monitor;
  private MotherBoard motherBoard;

  public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
    this.theCase = theCase;
    this.monitor = monitor;
    this.motherBoard = motherBoard;
  }

  private Case getTheCase() {
    return theCase;
  }

  private Monitor getMonitor() {
    return monitor;
  }

  private MotherBoard getMotherBoard() {
    return motherBoard;
  }

}