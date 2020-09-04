import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var cups = scanner.nextInt();
        var isWeekend = scanner.nextBoolean();

        var expr1 = isWeekend && cups >= 15 && cups <= 25;
        var expr2 = !isWeekend && cups >= 10 && cups <= 20;
        System.out.println(expr1 || expr2);
    }
}