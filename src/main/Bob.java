package main;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean proceed = true;
        while (proceed) {
            System.out.println("What would you like to say to Bob the lackadaisical teenager?");
            String userInput = scanner.nextLine();
//      If question
            if (userInput.endsWith("?")) {
                System.out.println("Bob: Sure");
//      If exclamation
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.length() == 0) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Would you like to continue talking to Bob?(y/n)");
            String userYesOrNo = scanner.nextLine();
            if (!userYesOrNo.equalsIgnoreCase("y")) {
                proceed = false;
                System.out.println("Goodbye");
            }
        }
        scanner.close();
    }
}

