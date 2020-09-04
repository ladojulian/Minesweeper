import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        var numberOfCommands = scanner.nextInt();

        Deque<Integer> stackMax = new ArrayDeque<>();
        do {
            var command = scanner.next();
            switch (command) {
                case "push":
                    var number = scanner.nextInt();
                    if (stackMax.isEmpty()) {
                        stackMax.add(number);
                    } else {
                        var currentMax = stackMax.peekLast();
                        stackMax.add(currentMax < number ? number : currentMax);
                    }
                    break;
                case "pop":
                    stackMax.pollLast();
                    break;
                case "max":
                    System.out.println(stackMax.peekLast());
                    break;
                default:
            }
        } while (--numberOfCommands != 0);
    }
}