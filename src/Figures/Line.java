package Figures;

public class Line {

    private static int length;

    public Line() {

    }

    public Line(int length) {
        this.length = length;

    }

    public static void printLine() {
        System.out.println("----------Printing Line ( " + length + ")----------");
        System.out.println(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(" * ");

            public int getLength () {
                return length;

            }
            public void setLength(int length){
                this.length = length;
            }
        }
    }
}

