package shapes;

public class Rectangle {
    protected Integer length;
    protected Integer width;

    public Rectangle(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }

    public Integer getArea() {
        return length * width;
    }

    public Integer getPerimeter() {
        return (2 * length) + (2 * width);
    }
}
