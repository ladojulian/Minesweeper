import java.util.*;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var box1 = new int[3];
        box1[0] = scanner.nextInt();
        box1[1] = scanner.nextInt();
        box1[2] = scanner.nextInt();
        Arrays.sort(box1);

        var box2 = new int[3];
        box2[0] = scanner.nextInt();
        box2[1] = scanner.nextInt();
        box2[2] = scanner.nextInt();
        Arrays.sort(box2);

        var isIncompatible = false;
        var box1Volume = 1;
        var box2Volume = 1;
        for (var i = 0; i < box1.length; i++) {
            if (box1[i] == box2[i]) {
                isIncompatible = true;
                break;
            }
            box1Volume *= box1[i];
            box2Volume *= box2[i];
        }

        if (isIncompatible || box1Volume == box2Volume) {
            System.out.println("Incompatible");
        } else if (box1Volume > box2Volume) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Box 1 < Box 2");
        }
    }
}