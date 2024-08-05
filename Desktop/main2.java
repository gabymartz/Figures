public class main2 {
    public static void main(String[] args) {
        printIfNumIsPrime(4); // Number 4 is not Prime
        printIfNumIsPrime(3); // Number 3 is Prime
        printIfNumIsPrime(7); // Number 7 is Prime
        printIfNumIsPrime(21); // Number 21 is not Prime
    }

    public static void printIfNumIsPrime(int num) {
        if (isPrime(num)) {
            System.out.println("Number " + num + " is Prime");
        } else {
            System.out.println("Number " + num + " is not Prime");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        int div = 5;
        while (div * div <= num) {
            if (num % div == 0) {
                return false;
            }
            div += 2;
        }
        return true;
    }
}
