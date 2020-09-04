import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var text1 = scanner.next();

        var inOder = true;
        while (scanner.hasNext()) {
            var text2 = scanner.next();

            if (text1.compareTo(text2) > 0) {
                inOder = false;
                break;
            }
            text1 = text2;
        }
        System.out.println(inOder);
    }
}