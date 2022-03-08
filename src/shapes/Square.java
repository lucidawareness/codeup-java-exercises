package shapes;

public class Square extends Rectangle {
    Integer side;

    public Square(Integer side) {
        super(side, side);
        this.side = side;

    }

    public Integer getArea() {
        return (int) Math.pow(side, 2);
    }

    public Integer getPerimeter() {
        return 4 * side;
    }
}
