import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number = scanner.nextInt();

        var i = 1;
        while (i * i <= number) {
            System.out.println(i * i);
            i++;
        }
    }
}