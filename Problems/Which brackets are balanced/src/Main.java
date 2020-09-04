import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var brackets = scanner.nextLine().toCharArray();

        Deque<Character> stack = new ArrayDeque<>();
        for (var bracket : brackets) {
            switch (bracket) {
                case '(':
                case '[':
                case '{':
                    stack.add(bracket);
                    break;
                default:
                    if (!stack.isEmpty()) {
                        char stackBracket = stack.pollLast();

                        var isParenthesis = bracket == ')' && stackBracket == '(';
                        var isSquareBracket = bracket == ']' && stackBracket == '[';
                        var isCurlyBracket = bracket == '}' && stackBracket == '{';

                        if (!isParenthesis && !isSquareBracket && !isCurlyBracket) {
                            System.out.println(false);
                            return;
                        }
                    } else {
                        System.out.println(false);
                        return;
                    }
                    break;
            }
        }
        System.out.println(stack.isEmpty());
    }
}