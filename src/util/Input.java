package util;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.println(prompt);
        return scanner.next();
    }

    public static boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public static int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.printf("Please enter a number between %d and %d\n", min, max);
            return getInt(min, max, prompt);
        }
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public static double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.printf("Please enter a number between %d and %d\n", min, max);
            return getDouble(min, max, prompt);
        }
    }

    public static double getDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }
}
