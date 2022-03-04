package main;

import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        guessingGame();
    }

    public static void guessingGame() {
        Scanner scanner = new Scanner(System.in);
        int randomNum = ((int) (Math.random() * 100)) + 1;
        boolean correctGuess = false;
        int userGuessesLeft = 10;
        System.out.println("We have generated a number between 1 and 100\nYou will have 10 attempts to guess the number and we will provide hints each time");
        do {
            System.out.println("What is your guess?");
            int userGuess = scanner.nextInt();
            if (userGuess == randomNum) {
                correctGuess = true;
                System.out.printf("GOOD GUESS!\nYou have guesses correctly!\n The correct number was: %d \n", randomNum);
            } else {
                userGuessesLeft -= 1;
                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Please use a number between 1 and 100");
                } else if (userGuess < randomNum && userGuessesLeft > 0) {
                    System.out.println("Higher");
                } else {
                    if (userGuessesLeft > 0) {
                        System.out.println("LOWER");
                    }
                }
                if (userGuessesLeft == 0) {
                    System.out.println("GAME OVER!");
                    System.out.printf("You have %d guesses left!\n", userGuessesLeft);
                    System.out.printf("The correct number was %d\n", randomNum);
                    correctGuess = true;
                }
            }
        } while (!correctGuess);
        System.out.println("Would you like to play again? (y/n)");
        scanner.nextLine();
        String userAnswer = scanner.nextLine();
        if (userAnswer.equalsIgnoreCase("y")) {
            guessingGame();
        } else {
            System.out.println("Goodbye");
        }
        scanner.close();
    }
}
