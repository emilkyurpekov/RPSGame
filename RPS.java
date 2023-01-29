package  RPS;

import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Enter your choice (rock, paper, scissors):");
            String playerChoice = scanner.nextLine();

            int computerChoice = random.nextInt(3);
            String computerChoiceString;
            if (computerChoice == 0) {
                computerChoiceString = "rock";
            } else if (computerChoice == 1) {
                computerChoiceString = "paper";
            } else {
                computerChoiceString = "scissors";
            }

            System.out.println("You chose " + playerChoice + " and the computer chose " + computerChoiceString + ".");

            if (playerChoice.equals(computerChoiceString)) {
                System.out.println("It's a tie!");
            } else if (playerChoice.equals("rock") && computerChoiceString.equals("scissors") ||
                    playerChoice.equals("paper") && computerChoiceString.equals("rock") ||
                    playerChoice.equals("scissors") && computerChoiceString.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.println("Do you want to play again? (yes or no)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
