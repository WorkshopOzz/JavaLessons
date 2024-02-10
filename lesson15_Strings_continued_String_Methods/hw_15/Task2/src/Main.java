import java.util.Scanner;

public class Main {
    public static final String CORRECT_CHARS = " -абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public static void main(String[] args) {
        System.out.println("Введине ФИО через пробел.");
        String input = new Scanner(System.in).nextLine().trim();
        if (valid(input)) {
            String name1 = input.substring(0, input.indexOf(' ')).trim();
            String name2 = input.substring((input.indexOf(' ')), input.lastIndexOf(' ')).trim();
            String name3 = input.substring(input.lastIndexOf(' ')).trim();
            System.out.println("Фамилия: " + name1 + "\n" + "Имя: " + name2 + "\n" + "Отчество: " + name3);
        } else {
            System.out.println("Ввод не коррретен");
        }
    }

    public static boolean valid(String text) {
        boolean isValid = true;
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (!CORRECT_CHARS.contains((String.valueOf(text.charAt(i))))) {
                isValid = false;
                break;
            }
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        if (spaceCount != 2) {
            isValid = false;
        }

        return isValid;
    }

}