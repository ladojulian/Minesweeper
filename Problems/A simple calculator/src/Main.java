import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = scanner.nextLong();
        var operation = scanner.next();
        var number2 = scanner.nextLong();

        switch (operation) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Division by 0!");
                    break;
                }
                System.out.println(number1 / number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}