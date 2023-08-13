/*
Source Code: RcokPaperScissor.java
Author: Mirna Farahat
Description: A program with sentinel loop structure which allows the user to 
repeatedly play the game until a sentinel value of -1 is entered, to 
indicate that the loop should exit and the program’s win/lose/draw 
totals should be output.
 */

import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* declaring variables to keep count of player and computer wins, and draw */
        int pWins = 0, cWins = 0, draw = 0;

        /* running an infinite loop that will continue until user enters negative value */
        while (true) {
            // Generate a random integer 0, 1, or 2
            int computer = (int) (Math.random() * 3);

            // Prompt the user to enter a number 0, 1, or 2
            System.out.print("scissor (0), rock (1), paper (2): ");
            int user = input.nextInt();

            if (user < 0) {
                break;
            }

            System.out.print("The computer is ");
            switch (computer) {
                case 0:
                    System.out.print("scissor.");
                    break;
                case 1:
                    System.out.print("rock.");
                    break;
                case 2:
                    System.out.print("paper.");
            }

            System.out.print(" You are ");
            switch (user) {
                case 0:
                    System.out.print("scissor");
                    break;
                case 1:
                    System.out.print("rock");
                    break;
                case 2:
                    System.out.print("paper ");
            }

            // Display result
            if (computer == user) {
                System.out.println(" too. It is a draw");
                draw = draw + 1;
            } else {
                boolean win = (user == 0 && computer == 2)
                        || (user == 1 && computer == 0)
                        || (user == 2 && computer == 1);
                if (win) {
                    System.out.println(". You won");
                    pWins = pWins + 1;
                } else {
                    System.out.println(". You lose");
                    cWins = cWins + 1;
                }
            }
        }

        /* displaying the program results */
        System.out.println("\nProgram Results");
        System.out.println("---------------");
        System.out.println("Rounds played: " + (pWins + cWins + draw));
        System.out.println("Player wins: " + pWins);
        System.out.println("Computer wins: " + cWins);
        System.out.println("Draws: " + draw);
    }
}
