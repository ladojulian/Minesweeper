import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var str = scanner.nextLine();

        System.out.println(str.toUpperCase().charAt(0) == 'J');
    }
}