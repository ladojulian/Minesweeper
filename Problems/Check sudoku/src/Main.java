import java.util.*;

public class Main {

    private static int n;
    private static int number;
    private static int[][] sudoku;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        n = scanner.nextInt();
        number = n * n;

        sudoku = new int[number][number];
        if (!checkNumbers(scanner)) {
            System.out.println("NO");
            return;
        }

        if (!isSolveVertical()) {
            System.out.println("NO");
            return;
        }


        if (!isSolveHorizontal()) {
            System.out.println("NO");
            return;
        }

        if (!isSolveBySquare()) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    private static boolean checkNumbers(Scanner scanner) {
        for (var i = 0; i < number; i++) {
            for (var j = 0; j < number; j++) {
                sudoku[i][j] = scanner.nextInt();
                if (sudoku[i][j] > number) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isSolveVertical() {
        var foundIt = false;
        for (var i = 0; i < number; i++) {
            for (var k = 1; k <= number; k++) {
                for (var j = 0; j < number; j++) {
                    if (sudoku[i][j] == k && !foundIt) {
                        foundIt = true;
                    } else if (sudoku[i][j] == k && foundIt) {
                        return false;
                    }
                }
                foundIt = false;
            }
        }
        return true;
    }

    private static boolean isSolveHorizontal() {
        for (var j = 0; j < number; j++) {
            var foundIt = false;
            for (var k = 1; k <= number; k++) {
                for (var i = 0; i < number; i++) {
                    if (sudoku[i][j] == k) {
                        if (foundIt) {
                            return false;
                        } else {
                            foundIt = true;
                        }
                    }
                }
                foundIt = false;
            }
        }
        return true;
    }

    private static boolean isSolveBySquare() {
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n; j++) {
                var array = new int[number];
                var q = 0;
                for (var o = n * i; o < n * i + n; o++) {
                    for (var p = n * j; p < n * j + n; p++) {
                        array[q] = sudoku[o][p];
                        q++;
                    }
                }

                var foundIt = false;
                for (var k = 1; k <= number; k++) {
                    for (var a : array) {
                        if (a == k) {
                            if (foundIt) {
                                return false;
                            } else {
                                foundIt = true;
                            }
                        }
                    }
                    foundIt = false;
                }
            }
        }
        return true;
    }
}