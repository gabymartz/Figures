package figures;

public class Square {
    private int length;

    public Square() {

    }

    public Square(int length) {
        this.length = length;
    }

    public void printSquare() {
        System.out.println("-------Printing Square "  + length  + "-------");
        for(int w = 0; w < length; w++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
