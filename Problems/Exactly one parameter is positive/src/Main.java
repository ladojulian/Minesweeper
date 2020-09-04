import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var number1 = scanner.nextInt();
        var number2 = scanner.nextInt();
        var number3 = scanner.nextInt();

        var expr1 = number1 > 0 && number2 <= 0 && number3 <= 0;
        var expr2 = number1 <= 0 && number2 > 0 && number3 <= 0;
        var expr3 = number1 <= 0 && number2 <= 0 && number3 > 0;
        System.out.println(expr1 || expr2 || expr3);
    }
}