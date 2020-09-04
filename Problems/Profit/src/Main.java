import java.util.*;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var m = scanner.nextDouble();
        var p = scanner.nextDouble();
        var k = scanner.nextDouble();

        var i = 0;
        while (m < k) {
            m = m + m * p / 100;
            i++;
        }
        System.out.print(i);
    }
}