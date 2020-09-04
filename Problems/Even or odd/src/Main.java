import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number = scanner.nextInt();

        var text = "";
        while (number != 0) {
            if (number % 2 == 0) {
                text = text + "even\n";
            } else {
                text = text + "odd\n";
            }
            number = scanner.nextInt();
        }
        System.out.println(text);
    }
}