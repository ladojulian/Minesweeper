import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var n = new Scanner(System.in).nextInt();

        partition(n);
    }

    public static void partition(int n) {
        var array = partition(n, n, "", new String[0]);

        for (var i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static String[] partition(int n, int max, String prefix, String[] array) {
        String[] copyArray;
        if (n == 0) {
            copyArray = Arrays.copyOf(array, array.length + 1);
            copyArray[copyArray.length - 1] = prefix;
            return copyArray;
        }

        copyArray = Arrays.copyOf(array, array.length);
        for (int i = Math.min(max, n); i >= 1; i--) {
            copyArray = partition(n - i, i, prefix + i + " ", copyArray);
        }

        return copyArray;
    }
}