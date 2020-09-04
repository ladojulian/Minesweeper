import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var numbers = new int[scanner.nextInt()];

        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        var triple = 0;
        for (var i = 0; i < numbers.length - 2; i++) {
            if (numbers[i + 1] == numbers[i] + 1 &&
                    numbers[i + 2] == numbers[i] + 2) {
                triple++;
            }
        }

        System.out.println(triple);
    }
}