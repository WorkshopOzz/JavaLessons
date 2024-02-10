import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
//        System.out.println("Exercise 1");
        int[] array = new int[10];
        {
            for (int i = 0; i < array.length; i++) {
                array[i] = new Random().nextInt(50);
            }
            System.out.println("Exercise 2");
            //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
            //todo
            for (int i = 0; i < array.length; i++) {
                System.out.println("A" + i + " = " + array[i]);
            }
            System.out.println("Exercise 3");
            //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
            //todo
            for (int i = array.length - 1; i > -1; i--) {
                System.out.println("A" + i + " = " + array[i]);
            }
            System.out.println("Exercise 4");
            //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
            //todo
            for (int i = 0; i < array.length / 2; i++) {
                int tmp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = tmp;
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println("A" + i + " = " + array[i]);
            }
        }
    }
}
