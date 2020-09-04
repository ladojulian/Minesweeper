import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var str = scanner.nextLine();
        var str2 = scanner.nextLine();

        System.out.println(str.replaceAll(" ", "").equals(str2.replaceAll(" ", "")));
    }
}