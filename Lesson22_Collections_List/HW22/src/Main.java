import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        //todo для выполнения дз создавать классы не нужно. Просто создавайте
        // необходимые вам методы и переменные. Основная логика программы будет в методе main
        System.out.println("Введите команду");
        String inputToDoList = new Scanner(System.in).nextLine();
        toDoList.add("Buy 1");
        toDoList.add("Buy 2");
        toDoList.add("Buy 3");
        toDoList.add("Buy 4");

        System.out.println("Comand: " + command(inputToDoList));
        System.out.println("TextCase: " + textCase(inputToDoList));
        System.out.println("Index: " + index(inputToDoList));


       /* if (command(inputToDoList).equals("Добавить")) {
            if (checkIndex(index(inputToDoList))) {
                toDoList.set(index(inputToDoList), textCase(inputToDoList));
                System.out.println("Нет места под номером " + index(inputToDoList) + "." + " Дело " + textCase(inputToDoList) + " добавлено в конец списка.");
            } else {
                toDoList.set(index(inputToDoList)+1, textCase(inputToDoList));
                System.out.println("Добавлено дело: " + textCase(inputToDoList));
                   }
        }

        if (command(inputToDoList).equals("Удалить")) {
            if (checkIndex(index(inputToDoList))) {
                System.out.println("Дела под номером " + index(inputToDoList) + " нет!");
            } else toDoList.remove(index(inputToDoList));
            System.out.println("Удалено дело: " + textCase(inputToDoList));
        }

        if (command(inputToDoList).equals("Изменить")) {
            if (checkIndex(index(inputToDoList))) {
                System.out.println("Дела под номером " + index(inputToDoList) + " нет!");
            } else {
                String unchange = toDoList.get(index(inputToDoList));
                toDoList.add(index(inputToDoList), textCase(inputToDoList));
                System.out.println("Дело " + unchange + " изменено на " + textCase(inputToDoList));
            }
        }

        if (command(inputToDoList).equals("Печать")) {
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println("Дело: " + toDoList.get(i));
            }
        }*/
        System.out.println("Выполнение программы завершено");
    }

    public static String command(String inputToDoList) {
        String[] inputCutText = inputToDoList.split(" ", 2);

//            System.out.println(Arrays.toString(inputCutText));
        return inputCutText[0];
    }

    public static Integer index(String inputToDoList) {
        String[] inputCutText = inputToDoList.split(" ");
        System.out.println(inputCutText[1]);
        boolean test = inputCutText[1].matches("\\d");
        System.out.println(test);

        if (inputCutText[1].matches("1234567890")) {
            String index = inputCutText[1];
            System.out.println(index);
            return Integer.parseInt(index);
        } else {
            return toDoList.size();
        }
    }

    public static String textCase(String inputToDoList) {
        String[] inputCutText = inputToDoList.split(" ", 2);
        return inputCutText[1];
    }

    public void databaseOperation(String command, Integer index, String textCase) {

    }

    public void printAll() {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(toDoList.get(i));
        }
    }

    private static boolean checkIndex(Integer index) {
        return toDoList.size() > index;
//    System.out.println("Нет такого индекса!");
    }
}