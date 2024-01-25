import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        array1[0] = 11;
        array1[1] = 12;
        array1[2] = 13;
        array1[3] = 14;
        array1[4] = 15;
        System.out.println("A1 " + array1[0]);
        {
            System.out.println("*******Second example*******");
            int[] array2 = new int[3];

            {
                for (int i = 0; i < 3; i++) {
                    array2[i] = i + 10;
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("A2 " + array2[i]);
                }

            }
            System.out.println("Third example");
            int[] array3 = new int[6];

            {
                for (int i = 0; i < array3.length; i++) {
                    array3[i] = i + 10;
                }
                for (int i = 0; i < array3.length; i++) {
                    System.out.println("A3 " + array3[i]);
                }

            }
            System.out.println("*******Example random*******");
            int[] array4 = new int[5];
            {
                for (int i = 0; i < array4.length; i++) {
                    array4[i] = new Random().nextInt(100);
                }
                double summ = 0;
                for (int i = 0; i < array4.length; i++) {
                    summ += array4[i];
                    System.out.println("A4 " + array4[i]);
                }
                System.out.println("Middle age:  " + summ / array4.length);
            }
        }
    }
}