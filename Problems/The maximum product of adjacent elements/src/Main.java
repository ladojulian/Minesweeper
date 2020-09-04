import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var numbers = new int[scanner.nextInt()];

        var product = 0;
        numbers[0] = scanner.nextInt();
        for (var i = 1; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            final var adjacentProduct = numbers[i] * numbers[i - 1];
            if (adjacentProduct > product) {
                product = adjacentProduct;
            }
        }
        System.out.println(product);
    }
}