import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number = scanner.nextInt();
        var i = 0;
        while (number != 0) {
            number = scanner.nextInt();
            i++;
        }
        System.out.print(i);
    }
}