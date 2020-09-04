import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var n = scanner.nextInt();
        var m = scanner.nextInt();

        var cinema = new int[n][m];
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < m; j++) {
                cinema[i][j] = scanner.nextInt();
            }
        }

        var k = scanner.nextInt();

        var consecutiveSeats = 0;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < m; j++) {
                if (cinema[i][j] == 0) {
                    consecutiveSeats++;
                } else {
                    consecutiveSeats = 0;
                }

                if (consecutiveSeats == k) {
                    System.out.println(i + 1);
                    return;
                }
            }
            consecutiveSeats = 0;
        }

        System.out.println(0);
    }
}