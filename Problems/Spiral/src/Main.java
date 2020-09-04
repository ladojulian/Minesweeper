import java.util.Scanner;

class Main {

    private static int number = 1;
    private static int posI = 0;
    private static int iMin = 0;
    private static int iMax;
    private static int posJ = 0;
    private static int jMin = 0;
    private static int jMax;

    private static int[][] spiral;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var n = scanner.nextInt();

        spiral = new int[n][n];

        iMax = n - 1;
        jMax = n - 1;
        while (number <= n * n) {
            checkOneSide(n);
        }

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n; j++) {
                System.out.print(spiral[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void checkOneSide(int n) {
        if (checkToRightAndDown(n)) {
            return;
        }

        if (posI == iMax && posJ == jMax) {
            for (; posJ >= jMin; posJ--) {
                if (spiral[posI][posJ] == 0) {
                    spiral[posI][posJ] = number;
                    number++;
                }
            }
            posJ++;
            jMax--;
            return;
        }

        if (posI == iMax && posJ == jMin) {
            for (; posI >= iMin; posI--) {
                if (spiral[posI][posJ] == 0) {
                    spiral[posI][posJ] = number;
                    number++;
                }
            }
            posI++;
            iMax--;
        }
    }

    private static boolean checkToRightAndDown(int n) {
        if (posI == iMin && posJ == jMin) {
            for (; posJ <= jMax; posJ++) {
                if (spiral[posI][posJ] == 0) {
                    spiral[posI][posJ] = number;
                    number++;
                }
            }
            posJ--;
            if (number != n + 1) {
                jMin++;
            }
            return true;
        }

        if (posI == iMin && posJ == jMax) {
            for (; posI <= iMax; posI++) {
                if (spiral[posI][posJ] == 0) {
                    spiral[posI][posJ] = number;
                    number++;
                }
            }
            posI--;
            iMin++;
            return true;
        }

        return false;
    }
}