import java.util.Scanner;

// Interface for a shape
interface Shape {
    double area();
}

// Rectangle class implementing the Shape interface
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Example using classes from java.util package (Scanner)
        Scanner scanner = new Scanner(System.in);

        // Read rectangle dimensions from user
        System.out.print("Enter rectangle width: ");
        double rectangleWidth = scanner.nextDouble();
        System.out.print("Enter rectangle height: ");
        double rectangleHeight = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectangleWidth, rectangleHeight);

        // Calculate and print area of the rectangle
        double rectangleArea = rectangle.area();
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Close scanner
        scanner.close();
    }
}
