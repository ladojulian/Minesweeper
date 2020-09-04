import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var n = scanner.nextInt();
        var m = scanner.nextInt();

        var rectangle = new int[n][m];
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < m; j++) {
                rectangle[i][j] = scanner.nextInt();
            }
        }

        for (var j = 0; j < m; j++) {
            for (var i = n - 1; i >= 0; i--) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }

    }
}