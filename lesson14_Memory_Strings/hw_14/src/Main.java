import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        String stringNum = String.valueOf(num);
        double sumNum = 0;
        for (int i = 0; i < stringNum.length(); i++) {
            // int lastNum = Integer.parseInt(String.valueOf(stringNum.charAt(stringNum.length())));
            //int numI = Integer.parseInt(String.valueOf(stringNum.charAt(i)));
            sumNum += Integer.parseInt(String.valueOf(stringNum.charAt(i)));
            //System.out.println(numI);
        }
        // System.out.println(sumNum);
        // double avg = sumNum / stringNum.length();
        //System.out.println("avg " + avg);


        return sumNum / stringNum.length();
    }
}
