package session08.calculate;

public class Rectangle {

    // Thuộc tính private
    private double width;
    private double height;

    // Constructor có tham số
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Tính diện tích
    public double getArea() {
        return width * height;
    }

    // Tính chu vi
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // toString()
    @Override
    public String toString() {
        return "Rectangle(width=" + width
                + ", height=" + height
                + ", area=" + getArea()
                + ", perimeter=" + getPerimeter() + ")";
    }
}
