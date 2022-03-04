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
        int userAttempts = 1;
        System.out.println("Welcome to the guessing game.\nWe have generated a number between 1 and 100.\nYou will have 10 attempts to guess the number and we will provide hints each time.");
        do {
            System.out.print(ordinalNumbers(userAttempts));
            int userGuess = scanner.nextInt();
            if (userGuess == randomNum) {
                correctGuess = true;
                System.out.printf("GOOD GUESS!\nYou have guessed correctly!\n The correct number was: %d \n", randomNum);
            } else {
                userGuessesLeft -= 1;
                userAttempts += 1;
                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Please use a number between 1 and 100");
                } else if (userGuess < randomNum && userGuessesLeft > 0) {
                    System.out.println("\n--(Higher)--");
                } else {
                    if (userGuessesLeft > 0) {
                        System.out.println("\n--(LOWER)--");
                    }
                }
                if (userGuessesLeft == 0) {
                    System.out.println("\n\nGAME OVER!");
                    System.out.printf("The correct number was %d\n", randomNum);
                    correctGuess = true;
                } else {
                    System.out.printf("\nYou have %d guesses left!\n", userGuessesLeft);
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

    public static String ordinalNumbers(int userAttempts){
        if (userAttempts == 1) {
            return "\nWhat is your " + userAttempts + "st guess?: ";
        } else if (userAttempts == 2) {
            return "\nWhat is your " + userAttempts + "nd guess?: ";
        } else if (userAttempts == 3) {
            return "\nWhat is your " + userAttempts + "rd guess?: ";
        } else {
            return "\nWhat is your " + userAttempts + "th guess?: ";
        }
    }
}
