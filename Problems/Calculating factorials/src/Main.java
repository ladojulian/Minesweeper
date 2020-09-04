import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        var f = 1L;
        var number = n;
        for (; number != 0; number--) {
            f *= number;
        }
        return f;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}