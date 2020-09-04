import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var iLength = scanner.nextInt();
        var jLength = scanner.nextInt();

        var matrix = new int[iLength][jLength];

        for (var i = 0; i < iLength; i++) {
            for (var j = 0; j < jLength; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        var jIndex1 = scanner.nextInt();
        var jIndex2 = scanner.nextInt();

        for (var i = 0; i < iLength; i++) {
            var number = matrix[i][jIndex1];
            matrix[i][jIndex1] = matrix[i][jIndex2];
            matrix[i][jIndex2] = number;
        }

        for (var i = 0; i < iLength; i++) {
            for (var j = 0; j < jLength; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}