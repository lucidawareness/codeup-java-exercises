package main;
import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);

        scanner.useDelimiter("\n");

        System.out.print("Enter an Integer: ");
        int userInput = scanner.nextInt();

//      System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.println("You entered integer: \""+ userInput +"\"");


        System.out.println("You will enter 3 words");
        System.out.println("Enter first word");
        String firstWord = scanner.next();

        System.out.println("Enter second word");
        String secondWord = scanner.next();

        System.out.println("Enter third word");
        String thirdWord = scanner.next();

        System.out.printf("Your entries are: 1st %s, 2nd %s, 3rd %s.%n", firstWord, secondWord, thirdWord);
        scanner.nextLine();

//      Not allowing input for line 34
        System.out.println("Now you will enter a sentence");
        String userInputSentence = scanner.nextLine();

        System.out.println(userInputSentence);

        System.out.println("Calculate a rooms perimeter and area!");
        System.out.println("What is the width of your room?");
        float roomWidth = scanner.nextFloat();

        System.out.println("What is the length of your room?");
        float roomLength = scanner.nextFloat();

        float roomArea = roomLength * roomWidth;
        float roomPerimeter = roomLength * 2 + roomWidth * 2;
        System.out.printf("Your room has an Area of %s and a perimeter of %S.%n", roomArea, roomPerimeter);

        System.out.println("Now lets calculate the volume of your room");
        System.out.println("What is the height of your room?");
        float roomHeight = scanner.nextFloat();
        float roomVolume = roomArea * roomHeight;
        System.out.printf("The volume of your room is %s.%n", roomVolume);
    }
}
