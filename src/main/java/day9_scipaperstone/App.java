package day9_scipaperstone;

import java.util.Random;
import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        // String[] choice = { "scissor", "paper", "stone" };
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;
        int counter = 0, counterP = 0, counterC = 0, counterDraw = 0;

        while (playing) {
            // Computer selects random number of 0-2
            Random random = new Random();
            Integer comChoice = random.nextInt(3);

            // Asks the user to input selection
            System.out.println("Choose your option (1 for scissor | 2 for paper | 3 for stone): ");
            String pChoice = scanner.next();
            Integer playerChoice = Integer.parseInt(pChoice) - 1;

            /* 
            Finds out who is the winner or a draw. counts the number of games,
            wins and draw.
            */
            if (playerChoice >= 0 && playerChoice <= 2) {
                switch (comChoice) {
                    case 0:
                        if (playerChoice == 0) {
                            System.out.println("Game is a draw!");
                            counter++;
                            counterDraw++;
                            System.out.println("Do you want to play again? (y/n): ");
                            String contPlaying = scanner.next();
                            if (contPlaying.equals("y")) {
                                continue;
                            } else if (contPlaying.equals("n")) {
                                System.out.println("Total game(s): " + counter);
                                System.out.println("Game(s) drawn: " + counterDraw);
                                System.out.println("Player win(s): " + counterP);
                                System.out.println("Computer win(s): " + counterC);
                                playing = false;
                                break;
                            }
                        } else if (playerChoice == 1) {
                            System.out.println("Computer wins!");
                            counter++;
                            counterC++;
                            System.out.println("Do you want to play again? (y/n): ");
                            String contPlaying = scanner.next();
                            if (contPlaying.equals("y")) {
                                continue;
                            } else if (contPlaying.equals("n")) {
                                System.out.println("Total game(s): " + counter);
                                System.out.println("Game(s) drawn: " + counterDraw);
                                System.out.println("Player win(s): " + counterP);
                                System.out.println("Computer win(s): " + counterC);
                                playing = false;
                                break;
                            }
                        } else if (playerChoice == 2) {
                            System.out.println("Player wins!");
                            counter++;
                            counterP++;
                            System.out.println("Do you want to play again? (y/n): ");
                            String contPlaying = scanner.next();
                            if (contPlaying.equals("y")) {
                                continue;
                            } else if (contPlaying.equals("n")) {
                                System.out.println("Total game(s): " + counter);
                                System.out.println("Game(s) drawn: " + counterDraw);
                                System.out.println("Player win(s): " + counterP);
                                System.out.println("Computer win(s): " + counterC);
                                playing = false;
                                break;
                            }
                        }

                    case 1:
                        if (playerChoice == 0) {
                            System.out.println("Player wins!");
                            counter++;
                            counterP++;
                            System.out.println("Do you want to play again? (y/n): ");
                            String contPlaying = scanner.next();
                            if (contPlaying.equals("y")) {
                                continue;
                            } else if (contPlaying.equals("n")) {
                                System.out.println("Total game(s): " + counter);
                                System.out.println("Game(s) drawn: " + counterDraw);
                                System.out.println("Player win(s): " + counterP);
                                System.out.println("Computer win(s): " + counterC);
                                playing = false;
                                break;
                            }
                        } else if (playerChoice == 1) {
                            System.out.println("Game is a draw!");
                            counter++;
                            counterDraw++;
                            System.out.println("Do you want to play again? (y/n): ");
                            String contPlaying = scanner.next();
                            if (contPlaying.equals("y")) {
                                continue;
                            } else if (contPlaying.equals("n")) {
                                System.out.println("Total game(s): " + counter);
                                System.out.println("Game(s) drawn: " + counterDraw);
                                System.out.println("Player win(s): " + counterP);
                                System.out.println("Computer win(s): " + counterC);
                                playing = false;
                                break;
                            }
                        } else if (playerChoice == 2) {
                            System.out.println("Computer wins!");
                            counter++;
                            counterC++;
                            System.out.println("Do you want to play again? (y/n): ");
                            String contPlaying = scanner.next();
                            if (contPlaying.equals("y")) {
                                continue;
                            } else if (contPlaying.equals("n")) {
                                System.out.println("Total game(s): " + counter);
                                System.out.println("Game(s) drawn: " + counterDraw);
                                System.out.println("Player win(s): " + counterP);
                                System.out.println("Computer win(s): " + counterC);
                                playing = false;
                                break;
                            }
                        }

                    case 2:
                        if (playerChoice == 0) {
                            System.out.println("Computer wins!");
                            counter++;
                            counterC++;
                            System.out.println("Do you want to play again? (y/n): ");
                            String contPlaying = scanner.next();
                            if (contPlaying.equals("y")) {
                                continue;
                            } else if (contPlaying.equals("n")) {
                                System.out.println("Total game(s): " + counter);
                                System.out.println("Game(s) drawn: " + counterDraw);
                                System.out.println("Player win(s): " + counterP);
                                System.out.println("Computer win(s): " + counterC);
                                playing = false;
                                break;
                            }
                        } else if (playerChoice == 1) {
                            System.out.println("Player wins!");
                            counter++;
                            counterP++;
                            System.out.println("Do you want to play again? (y/n): ");
                            String contPlaying = scanner.next();
                            if (contPlaying.equals("y")) {
                                continue;
                            } else if (contPlaying.equals("n")) {
                                System.out.println("Total game(s): " + counter);
                                System.out.println("Game(s) drawn: " + counterDraw);
                                System.out.println("Player win(s): " + counterP);
                                System.out.println("Computer win(s): " + counterC);
                                playing = false;
                                break;
                            }
                        } else if (playerChoice == 2) {
                            System.out.println("Game is a draw");
                            counter++;
                            counterDraw++;
                            System.out.println("Do you want to play again? (y/n): ");
                            String contPlaying = scanner.next();
                            if (contPlaying.equals("y")) {
                                continue;
                            } else if (contPlaying.equals("n")) {
                                System.out.println("Total game(s): " + counter);
                                System.out.println("Game(s) drawn: " + counterDraw);
                                System.out.println("Player win(s): " + counterP);
                                System.out.println("Computer win(s): " + counterC);
                                playing = false;
                                break;
                            }
                        }

                }

            } else {
                System.out.println("You have entered an invalid number!");
                System.out.println("Do you want to try again? (y/n): ");
                String contPlaying = scanner.next();
                if (contPlaying.equals("y")) {
                    continue;
                } else if (contPlaying.equals("n")) {
                    System.out.println("Total game(s): " + counter);
                    System.out.println("Game(s) drawn: " + counterDraw);
                    System.out.println("Player win(s): " + counterP);
                    System.out.println("Computer win(s): " + counterC);
                    playing = false;
                    break;
                }
            } // end of else
        } // End of while
        scanner.close();
    } // end of main
} // end of App
