import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number = scanner.nextInt();

        var sum = 0;
        for (var i = 0; i < number; i++) {
            sum += scanner.nextInt();
        }

        System.out.println(sum);
    }
}