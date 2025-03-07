// Cylinder.java - Concrete class extending Shape and implementing Volume
class Cylinder extends Shape implements Volume {
    private double radius, height;

    // Constructor to initialize cylinder with radius and height
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate surface area of cylinder
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Method to calculate perimeter of cylinder base
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to calculate volume of cylinder
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}

