import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
inputNum() ;
inputNumV2();
inputNumV3();
    }

    private static int getinputV3() {
        System.out.println("Enter number3");
        return new Scanner(System.in).nextInt();
    }

    private static void inputNumV3() {
        System.out.println(getinputV3() % 2 == 0);
    }

    private static void inputNumV2() {
        System.out.println("Enter number2");
        System.out.println(new Scanner(System.in).nextDouble()%2 == 0);
    }

    private static void inputNum() {
        System.out.println("Enter number");
        if (new Scanner(System.in).nextDouble()%2 == 0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
