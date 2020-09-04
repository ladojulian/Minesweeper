import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var number = scanner.nextInt();

        number %= 1_000_000;
        number %= 100_000;
        number %= 10_000;
        number %= 1_000;
        number %= 100;
        number /= 10;

        System.out.println(number);
    }
}