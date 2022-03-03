package main;

import java.util.Scanner;

public class MethodsExercises {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        addition(1, 2);
        subtraction(3, 2);
        multiplication(3, 3);
        divide(3, 1);
        modulus(6, 2);
        multiplicationBonus(5, 10);
        getInteger(1, 10);

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
            System.out.println("Try again");
            return getInteger(min, max);
        }
    }
}
