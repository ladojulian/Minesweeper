import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var d = 0;
        var c = 0;
        var b = 0;
        var a = 0;
        var total = scanner.nextInt();
        for (var i = 1; i <= total; i++) {
            var grades = scanner.nextInt();
            if (grades == 2) {
                d++;
            }
            if (grades == 3) {
                c++;
            }
            if (grades == 4) {
                b++;
            }
            if (grades == 5) {
                a++;
            }
        }

        System.out.println(d + " " + c + " " + b + " " + a);
    }
}