package figures;

public class Square {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public void printSquare() {
        System.out.println("-----Printing Square " + length + " x " + length + " -----");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
