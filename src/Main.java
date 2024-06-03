import figures.Line;
import figures.Square;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(5);
        Line line2 = new Line(10);
        Line line3 = new Line(15);
        System.out.println(line1.toString());

        printLine(5);

        Square square1 = new Square(5);
        Square square2 = new Square(10);
        Square square3 = new Square(15);

        printSquare(5);
    }

    public static void printLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void printSquare(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

