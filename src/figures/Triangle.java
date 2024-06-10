package figures;

public class Triangle {
    private int num;

    public Triangle() {
    }

    public Triangle(int num) {
        this.num = num;
    }

    public void printTriangle() {
        System.out.println("-------Printing Triangle " + num + "-------");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
