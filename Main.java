//Main.java - Main class implementing menu-driven program
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            // Display menu options
            System.out.println("\nSelect a shape:");
            System.out.println("1. Circle\n2. Rectangle\n3. Square\n4. Sphere\n5. Cylinder\n6. Equilateral Pyramid\n7. Exit");
            choice = scanner.nextInt();
            Shape shape = null;
            double area, perimeter, volume = 0;

            // Switch case to handle user input
            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    shape = new Circle(scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter length and width: ");
                    shape = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter side length: ");
                    shape = new Square(scanner.nextDouble());
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    shape = new Sphere(scanner.nextDouble());
                    volume = ((Volume) shape).calculateVolume();
                    break;
                case 5:
                    System.out.print("Enter radius and height: ");
                    shape = new Cylinder(scanner.nextDouble(), scanner.nextDouble());
                    volume = ((Volume) shape).calculateVolume();
                    break;
                case 6:
                    System.out.print("Enter base side and height: ");
                    shape = new EquilateralPyramid(scanner.nextDouble(), scanner.nextDouble());
                    volume = ((Volume) shape).calculateVolume();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }

            // Display results
            if (shape != null) {
                area = shape.calculateArea();
                perimeter = shape.calculatePerimeter();
                System.out.println("Shape: " + shape.shapeName);
                System.out.println("Area: " + area);
                System.out.println("Perimeter: " + (perimeter == 0 ? "N/A" : perimeter));
                if (shape instanceof Volume)
                    System.out.println("Volume: " + volume);
            }
        } while (choice != 7);

        scanner.close();
    }
}
