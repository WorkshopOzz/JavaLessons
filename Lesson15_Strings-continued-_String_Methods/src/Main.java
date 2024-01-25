import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char a = 'a'; // укаждого символа есть код в таблице аске (правильно для англ), все остальные в юникоде
        System.out.println((int) a);
        String test = "Мама мыла раму";
        System.out.println(test.indexOf(' '));
        System.out.println(test.lastIndexOf(' '));
        System.out.println(test.substring(3)); //начинает строку с задоного индекса
        String test2 = new Scanner(System.in).nextLine();
        System.out.println(test2.substring(test2.indexOf(' ')));
        System.out.println(test2.substring(test2.lastIndexOf(' ')));
        System.out.println(test.substring(1, 3));
        System.out.println(test.substring(test.indexOf(' ')+1, test.lastIndexOf(' ')));
        System.out.println(test.substring(test.indexOf(' ')+1, test.lastIndexOf(' ')).trim());
        System.out.println(("    Last sound ").trim());
    }
}
