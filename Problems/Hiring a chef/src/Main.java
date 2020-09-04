//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var firstName = scanner.next();
        scanner.next();
        scanner.next();
        scanner.next();
        var cuisinePreference = scanner.next();

        System.out.println("The form for " +
                firstName +
                " is completed. We will contact you if we need a chef that cooks " +
                cuisinePreference +
                " dishes.");
    }
}