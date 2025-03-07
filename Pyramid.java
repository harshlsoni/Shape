// EquilateralPyramid.java - Concrete class extending Shape and implementing Volume
class EquilateralPyramid extends Shape implements Volume {
    private double baseSide, height;

    // Constructor to initialize equilateral pyramid with base side and height
    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.baseSide = baseSide;
        this.height = height;
    }

    // Method to calculate surface area of equilateral pyramid
    public double calculateArea() {
        double baseArea = baseSide * baseSide;
        double slantHeight = Math.sqrt((baseSide / 2) * (baseSide / 2) + height * height);
        double lateralArea = 2 * baseSide * slantHeight;
        return baseArea + lateralArea;
    }

    // Method to calculate perimeter of equilateral pyramid base
    public double calculatePerimeter() {
        return 4 * baseSide;
    }

    // Method to calculate volume of equilateral pyramid
    public double calculateVolume() {
        return (1.0 / 3.0) * baseSide * baseSide * height;
    }
}
