import Figures.Line;
import Figures.Square;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(5);
        Line line2 = new Line(10);
        Line line3 = new Line(15);
        System.out.println(line1.toString());

        // printsquare
        Square square1 = new Square(5);
        Square square2 = new Square(10);
        Square square3 = new Square(15);
    }
    public static void printLine(){
        for(int i = 0; i < length; i++){
            System.out.println("* ");
        }
        System.out.println(" ");
    }

    public static void printSquare(){
        for(int w=0; w < length; w++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
}