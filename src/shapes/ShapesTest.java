package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Quadrilateral myShape = new Rectangle(4, 5);
        System.out.println("myShape's area: " + myShape.getArea());
        System.out.println("myShape's perimeter: " + myShape.getPerimeter());


        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println(myShape.getLength());
        System.out.println(myShape.getWidth());
        }
    }