import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var numberOfTasks = scanner.nextInt();

        Queue<Integer> queue1 = new ArrayDeque<>();
        var totalLoad1 = 0;
        Queue<Integer> queue2 = new ArrayDeque<>();
        var totalLoad2 = 0;
        for (; numberOfTasks > 0; numberOfTasks--) {
            var numberTask = scanner.nextInt();
            var loadIndicator = scanner.nextInt();

            if (totalLoad2 < totalLoad1) {
                queue2.add(numberTask);
                totalLoad2 += loadIndicator;
            } else {
                queue1.add(numberTask);
                totalLoad1 += loadIndicator;
            }
        }

        while (!queue1.isEmpty()) {
            System.out.print(queue1.poll() + " ");
        }
        System.out.println();

        while (!queue2.isEmpty()) {
            System.out.print(queue2.poll() + " ");
        }
    }
}