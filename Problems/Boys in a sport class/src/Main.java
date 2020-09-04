import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var h1 = scanner.nextInt();
        var h2 = scanner.nextInt();
        var h3 = scanner.nextInt();

        var expr1 = h1 >= h2 && h2 >= h3;
        var expr2 = h1 <= h2 && h2 <= h3;
        System.out.println(expr1 || expr2);
    }
}