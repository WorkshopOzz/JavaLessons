import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
        boolean isContinue = true;
        int x = 0;
        int y = 0;
        while (isContinue){
            System.out.println("Select the direction of the robot's movement:\n1- up\n2 - down\n3 - right\n4 - left");
            int input = new Scanner(System.in).nextInt();
            if(input == 1){
            y++;
            } else if (input == 2) {
            y--;
            }else if (input == 3) {
            x++;
            }else if (input == 4) {
                x--;
            }else {
                System.out.println("Error");
                isContinue = false;
            }
            System.out.println("Robot coordinates: vertically " + y + ",horizontal" + x);
        }
    }
}
