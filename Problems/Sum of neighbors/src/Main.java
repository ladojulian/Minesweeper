import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        StringBuilder strMatrix = new StringBuilder(scanner.nextLine());
        var value = scanner.nextLine();

        while (!"end".equals(value)) {
            strMatrix.append("@").append(value);
            value = scanner.nextLine();
        }

        var rowsMatrix = strMatrix.toString().split("@");
        var valuesMatrix = rowsMatrix[0].split(" ");

        var matrix = new int[rowsMatrix.length][valuesMatrix.length];

        for (var j = 0; j < valuesMatrix.length; j++) {
            matrix[0][j] = Integer.parseInt(valuesMatrix[j]);
        }

        for (var i = 1; i < rowsMatrix.length; i++) {
            valuesMatrix = rowsMatrix[i].split(" ");
            for (var j = 0; j < valuesMatrix.length; j++) {
                matrix[i][j] = Integer.parseInt(valuesMatrix[j]);
            }
        }

        var matrix2 = new int[rowsMatrix.length][valuesMatrix.length];
        for (var n = 0; n < rowsMatrix.length; n++) {
            for (var m = 0; m < valuesMatrix.length; m++) {
                var o1 = n - 1 < 0 ? rowsMatrix.length - 1 : n - 1;
                var p1 = m - 1 < 0 ? valuesMatrix.length - 1 : m - 1;
                var o2 = n + 1 >= rowsMatrix.length ? 0 : n + 1;
                var p2 = m + 1 >= valuesMatrix.length ? 0 : m + 1;

                matrix2[n][m] = matrix[o1][m] + matrix[o2][m] + matrix[n][p1] + matrix[n][p2];
            }
        }

        for (var n = 0; n < rowsMatrix.length; n++) {
            for (var m = 0; m < valuesMatrix.length; m++) {
                System.out.print(matrix2[n][m] + " ");
            }
            System.out.println();
        }
    }
}