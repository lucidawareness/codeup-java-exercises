package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }


    public double getPerimeter() {
        double side = this.length;
        return side * 4;
    }


    public double getArea() {
        double side = this.width;
        return side * side;
    }


    public void setLength(double side) {
        this.length = side;
    }


    public void setWidth(double side) {
        this.width = side;
    }
}
