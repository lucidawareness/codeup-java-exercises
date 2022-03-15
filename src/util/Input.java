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
        String s = getString(prompt);
        try {
            while (Integer.parseInt(s) > max || Integer.parseInt(s) < min) {
                if (Integer.parseInt(s) > max) {
                    System.out.printf(s + " is greater than the maximum input of %d\n", max);
                    s = scanner.nextLine().trim();
                } else if (Integer.parseInt(s) < min) {
                    System.out.printf(s + " is less than the minimum input of %d\n", min);
                    s = scanner.nextLine().trim();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(s + " is not a valid input\n");
            s = scanner.nextLine().trim();
        }
        return Integer.parseInt(s);
    }

    public static int getInt(String prompt) {
        String s = getString(prompt);
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println(s + " is not a valid input\n");
            s = scanner.nextLine().trim();
        }
        return Integer.parseInt(s);
    }

    public static double getDouble(double min, double max, String prompt) {
        String s = getString(prompt);
        try {
            while (Double.parseDouble(s) > max || Double.parseDouble(s) < min) {
                if (Double.parseDouble(s) > max) {
                    System.out.printf(s + " is greater than the maximum input of %f\n", max);
                    s = scanner.nextLine().trim();
                } else if (Double.parseDouble(s) < min) {
                    System.out.printf(s + " is less than the minimum input of %f\n", min);
                    s = scanner.nextLine().trim();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(s + " is not a valid input\n");
            s = scanner.nextLine().trim();
        }
        return Double.parseDouble(s);
    }

    public static double getDouble(String prompt) {
        String s = getString(prompt);
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException e) {
            System.out.println(s + " is not a valid input\n");
            s = scanner.nextLine().trim();
        }
        return Double.parseDouble(s);
    }
}
