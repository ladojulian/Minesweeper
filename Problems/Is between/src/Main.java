import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var number1 = scanner.nextInt();
        var number2 = scanner.nextInt();
        var number3 = scanner.nextInt();

        System.out.println(number1 >= number2 && number1 <= number3 ||
                number1 >= number3 && number1 <= number2);
    }
}