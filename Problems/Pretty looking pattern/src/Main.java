import java.util.*;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var matrix = new String[4];
        for (var k = 0; k < 4; k++) {
            matrix[k] = scanner.nextLine();
        }

        var colors = new String[]{"WW", "BB", "RR", "GG", "YY"};

        for (var i = 0; i < 3; i++) {
            for (var color : colors) {
                var index = matrix[i].indexOf(color);
                if (index != -1 &&
                        index == matrix[i + 1].indexOf(color)) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}