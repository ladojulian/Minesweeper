import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var total = scanner.nextInt();

        var max = 0;
        for (var i = 0; i < total; i++) {
            var number = scanner.nextInt();
            if (number % 4 == 0 && number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}