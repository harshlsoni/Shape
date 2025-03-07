// Square.java - Concrete class extending Shape
class Square extends Shape {
    private double side;

    // Constructor to initialize square with side length
    public Square(double side) {
        super("Square");
        this.side = side;
    }

    // Method to calculate area of square
    public double calculateArea() {
        return side * side;
    }

    // Method to calculate perimeter of square
    public double calculatePerimeter() {
        return 4 * side;
    }
}
