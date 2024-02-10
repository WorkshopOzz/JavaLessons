import java.util.Scanner;

public class Main {
    public static final String VALID_REGEX = "([А-яйё-]+\\s){2}([А-яйё-]+)";

    public static void main(String[] args) {
        String info = new Scanner(System.in).nextLine();
        if (info.matches(VALID_REGEX)) {
            // System.out.println("valid");
            String[] split = info.split("\\s+");
            System.out.println("Фамилия: " + split[0]);
            System.out.println("Имя: " + split[1]);
            System.out.println("Отчество: " + split[2]);
        }
        else {
            System.out.println("Введенная строка не является ФИО");

        }

    }
}