import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var x1 = scanner.nextInt();
        var x2 = scanner.nextInt();
        var y1 = scanner.nextInt();
        var y2 = scanner.nextInt();

        if (x1 == y1 || x2 == y2 || Math.abs(x1 - y1) == Math.abs(x2 - y2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}