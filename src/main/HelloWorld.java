package main;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.println("World!");

        int myFavoriteNumber = 0;
        System.out.println(myFavoriteNumber);

        String myString = "Irvin";
        System.out.println(myString);

        double myNumber = 3.14;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        x = 4;
        x += 5;

        int y = 4;
        y *= x;
        System.out.println(y);

        x = 10;
        y = 2;
        x /= y;
        System.out.println(x);
        y -= x;
        System.out.println(y);

    }
}