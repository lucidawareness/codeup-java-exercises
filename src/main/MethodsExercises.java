package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsExercises {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        addition(1, 2);
        subtraction(3, 2);
        multiplication(3, 3);
        divide(3, 1);
        modulus(6, 2);
        multiplicationBonus(5, 10);
        getInteger(1, 10);
        factorial();
        diceRoll();

    }

    private static void addition(int i, int i1) {
        System.out.println(i + i1);
    }

    private static void subtraction(int i, int i1) {
        System.out.println(i - i1);
    }

    private static void multiplication(int i, int i1) {
        System.out.println(i * i1);
    }

    private static void divide(int i, int i1) {
        if (i1 == 0 || i == 0){
            System.out.println("You cannot divide by zero!\nTry again");
            System.out.println("Enter first number");
            int userInput1 = scanner.nextInt();
            System.out.println("Enter second number");
            int userInput2 = scanner.nextInt();
            divide(userInput1, userInput2);
        }
        System.out.println(i / i1);
    }

    private static void modulus(int i, int i1) {
        System.out.println(i % i1);
    }

    private static void multiplicationBonus(int i, int i1) {
        int result = 0;
        for (int j = 0; j < i1; j++) {
            result += i;
        }
        System.out.println(result);
    }

    public static int getInteger(int min, int max) {
        System.out.println("Enter a number between 1 and 10: ");
        int userNumber = scanner.nextInt();
        if (userNumber >= min && userNumber <= max) {
            System.out.println("Good job!");
            return userNumber;
        } else {
            System.out.println("Input not between 1 and 10\nTry again");
            return getInteger(min, max);
        }
    }

    public static void factorial() {
        boolean proceed = true;
        do {
            System.out.println("Please enter a number 1 and 20 to find it's factorial number");
            int userNum = scanner.nextInt();
            if (userNum <= 20 && userNum >= 1) {
                long factorial = 1;
                for (int i = 1; i <= userNum; i++) {
                    factorial = factorial * i;
                }
                System.out.printf("The factorial of %d! is %,d%n",userNum, factorial);
            } else {
                System.out.println("Please input a number between 1 and 20");
            }

            scanner.nextLine();
            System.out.println("Would you like to try a different number? (y/n)");
            String userAnswer = scanner.nextLine();
            if (!userAnswer.equalsIgnoreCase("y")) {
                proceed = false;
                System.out.println("Factorial calculator: Goodbye!");
            }
        } while (proceed);
    }

    public static void diceRoll() {
        boolean proceed = true;
        do {
            System.out.println("How many sides do you want your pair of dices to have?");
            int userDiceInput = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Press enter/return to roll your pair of dice");
            scanner.nextLine();
            int diceRoll1 = generateRandomNum(userDiceInput);
            int diceRoll2 = generateRandomNum(userDiceInput);
            System.out.printf("Roll 1: %d%n", diceRoll1);
            System.out.printf("Roll 2: %d%n", diceRoll2);
            System.out.println("Would you like to roll again? (y/n)");
            String userAnswer = scanner.nextLine();
            if (!userAnswer.equalsIgnoreCase("y")) {
                proceed = false;
            }
        } while (proceed);
        System.out.println("Dice game: Goodbye!");
    }

    public static int generateRandomNum(int num) {
        return (int) (Math.random() * num) + 1;
    }
}
