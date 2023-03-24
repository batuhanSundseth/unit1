import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class GuessingGame {
  public GuessingGame() {
    System.out.print("\nEnter your name: ");
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();

    System.out.print("Greetings, " + name + "!\n\nI'm thinking of a number between 1 and 100.\nTry guessing what it is: ");
    Random rand = new Random();
    int randNum = rand.nextInt(100);
    int tries = 0;
    while (true) {
      int guess;

      try {
        guess = scan.nextInt();
      }
      catch (InputMismatchException e) {
        String misinput = scan.next();
        System.out.print(misinput + " is not an integer. Try again: ");
        continue;
      }

      if (guess < 1 || guess > 100) {
        System.out.print("\n" + guess + " is not a valid number. Try again: ");
        continue;
      }

      tries += 1;

      if (randNum > guess) {
        System.out.print("Too low! Try again: ");
      }
      else if (randNum < guess) {
        System.out.print("Too high! Try again: ");
      }
      else {
        System.out.print("Well done, " + name + "!\nYou found my number in " + tries + " tries.\n");
        break;
      }
    }
  }
}