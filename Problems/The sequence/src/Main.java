import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number = scanner.nextInt();

        var i = 1;
        var j = 1;
        var k = 0;
        while (k < number) {
            System.out.print(i + " ");
            if (i == j) {
                j = 0;
                i++;
            }
            j++;
            k++;
        }
    }
}