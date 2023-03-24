public class Mars {
  public static boolean landingCheck(int minutesLeft) throws InterruptedException {
    for (int minute = 0; minute < minutesLeft; minute++) {
      if (minute % 2 == 0 && minute % 3 == 0) {
        System.out.print("\nKeep Center");
      }
      else if (minute % 2 == 0) {
        System.out.print("\nRight");
      }
      else if (minute % 3 == 0) {
        System.out.print("\nLeft");
      }
      else {
        System.out.print("\nCalculating");
      }
      Thread.sleep(250);
    }
    System.out.print("\n\nLanded!\n");
    return false;
  }

  public static void main(String[] args) throws InterruptedException {
    String colonyName = "Paradise Station";
    int shipPopulation = 300;
    double meals = 4000.00;
    boolean landing = true;

    meals = meals - (shipPopulation * 0.75 * 2);
    System.out.print(meals);
    meals += meals * 0.5;
    shipPopulation += 5;

    String landingLocation = "The Hill";
    if (landingLocation == "The Plain") {
      System.out.print("\nBbzzz Landing on the Plain\n");
    }
    else {
      System.out.print("\nERROR!!! Flight plan already set. Landing on the Plain\n");
    }
    landingCheck(4);

    new GuessingGame();
    new MarsExpedition();
    new FindingsList();
  }
}