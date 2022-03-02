package main;

public class StringExercise {
    public static void main(String[] args) {
        String string = "We don't need no education\n" + "We don't need no thought control";
        System.out.println(string);

        System.out.println(string.replace(string, "Check \"this\" out!, \"s inside of \"s!"));
        System.out.println(string.replace(string, "In windows, the main drive is usually C:\\"));
        System.out.println(string.replace(string, "I can do backslashes \\, double backslashes \\\\,\n" + "and the amazing triple backslash \\\\\\!"));
    }
}