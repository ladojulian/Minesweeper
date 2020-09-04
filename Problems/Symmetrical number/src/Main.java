import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number = scanner.nextInt();

        var n1 = number / 1_000;
        var n2 = (number % 1_000) / 100;
        var n3 = ((number % 1_000) % 100) / 10;
        var n4 = ((number % 1_000) % 100) % 10;

        if (n1 == n4 && n2 == n3) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}