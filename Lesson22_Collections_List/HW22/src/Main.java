import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> toDoList = new ArrayList<>();
    public String error = "Дела с таким индексом нет!";

    public static void main(String[] args) {
        //todo для выполнения дз создавать классы не нужно. Просто создавайте
        // необходимые вам методы и переменные. Основная логика программы будет в методе main
        String inputToDoList = new Scanner(System.in).toString();
    }

    public String command(String inputToDoList) {
        String[] inputCutText = inputToDoList.split(" ", 1);
       return inputCutText[0];
    }

    public Integer index(String inputToDoList) {
        String[] inputCutText = inputToDoList.split(" ", 1);
        if (!inputCutText[1].matches("d")) {
            return null;
        }

        return Integer.parseInt(String.valueOf(inputToDoList.charAt(1)));
    }

    public String textCase(String inputToDoList) {
        String[] inputCutText = inputToDoList.split(" ", 1);
        return inputCutText[2];
    }


    public String inputCase() {
        String inputCase = new Scanner(System.in).toString();
        String[] inputCutText = inputCase.split(" ");
        String command = inputCutText[0];
        String textCase;
        Integer index;
        if (inputCutText[1].matches("d")) {
            Integer index1 = Integer.parseInt(String.valueOf(inputCase.charAt(1)));
            index = index1;
            for (int i = 2; i <= inputCutText.length; i++) {
                String textCase1 = inputCutText[i] + " ";
                textCase = textCase1;
            }

        } else {
            for (int i = 2; i <= inputCutText.length; i++) {
                String textCase1 = inputCutText[i] + " ";
                textCase = textCase1;
            }
        }
        if (inputCutText[0].matches("Добавить")) {
            if (inputCutText[1].matches("d")) {
//                   добавляем номер дела
            } else {
//                   добавляем в конец списка
            }

        } else if (inputCutText[0].matches("Удалить")) {
            Integer index = Integer.parseInt(String.valueOf(inputCase.charAt(1)));
            if (!checkIndex(index)) {
                System.out.println(" Дела с таким индексом нет!");
                return error;
            }

        } else if (inputCutText[0].matches("Изменить")) {
            Integer index = Integer.parseInt(String.valueOf(inputCase.charAt(1)));
            if (!checkIndex(index)) {
                System.out.println(" Дела с таким индексом нет!");
                return error;
            }
        }

        return command,textCase;
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