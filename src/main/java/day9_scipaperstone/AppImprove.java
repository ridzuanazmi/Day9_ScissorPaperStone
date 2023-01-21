package day9_scipaperstone;

import java.util.Random;
import java.util.Scanner;

public class AppImprove {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // boolean playing = true;
        // int counter = 0, counterP = 0, counterC = 0, counterDraw = 0;

        // Computer selects random number of 0-2
        Random random = new Random();
        Integer comChoice = random.nextInt(3);

        // Asks the user to input selection
        System.out.println("Choose your option (1 for scissor | 2 for paper | 3 for stone): ");
        String pChoice = scanner.next();
        Integer playerChoice = Integer.parseInt(pChoice) - 1;
        scanner.close();

        checkWinner(playerChoice, comChoice);

    } // end of main

    public static void checkWinner(Integer playerChoice, Integer comChoice) {

        if (playerChoice.equals(comChoice)) {
            System.out.println("Game is a draw");
            return;
        }

        switch (comChoice) {
            case 0:
                if (playerChoice == 1)
                    System.out.println("Computer wins!");
                else
                    System.out.println("Player wins!");

            case 1:
                if (playerChoice == 0)
                    System.out.println("Player wins!");
                else
                    System.out.println("Computer wins!");

            case 2:
                if (playerChoice == 1)
                    System.out.println("Computer wins!");
                else
                    System.out.println("Player wins!");

        }
    } // End of checkWinner method

} // end of AppImprove class
