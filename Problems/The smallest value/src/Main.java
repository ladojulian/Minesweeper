import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var n = scanner.nextLong();

        var i = 1;
        var fac = 1L;
        while (fac <= n) {
            fac *= i;
            i++;
        }
        System.out.print(i - 1);
    }
}
