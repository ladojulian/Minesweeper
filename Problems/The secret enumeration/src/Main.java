public class Main {

    public static void main(String[] args) {
        var count = 0;
        for (var secret : Secret.values()) {
            if (secret.name().startsWith("STAR")) {
                count++;
            }
        }

        System.out.println(count);
    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/