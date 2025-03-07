// Shape.java - Abstract class defining the base structure for all shapes
abstract class Shape {
    protected String shapeName;

    // Constructor to initialize shape name
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Abstract methods to be implemented by concrete shape classes
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
