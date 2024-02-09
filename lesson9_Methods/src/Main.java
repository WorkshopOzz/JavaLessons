import java.util.Scanner;

public class Main {
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) {
        while (true) {
            int command = inputCommand();
            if (command == 1) {
                y -= inputSteps();
            } else if (command == 2) {
                y += inputSteps();
            } else if (command == 3) {
                x += inputSteps();
            } else if (command == 4) {
                x -= inputSteps();
            } else if (command == 5) {
                printXY();
            } else {
                errorInput();
            }
            }

        }

        private static void printXY () {
            System.out.println("Robot coordinates x " + x + " Y " + y);
        }

        private static int inputSteps () {
            System.out.println("enter the number of steps");
            return new Scanner(System.in).nextInt();
        }

        private static int inputCommand () {
            System.out.println("Input command;\n1 - go up\n2 - go down\n3 -  go right\n4 - go left\n5 - output of robot coordinates");
            return new Scanner(System.in).nextInt();

        }
        private static void errorInput () {
            System.out.println("Error command. Try again.");
        }
    }
