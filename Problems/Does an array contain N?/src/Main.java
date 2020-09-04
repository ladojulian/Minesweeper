import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var array = new int[scanner.nextInt()];

        for (var i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        var n = scanner.nextInt();
        var foundIt = false;
        for (var a : array) {
            if (a == n) {
                foundIt = true;
                break;
            }
        }

        System.out.println(foundIt);
    }
}