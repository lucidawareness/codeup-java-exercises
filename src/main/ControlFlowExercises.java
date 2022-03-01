package main;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//      While
        System.out.println("While");
        int i = 5;
        while (i < 15) {
            System.out.println(i);
            i++;
        }
//      Do While +2
        System.out.println("Do while +2");
        int j = 0;
        do {
            System.out.println(j);
            j += 2;
        } while (j <= 100);
//      Do while -5
        System.out.println("Do while -5");
        int hundred = 100;
        do {
            System.out.println(hundred);
            hundred -= 5;
        } while (hundred >= -10);
//      Do while squared
        System.out.println("Do while squared");
        long k = 2;
        do {
            System.out.println(k);
            k *= k;
        } while (k < 1000000);

//      Refactored into for loops
//      For loop -5
        System.out.println("For loop -5");
        for (int l = 100; l >= -10; l -= 5) {
            System.out.println(l);
        }
//      For loop squared
        System.out.println("For loop squared");
        for (long l = 2; l < 1000000; l *= l) {
            System.out.println(l);
        }

//      Fizz Buzz
        System.out.println("Fizz Buzz");
        for (int l = 1; l <= 100; l++) {
            if (l % 3 == 0 && l % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (l % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (l % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(l);
        }

//      Table of powers
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like the table to go to?");
        int userIntInput = scanner.nextInt();

        System.out.print("Here is your table! \n\nNumber | Squared | Cubed\n------ | ------- | -----\n");
        for (int l = 1; l <= userIntInput; l++) {
            int squared = l * l;
            int cubed = l * l * l;
            System.out.printf("%-7d| %-8d| %-6d\n", l, squared, cubed);
        }

//      Convert int grade to letter grades
        System.out.println("What is your grade (0-100)?");
        int gradeInt = scanner.nextInt();
        if (gradeInt <= 59 && gradeInt >=0) {
            System.out.println("Your grade is F");
        } else if (gradeInt <= 66) {
            if (gradeInt > 63) {
                System.out.println("Your grade is D+");
            } else
                System.out.println("Your grade is D-");
        } else if (gradeInt <= 79) {
            if (gradeInt > 73) {
                System.out.println("Your grade is C+");
            } else
                System.out.println("Your grade is C-");
        } else if (gradeInt <= 87) {
            if (gradeInt > 83) {
                System.out.println("Your grade is B+");
            } else
                System.out.println("Your grade is B-");
        } else if (gradeInt <= 100) {
            if (gradeInt > 94) {
                System.out.println("Your grade is A+");
            } else
                System.out.println("Your grade is A-");
        } else {
            System.out.println("Please input a number between 0-100");
        }

    }
}
