import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class FindingsList {
  public FindingsList() throws InterruptedException {
    Thread.sleep(500);
    System.out.print("\nWelcome back!");
    ArrayList<String> rockList = new ArrayList<String>();
    rockList.add("rock");
    rockList.add("weird rock");
    rockList.add("smooth rock");
    rockList.add("not rock");
    System.out.print("\n\nRocks downloaded successfully!");
    System.out.print("\n" + rockList);

    System.out.print("\nNon-rock detected; deleting...");
    rockList.remove("not rock");
    System.out.print("\n" + rockList);
    System.out.print("\nPerfect");

    Thread.sleep(1000);
    HashMap<String, String> fossils = new HashMap<>();
    fossils.put("Bird Fossil", "This fossil has wings, implying it was capable of flight.");
    fossils.put("Fish Fossil", "This vaguely fish-shaped fossil implies there was once water.");
    fossils.put("Tooth Fossil", "The tooth from an unknown fossil.");
    System.out.print("\n\nFossil data downloaded");

    System.out.print("\nWhich of the fossils would you like to learn more about? (Bird, Fish, Tooth) ");
    Scanner input = new Scanner(System.in);
    String fossilChoice = input.nextLine();
    if (fossilChoice.equalsIgnoreCase("Bird")) {
      System.out.print("Fossil: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice + " Fossil"));
    }
    else if (fossilChoice.equalsIgnoreCase("Fish")) {
      System.out.print("Fossil: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice + " Fossil"));
    }
    else if (fossilChoice.equalsIgnoreCase("Tooth")) {
      System.out.print("Fossil: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice + " Fossil"));
    }

    Thread.sleep(700);
    HashSet<String> supplies = new HashSet<>();
    supplies.add("Flashlight");
    supplies.add("First-Aid Kit");
    supplies.add("Radio");
    System.out.print("\n\nSupplies before Expedition: " + supplies);
    supplies.remove("First-Aid Kit");
    System.out.print("\nSupplies after Expedition: " + supplies);
  }
}