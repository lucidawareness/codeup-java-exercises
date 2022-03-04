package util;

public class InputTest {
    public static void main(String[] args) {
        System.out.println(Input.getString("Enter a string of characters"));
        System.out.println(Input.yesNo("Yes or no?"));
        System.out.println(Input.getInt(0, 10, "Enter a whole number within range"));
        System.out.println(Input.getInt("Enter any whole number"));
        System.out.println(Input.getDouble(0, 10.5, "Enter a number with a decimal"));
        System.out.println(Input.getDouble("Enter any number with decimals"));
    }
}
