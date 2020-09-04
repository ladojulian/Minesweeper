import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var numberOfElements = scanner.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        do {
            var number = scanner.nextInt();
            if (number % 2 == 0) {
                deque.addFirst(number);
            } else {
                deque.addLast(number);
            }
        } while (--numberOfElements != 0);

        do {
            System.out.println(deque.poll());
        } while (!deque.isEmpty());
    }
}