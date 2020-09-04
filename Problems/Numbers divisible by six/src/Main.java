import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var numbers = scanner.nextInt();
        var sum = 0;
        for (var i = 0; i < numbers; i++) {
            var number = scanner.nextInt();
            if (number % 6 == 0) {
                sum += number;
            }
        }

        System.out.println(sum);
    }
}