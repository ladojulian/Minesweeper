import java.util.Scanner;

class Robot {

    private String cpu;
    private int legs;
    private int hands;
    private int eyes;

    Robot(String cpu, int legs, int hands, int eyes) {
        this.cpu = cpu;
        this.legs = legs;
        this.hands = hands;
        this.eyes = eyes;
    }

    public static class RobotBuilder {

        private String CPU;
        private int legs;
        private int hands;
        private int eyes;

        /* write your code here (constructor) */

        RobotBuilder setCPU(String cpu) {
            this.CPU = cpu;
            return this;
        }

        RobotBuilder setLegs(int legs) {
            this.legs = legs;
            return this;
        }

        RobotBuilder setHands(int hands) {
            this.hands = hands;
            return this;
        }

        RobotBuilder setEyes(int eyes) {
            this.eyes = eyes;
            return this;
        }

        Robot build() {
            return new Robot(this.CPU, this.legs, this.hands, this.eyes);
        }
    }

    @Override
    public String toString() {
        return "CPU : " + cpu + "\n" +
                "Legs : " + legs + "\n" +
                "Hands : " + hands + "\n" +
                "Eyes : " + eyes + "\n";
    }
}

class TestDrive {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Robot.RobotBuilder robotBuilder = new Robot.RobotBuilder();
        /* Set CPU */
        robotBuilder.setCPU("Intel Core i5");
        /* Would like to set legs? */
        int legs = scanner.nextInt();
        /* Would like to set hands? */
        int hands = scanner.nextInt();
        /* Would like to set eyes? */
        int eyes = scanner.nextInt();

        Robot robot = robotBuilder
                .setLegs(legs)
                .setHands(hands)
                .setEyes(eyes)
                .build();

        System.out.println(robot);
        scanner.close();
    }
}