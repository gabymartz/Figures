import figures.*;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("1. Enter a Line");
            System.out.println("2. Enter a Square");
            System.out.println("3. Enter a Rectangle");
            System.out.println("4. Enter a Triangle");
            System.out.println("5. Exit");
            System.out.println("Select an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Please enter a length for Line");
                    int lineLength = scanner.nextInt();
                    Line line = new Line(lineLength);
                    line.printLine();
                    break;
                case 2:
                    System.out.println("Please enter a length for Square");
                    int squareLength = scanner.nextInt();
                    Square square = new Square(squareLength);
                    square.printSquare();
                    break;
                case 3:
                    System.out.println("Please enter a width for Rectangle");
                    int width = scanner.nextInt();
                    System.out.println("Please enter a height for Rectangle");
                    int height = scanner.nextInt();
                    Rectangle rectangle = new Rectangle(width, height);
                    rectangle.printRectangle();
                    rectangle.printPerimeter();
                    rectangle.printArea();
                    break;
                case 4:
                    System.out.println("Please enter a size for Triangle");
                    int triangleSize = scanner.nextInt();
                    Triangle triangle = new Triangle(triangleSize);
                    triangle.printTriangle();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 5);
    }
}
