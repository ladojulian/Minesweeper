import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number = scanner.nextInt();

        var max = 0;
        while (number != 0) {
            max = Math.max(number, max);
            number = scanner.nextInt();
        }
        System.out.print(max);
    }
}