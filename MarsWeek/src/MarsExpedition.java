import java.util.Scanner;

public class MarsExpedition {
  public MarsExpedition() throws InterruptedException{
    Scanner input = new Scanner(System.in);
    System.out.print("\nMarsExpedition initialized");
    System.out.print("\nEnter your name: ");
    String name = input.nextLine();
    System.out.print("\nHi, " + name + ". Welcome to the Mars Expedition Prep Program.\nAre you ready to head out into the new world? Type Y or N: ");
    String ans = input.nextLine();
    if (ans.equals("Y")) {
      System.out.print("I knew you would say that. You are the team leader for a reason.");
    }
    else {
      System.out.print("Too bad you are team leader. You have to go.");
    }
    System.out.print("\n\nHow many people do you want on your team? ");
    int teamSize = input.nextInt();
    if (teamSize > 2) {
      System.out.print("That's way too many people. We can only send two more members.");
      teamSize = 2;
    }
    else if (teamSize < 2) {
      System.out.print("That's too few people. We need at least two more members.");
      teamSize = 2;
    }
    else {
      System.out.print("That's a good team!");
    }

    System.out.println("\n\nYou are allowed to bring one snack with you. What do you want to bring? ");
    String snack = input.next();
    System.out.print("Nice choice. You will be bringing a " + snack + " with you.");

    System.out.print("\n\nYou can choose one of three vehicles:\n1. Rover\n2. Exploration Vehicle\n3. Science Van\nEnter the number of the vehicle you want to bring: ");
    String vehicleChoice = input.next();
    if (vehicleChoice.equalsIgnoreCase("1")) {
      vehicleChoice = "Mars Rover";
    }
    else if (vehicleChoice.equalsIgnoreCase("2")) {
      vehicleChoice = "Exploration Vehicle";
    }
    else if (vehicleChoice.equalsIgnoreCase("3")) {
      vehicleChoice = "Science Van";
    }

    System.out.print("\nYour expedition team is now ready!\nLed by: " + name + " with " + teamSize + " teammates.\nTo explore the surface of Mars using: " + vehicleChoice + ".\nRations: " + snack + ".\n");
    for (int i = 5; i > 0; ) {
      System.out.print("\nMission begins in: " + i);
      i -= 1;
      Thread.sleep(1000);
    }
    System.out.print("\nGO GO GO!!!\n");
  }
}