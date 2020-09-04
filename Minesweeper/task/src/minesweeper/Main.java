package minesweeper;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static char[][] minesweeper = new char[9][9];
    private static char[][] minesweeperViewer = new char[9][9];

    public static void main(String[] args) {
        System.out.print("How many mines do you want on the field? ");
        var scanner = new Scanner(System.in);
        var minesCount = scanner.nextInt();


        var random = new Random();
        while (minesCount != 0) {
            for (var i = 0; i < minesweeper.length; i++) {
                for (var j = 0; j < minesweeper[i].length; j++) {
                    if (minesweeper[i][j] != 'X') {
                        if (minesCount != 0 && random.nextBoolean()) {
                            minesweeper[i][j] = 'X';
                            minesCount--;
                        } else {
                            minesweeper[i][j] = '.';
                        }
                        minesweeperViewer[i][j] = '.';
                    }
                }
            }
        }

        for (var i = 0; i < minesweeper.length; i++) {
            for (var j = 0; j < minesweeper[i].length; j++) {
                if (minesweeper[i][j] == '.') {
                    var count = 0;
                    if (checkMine(i - 1, j - 1)) {
                        count++;
                    }
                    if (checkMine(i - 1, j)) {
                        count++;
                    }
                    if (checkMine(i - 1, j + 1)) {
                        count++;
                    }
                    if (checkMine(i, j - 1)) {
                        count++;
                    }
                    if (checkMine(i, j + 1)) {
                        count++;
                    }
                    if (checkMine(i + 1, j - 1)) {
                        count++;
                    }
                    if (checkMine(i + 1, j)) {
                        count++;
                    }
                    if (checkMine(i + 1, j + 1)) {
                        count++;
                    }
                    if (count != 0) {
                        minesweeper[i][j] = (char) (count + '0');
                        //minesweeperViewer[i][j] = minesweeper[i][j];
                    } else {
                        minesweeper[i][j] = '/';
                    }
                }
            }
        }
        print();

        var gameNotFinished = true;
        do {

            var wrongPosition = true;
            do {
                System.out.print("Set/unset mines marks or claim a cell as free: ");
                var x = scanner.nextInt() - 1;
                var y = scanner.nextInt() - 1;
                var command = scanner.next();


                if (minesweeperViewer[y][x] != '.' && minesweeperViewer[y][x] != '*') {
                    System.out.println("There is a number here!");
                } else {
                    wrongPosition = false;

                    switch (command) {
                        case "free":
                            if (minesweeper[y][x] == 'X') {
                                finishGameOver();
                                return;
                            }
                            minesweeperViewer[y][x] = minesweeper[y][x];
                            openBlanks(y, x);
                            break;
                        case "mine":
                            if (minesweeperViewer[y][x] == '*') {
                                minesweeperViewer[y][x] = '.';
                            } else {
                                minesweeperViewer[y][x] = '*';
                            }
                            break;
                        default:
                            wrongPosition = true;
                            break;
                    }
                }
            } while (wrongPosition);

            print();
            gameNotFinished = checkMarks();
        } while (gameNotFinished);
        System.out.println("Congratulations! You found all mines!");
    }

    private static void finishGameOver() {
        for (var i = 0; i < minesweeper.length; i++) {
            for (var j = 0; j < minesweeper[i].length; j++) {
                if (minesweeper[i][j] == 'X') {
                    minesweeperViewer[i][j] = minesweeper[i][j];
                }
            }
        }
        print();
        System.out.println("You stepped on a mine and failed!");
    }

    private static void openBlanks(int i, int j) {
        var isABlank = minesweeperViewer[i][j] == '.' || minesweeper[i][j] == '/' || minesweeperViewer[i][j] == '*';
        if (isABlank) {
            if (unhiddenCell(i - 1, j - 1)) {
                openBlanks(i - 1, j - 1);
            }
            if (unhiddenCell(i - 1, j)) {
                openBlanks(i - 1, j);
            }
            if (unhiddenCell(i - 1, j + 1)) {
                openBlanks(i - 1, j + 1);
            }
            if (unhiddenCell(i, j - 1)) {
                openBlanks(i, j - 1);
            }
            if (unhiddenCell(i, j + 1)) {
                openBlanks(i, j + 1);
            }
            if (unhiddenCell(i + 1, j - 1)) {
                openBlanks(i + 1, j - 1);
            }
            if (unhiddenCell(i + 1, j)) {
                openBlanks(i + 1, j);
            }
            if (unhiddenCell(j + 1, i + 1)) {
                openBlanks(j + 1, i + 1);
            }
        }
    }

    private static boolean unhiddenCell(int i, int j) {
        var isValidCell = i >= 0 && j >= 0 && i < minesweeper.length && j < minesweeper.length;
        if (isValidCell && minesweeper[i][j] != 'X'
                && (minesweeperViewer[i][j] == '.' || minesweeperViewer[i][j] == '*')) {
            minesweeperViewer[i][j] = minesweeper[i][j];
            return minesweeperViewer[i][j] == '/';
        }
        return false;
    }

    private static boolean checkMine(int i, int j) {
        if (i >= 0 && j >= 0
                && i < minesweeper.length && j < minesweeper.length) {
            return minesweeper[i][j] == 'X';
        }
        return false;
    }

    private static void print() {
        System.out.println(" |123456789|");
        System.out.println("-|---------|");
        var lineNumber = 1;
        for (var line : minesweeperViewer) {
            System.out.print(lineNumber + "|");
            for (var field : line) {
                System.out.print(field);
            }
            System.out.println("|");
            lineNumber++;
        }
        System.out.println("-|---------|");
    }

    private static boolean checkMarks() {
        var discoverAllMines = true;
        var discoverAllBlanks = true;
        for (var i = 0; i < minesweeper.length; i++) {
            for (var j = 0; j < minesweeper.length; j++) {
                if (minesweeper[i][j] == 'X' && minesweeperViewer[i][j] != '*') {
                    discoverAllMines = false;
                }
                if (minesweeper[i][j] != 'X' && minesweeperViewer[i][j] == '.') {
                    discoverAllBlanks = false;
                }
            }
        }
        return !discoverAllBlanks && !discoverAllMines;
    }
}
