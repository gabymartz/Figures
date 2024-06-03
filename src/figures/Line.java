package figures;

public class Line {

    private int length;

    public Line() {
    }

    public Line(int length) {
        this.length = length;
    }

    public void printLine() {
        System.out.println("----------Printing Line ( " + length + ")----------");
        for (int i = 0; i < length; i++) {
            System.out.print(" * ");
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
