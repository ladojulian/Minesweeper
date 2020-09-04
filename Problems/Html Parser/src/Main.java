import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {

    private static Deque<String> stack = new ArrayDeque<>();

    public static void main(String[] args) {
        var content = new Scanner(System.in).nextLine();

        parse(content);
    }

    private static void parse(String content) {
        var c = content;
        var hasTag = c.charAt(0) == '<';
        if (hasTag) {
            do {
                var tag = c.substring(0, c.indexOf(">") + 1);
                tag = "</" + tag.substring(1);

                var newContent = c.substring(tag.length() - 1, c.lastIndexOf(tag));
                if (newContent.charAt(0) == '<') {
                    stack.add(newContent);
                    parse(newContent);
                    System.out.println(stack.pollLast());
                } else {
                    parse(newContent);
                }

                c = c.substring(c.lastIndexOf(tag) + tag.length());
            } while (!c.isEmpty());
        } else {
            System.out.println(c);
        }
    }
}