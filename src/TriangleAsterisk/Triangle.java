package TriangleAsterisk;

public class Triangle {
    public static void main(String[] args) {
        printTriangle(3);
        printTriangle(5);
    }

    public static void printTriangle(int height) {
        System.out.println("-------Printing Triangle-------");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
