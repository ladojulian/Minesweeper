import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var h = scanner.nextInt();
        var a = scanner.nextInt();
        var b = scanner.nextInt();

        System.out.println((h - 1 - b) / (a - b) + 1);
    }
}