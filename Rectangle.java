// Rectangle.java - Concrete class extending Shape
class Rectangle extends Shape {
    private double length, width;

    // Constructor to initialize rectangle with length and width
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter of rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
