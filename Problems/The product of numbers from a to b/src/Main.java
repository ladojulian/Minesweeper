import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var a = scanner.nextInt();
        var b = scanner.nextInt();

        var product = (long) a;
        for (a += 1; a < b; a++) {
            product *= a;
        }

        System.out.println(product);
    }
}