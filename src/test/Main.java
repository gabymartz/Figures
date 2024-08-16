package test;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int c = 0;
        System.out.println("a: " + a);
        System.out.println("b: " + c);
        printSum(a,c);
        printDiv2(a,c);
        printDiff(a,c);

    }
    public static void printSum(int a, int c){
        System.out.println("a+c = " + (a+c));
    }

    public static void printDiff(int a, int c){
        System.out.println("a-c = " + (a-c));
    }
    public static void printDiv(int a, int c){
        try {
            System.out.println("a/c = " + (a/c));
        } catch(ArithmeticException ae){
            //ae.printStackTrace(); -> ayuda a identificar el error cuando tengo varias líneas
            System.out.println("One of the numbers is 0, and / operation can't be executed" + "Exception Message: " + ae.getMessage());
        } finally {
            System.out.println("Division Method Executed"); //Sirve para cerrar el bloque y siempre se ejecuta se cumpla o no la exepcion
        }
    }
    public static void printDiv2(int a, int c){
        try {
            System.out.println("a/c = " + (a/c));
        } catch(Exception ae){
            //ae.printStackTrace(); -> ayuda a identificar el error cuando tengo varias líneas
            System.out.println("One of the numbers is 0, and / operation can't be executed");
        } finally {
            System.out.println("Division Method Executed"); //Sirve para cerrar el bloque y siempre se ejecuta se cumpla o no la exepcion
        }
    }
}
