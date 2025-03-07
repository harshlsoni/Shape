// Circle.java - Concrete class extending Shape
class Circle extends Shape {
    private double radius;

    // Constructor to initialize circle with radius
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Method to calculate area of circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter (circumference) of circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
