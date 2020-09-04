import java.util.*;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var busHeight = scanner.nextInt();
        var totalBridges = scanner.nextInt();

        var i = 1;
        for (; i <= totalBridges; i++) {
            if (busHeight >= scanner.nextInt()) {
                System.out.println("Will crash on bridge " + i);
                break;
            }
        }

        if (i > totalBridges) {
            System.out.println("Will not crash");
        }
    }
}