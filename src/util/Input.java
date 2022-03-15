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
        while (true) {
            System.out.printf("%s", prompt);
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();
                scanner.nextLine();
                if (result >= min && result <= max) {
                    return result;
                }
            }
            // if you get here, you did not type an int
            scanner.nextLine();
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
            System.out.printf("Please enter a number between %f and %f\n", min, max);
            return getDouble(min, max, prompt);
        }
    }

    public static double getDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }
}
