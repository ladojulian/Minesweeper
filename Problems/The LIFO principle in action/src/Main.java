import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var numberOfElements = scanner.nextInt();

        Deque<Integer> queue = new ArrayDeque<>();
        do {
            queue.add(scanner.nextInt());
        } while (--numberOfElements != 0);

        do {
            System.out.println(queue.pollLast());
        } while (!queue.isEmpty());
    }
}