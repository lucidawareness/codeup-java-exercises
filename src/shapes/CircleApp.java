package shapes;

import util.Input;

public class CircleApp {
    private static int numOfCircles = 0;

    public static void createCircle() {
        double radius = Input.getDouble("Enter the radius of your circle");
        Circle circle = new Circle(radius);
        numOfCircles += 1;
        System.out.println(radius);
        System.out.printf("The area for a circle with a radius of %.3f is: %.2f\n", radius, circle.getArea());
        System.out.printf("The circumference of a circle with a radius of %.3f is: %.2f\n", radius, circle.getCircumference());
        boolean proceed = Input.yesNo("Would you like to add another circle? (y/n)");
        if (proceed) {
            createCircle();
        } else {
            System.out.printf("You created %d circles\nGoodbye!", numOfCircles);
        }
    }

    public static void main(String[] args) {
        createCircle();
    }


}
