/*
 * Author:      Zak Nizam
 * Date:        June 16, 2026
 * Course:      CSD 402 - Java for Programmers
 * Assignment:  Module 2.2 Programming Assignment
 *
 * Purpose:
 *  This program plays Rock-Paper-Scissors by randomly generating the
 *  computer's selection, prompting the user for a selection, and displaying
 *  the result of the game.
 */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final int ROCK = 1;
    private static final int PAPER = 2;
    private static final int SCISSORS = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int computerSelection = random.nextInt(3) + 1;

        System.out.println("Rock-Paper-Scissors");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.print("Enter your selection: ");

        int userSelection = input.nextInt();

        if (userSelection < ROCK || userSelection > SCISSORS) {
            System.out.println("Invalid selection. Please enter 1, 2, or 3.");
            input.close();
            return;
        }

        System.out.println("Computer selected: " + getSelectionName(computerSelection));
        System.out.println("You selected: " + getSelectionName(userSelection));
        System.out.println("Result: " + getResult(userSelection, computerSelection));

        input.close();
    }

    private static String getSelectionName(int selection) {
        switch (selection) {
            case ROCK:
                return "Rock";
            case PAPER:
                return "Paper";
            case SCISSORS:
                return "Scissors";
            default:
                return "Unknown";
        }
    }

    private static String getResult(int userSelection, int computerSelection) {
        if (userSelection == computerSelection) {
            return "It is a tie.";
        }

        if ((userSelection == ROCK && computerSelection == SCISSORS)
                || (userSelection == PAPER && computerSelection == ROCK)
                || (userSelection == SCISSORS && computerSelection == PAPER)) {
            return "You win.";
        }

        return "The computer wins.";
    }
}