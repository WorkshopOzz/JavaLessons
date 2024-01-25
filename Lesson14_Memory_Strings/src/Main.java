package src;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       String s = "Hello world";
       //LIFO -last in first out - Stack rule
        // 1
        // 2
        // 3
            
        // -> 3
        // -> 2
        // -> 1
Human tommy = new Human("Tommy", 23);
    //human.setName("Jonny");
        //Human jonny = tommy; - не верное копирование объекта
        Human jonny = new Human(tommy.getName(), tommy.getAge());
        tommy.setName("Ronny");
        System.out.println(tommy.getName());
        System.out.println(jonny.getName());
        Human jack = new Human("Jack", 33);
        Human jackCopy = new Human("Jack", 33);
        System.out.println(jack);
        System.out.println(jackCopy);
        System.out.println(jack.equals(jackCopy));
        String a = "Test";
        String aa = "Test";
        System.out.println(a == aa);
        System.out.println("--------------------------");
        int c = 15;
        Integer cc = 15;
        int b = 1500;
        Integer bb = 1500;
        System.out.println(c == cc);
        System.out.println(b == bb);
        System.out.println("--------------------------");
        String ss = "Test";
        ss = ss + " New value";
        System.out.println(ss);
        String d = "123";
        Integer f = 123;
        Integer d1 = Integer.parseInt(d);
        System.out.println(d1 + 1);

        String test2 = String.valueOf(f);
        System.out.println(test2 + 1);
        String input = new Scanner(System.in).nextLine();
        System.out.println("Enter number");
        int lastNum = Integer.parseInt(String.valueOf(input.charAt(input.length() - 1)));
        System.out.println(lastNum);


    }
}