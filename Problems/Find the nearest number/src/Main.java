import java.util.*;

public class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        var list = new ArrayList<Integer>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        final var number = list.get(list.size() - 1);
        list.remove(list.size() - 1);

        var diff = Integer.MAX_VALUE;
        var diffList = new ArrayList<Integer>();
        for (var item : list) {
            var addIt = false;
            var currentDiff = Math.abs(item - number);
            if (currentDiff < diff) {
                diff = currentDiff;
                diffList.clear();
                addIt = true;
            } else if (currentDiff == diff) {
                addIt = true;
            }

            if (addIt) {
                var i = 0;
                for (; i < diffList.size(); i++) {
                    if (diffList.get(i) >= item) {
                        break;
                    }
                }
                diffList.add(i, item);
            }
        }

        for (var item : diffList) {
            System.out.print(item + " ");
        }
    }
}