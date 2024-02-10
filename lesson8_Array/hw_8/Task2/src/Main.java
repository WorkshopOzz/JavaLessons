import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут

        int[] weight = new int[10];
        int max = 100;
        int min = 40;
        double mass = 0;
        int count = 0;
        for (int i = 0; i < weight.length; i++) {
            weight[i] = new Random().nextInt(max - min + 1) + min;
            mass += weight[i];
            System.out.println("W " + weight[i]);
            if (weight[i] <= 80 && weight[i] >= 60) {
                count++;
            }
        }
        System.out.println("Average weight = " + mass / weight.length);
        System.out.println("Number of people with weight ranging from 60 kg to 80 kg = " + count);


    }
}