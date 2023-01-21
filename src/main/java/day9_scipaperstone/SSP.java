package day9_scipaperstone;

import java.util.Random;

public class SSP {

    Boolean playing = true;

    public Integer generateComputerChoice() {
        Random random = new Random();
        return random.nextInt(3);
        // 0: Scissor 1: Paper 2: Stone
    }

    public Boolean checkWinnerOrDraw(Integer playerChoice, Integer computerChoice) {

        playerChoice -= 1;

        switch (playerChoice) {
            case 0:
                switch (computerChoice) {
                    case 0:
                        System.out.println("Game is draw");
                        return false;
                    case 1:
                        System.out.println("Player wins!");
                        return false;
                    case 2:
                        System.out.println("Computer wins!");
                        return false;
                }
                break;

            case 1:
                switch (computerChoice) {
                    case 0:
                        System.out.println("Computer wins!");
                        return false;
                    case 1:
                        System.out.println("Game is draw");
                        return false;
                    case 2:
                        System.out.println("Player wins!");
                        return false;
                }
                break;

            case 2:
                switch (computerChoice) {
                    case 0:
                        System.out.println("Player wins");
                        return false;
                    case 1:
                        System.out.println("Computer wins!");
                        return false;
                    case 2:
                        System.out.println("Game is draw");
                        return false;
                }
                break;

               
        }
        return false;
    }

    // public String checkTie(Integer playerChoice, Integer computerChoice) {

    //     if (playerChoice.equals(computerChoice)) {
    //         System.out.println("Game is tied");
    //         return "";
    //     } else {

    //     }

    // }
}
