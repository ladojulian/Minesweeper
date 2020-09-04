import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var number = scanner.nextInt();

        var sum = 0;
        while (sum < 1000 && number != 0) {
            sum += number;

            number = scanner.nextInt();
        }

        System.out.println(sum < 1000 ? sum : sum - 1000);
    }
}