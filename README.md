# Shape Calculator Java Project

## Project Overview
This project is a menu-driven Java program designed to calculate the area, perimeter, and volume of different geometric shapes. The program makes use of object-oriented principles like abstraction and interfaces.

## Structure
The project includes the following classes:

- **Shape (Abstract Class):**
  - `Shape(String shape)`: Non-abstract constructor method.
  - `calculateShape()`: Abstract method to calculate the area of the shape.
  - `calculatePerimeter()`: Abstract method to calculate the perimeter of the shape.

- **Volume (Interface):**
  - `calculateVolume()`: Abstract method to calculate the volume of 3D shapes.

- **Concrete Shape Classes:**
  - **Circle:** Implements methods for calculating area and perimeter.
  - **Rectangle:** Implements methods for calculating area and perimeter.
  - **Square:** Implements methods for calculating area and perimeter.
  - **Sphere:** Implements `Shape` and `Volume`, calculates surface area and volume.
  - **Cylinder:** Implements `Shape` and `Volume`, calculates surface area and volume.
  - **Equilateral Pyramid (Square Base):** Implements `Shape` and `Volume`, calculates surface area and volume.

## User Input
The program prompts the user to:
- Choose a shape.
- Provide necessary measurements (like radius, length, height, etc.).

## Menu Options
1. Calculate the area of a shape.
2. Calculate the perimeter of a shape.
3. Calculate the volume (for 3D shapes only).
4. Exit the program.

## How to Run
1. Compile the Java files using a Java compiler.
2. Run the main program.
3. Follow the on-screen prompts to select shapes and input measurements.
4. View calculated results for area, perimeter, and volume.

## Requirements
- Java Development Kit (JDK)
- IDE like VS Code, IntelliJ, or Eclipse (optional but recommended)

## Example Output
```
Choose a shape:
1. Circle
2. Rectangle
3. Square
4. Sphere
5. Cylinder
6. Equilateral Pyramid

Enter your choice: 1
Enter the radius of the circle: 5
Area: 78.54
Perimeter: 31.42
```
