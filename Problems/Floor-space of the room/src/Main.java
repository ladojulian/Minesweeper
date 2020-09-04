import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var roomShape = scanner.next();

        switch (roomShape) {
            case "triangle":
                var at = scanner.nextDouble();
                var bt = scanner.nextDouble();
                var c = scanner.nextDouble();
                var s = (at + bt + c) / 2;
                System.out.println(Math.sqrt(s * (s - at) * (s - bt) * (s - c)));
                break;
            case "rectangle":
                var a = scanner.nextDouble();
                var b = scanner.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                var r = scanner.nextDouble();
                System.out.println(3.14 * r * r);
                break;
            default:
                break;
        }
    }
}