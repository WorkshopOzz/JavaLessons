import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        //todo для выполнения дз создавать классы не нужно. Просто создавайте
        // необходимые вам методы и переменные. Основная логика программы будет в методе main
        greetings();
        operation("Добавить дело 1");
        operation("Добавить дело 2");
        operation("Добавить дело 3");
        operation("Добавить дело 4");
//        Тест
        /* operation("Добавить 1 посмотреть фильм");
        operation("Добавить 21 купить машину");
        operation("Удалить 43");
        operation("Изменить 2 выпить молока");
        operation("Печать");*/
        while (true) {
            String output = inputToDolist();
            operation(output);
//     Первая версия
       /* if (command(inputToDoList).equals("Добавить")) {
              if (!checkIndex(index(inputToDoList)) && index(inputToDoList) > toDoList.size()) {
                toDoList.add(toDoList.size(), textCase(inputToDoList));
                System.out.println("Нет дела под номером " + index(inputToDoList) + "." + " Дело: \"" + textCase(inputToDoList) + "\" -" + " добавлено в конец списка.");
            } else if (index(inputToDoList) == toDoList.size()) {
                  toDoList.add(index(inputToDoList), textCase(inputToDoList));
                  System.out.println("Добавлено дело: " + textCase(inputToDoList));

              } else {
                toDoList.add(index(inputToDoList), textCase(inputToDoList));
                System.out.println("На" + index(inputToDoList) +  " добавлено дело: " + textCase(inputToDoList));
            }
        }

        if (command(inputToDoList).equals("Удалить")) {
            if (!checkIndex(index(inputToDoList))) {
                System.out.println("Дела под номером " + index(inputToDoList) + " нет!");
            } else {
                String todo = toDoList.get(index(inputToDoList));
                toDoList.remove(todo);
               System.out.println("Удалено дело: " + todo);
            }
        }

        if (command(inputToDoList).equals("Изменить")) {
            if (!checkIndex(index(inputToDoList))) {
                System.out.println("Дела под номером " + index(inputToDoList) + " нет!");
            } else {
                String unchange = toDoList.get(index(inputToDoList));
                toDoList.set(index(inputToDoList), textCase(inputToDoList));
                System.out.println("Дело " + unchange + " изменено на " + textCase(inputToDoList));
            }
        }

        if (command(inputToDoList).equals("Печать")) {
            printAll(toDoList);
        } */
            if (output.toLowerCase().equals("выход")) {
                exit();
                break;
            }
        }
    }

    public static String inputToDolist() {
        System.out.println("Введите команду");
        return new Scanner(System.in).nextLine();
    }

    public static String command(String input) {
        String[] inputCutText = input.split("\\s+", 2);

//            System.out.println(Arrays.toString(inputCutText));
        return inputCutText[0];
    }

    public static String textCase(String inputTo) {
//     Первая версия
       /* String[] input = inputTo.split(" ", 2);
        if (input[1].matches("(^\\d+)")) {
            String[] textCase = input[1].split("\\d+", 2);
            //            inputCutText = inputCutText.replaceAll("\\d+", " ").trim();
            return textCase[1];

        } else {
            return input[1];

        }*/
        String[] splitText = inputTo.split(" ", 3);
        if (splitText[1].matches("\\d+")) {
//            System.out.println("work");
            return splitText[2];
        } else {
            String[] split = inputTo.split(" ", 2);
            return split[1];
        }
    }

    private static boolean checkIndex(Integer index) {
        return toDoList.size() > index;
//    System.out.println("Нет такого индекса!");
    }

    public static void operation(String input) {
        if (command(input).toLowerCase().equals("добавить")) {
            /*if (!checkIndex(index(input)) && index(input) > toDoList.size()) {
                toDoList.add(toDoList.size(), textCase(input));
                System.out.println("Нет дела под номером " + index(input) + "." + " Дело: \"" + textCase(input) + "\" -" + " добавлено в конец списка.");
            } else if (index(input) == toDoList.size()) {
                toDoList.add(index(input), textCase(input));
                System.out.println("Добавлено дело: " + textCase(input));

            } else {
                toDoList.add(index(input), textCase(input));
                System.out.println("На" + index(input) + " добавлено дело: " + textCase(input));
            }*/
            add(input);
        } else if (command(input).toLowerCase().equals("удалить")) {
            remove(input);
        } else if (command(input).toLowerCase().equals("изменить")) {
           /* if (!checkIndex(index(input))) {
                System.out.println("Дела под номером " + index(input) + " нет!");
            } else {
                String unchange = toDoList.get(index(input));
                toDoList.set(index(input), textCase(input));
                System.out.println("Дело " + unchange + " изменено на " + textCase(input));
            }*/
            edit(input);
        } else if (command(input).toLowerCase().equals("печать")) {
            printAll(toDoList);
        }
       else if (command(input).toLowerCase().equals("выход")) {
           return;
        }
        else if (command(input).toLowerCase().equals("инфо")) {
            info();
        }
        else {
            error();
        }

    }

    public static void add(String input) {
        if (!checkIndex(index(input)) && index(input) > toDoList.size()) {
            toDoList.add(toDoList.size(), textCase(input));
            System.out.println("Нет дела под номером " + index(input) + "." + " Дело: \"" + textCase(input) + "\" -" + " добавлено в конец списка.");
        } else if (index(input) == toDoList.size()) {
            toDoList.add(index(input), textCase(input));
            System.out.println("Добавлено дело: " + textCase(input));

        } else {
            toDoList.add(index(input), textCase(input));
            System.out.println("На " + index(input) + " место добавлено дело: " + textCase(input));
        }
    }

    public static void remove(String input) {
        if (!checkIndex(index(input))) {
            System.out.println("Дела под номером " + index(input) + " нет!");
        } else {
            String todo = toDoList.get(index(input));
            toDoList.remove(todo);
            System.out.println("Удалено дело: " + todo);
        }
    }

    public static void edit(String input) {
        if (!checkIndex(index(input))) {
            System.out.println("Дела под номером " + index(input) + " нет!");
        } else {
            String unchange = toDoList.get(index(input));
            toDoList.set(index(input), textCase(input));
            System.out.println("Дело " + unchange + " изменено на " + textCase(input));
        }
    }

    public static Integer index(String input) {
        String[] inputCutText = input.split(" ");
//        System.out.println(inputCutText[1]);
//        String testReg = inputCutText[1].replaceAll("\\D", " ").trim();
//        boolean test = testReg.matches("\\d+");
//        System.out.println(test);

        if (inputCutText[1].matches("\\d+")) {
            String index = inputCutText[1];
//            System.out.println(index);
            return Integer.parseInt(index);
        } else {
            return toDoList.size();
        }
    }

    public static void printAll(List toDoList) {
        if (toDoList.isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println("Дело: № " + (i + 1) + ". " + toDoList.get(i));
        }
    }

    public static void exit() {
        System.out.println("Выполнение программы завершено");
    }
public static void error(){
    System.out.println("Не верный формат команды. Для получения справки введите команду \"Инфо\"");
}
    public static void info() {
        String info = """
                Доступные команды:
                Добавить {дело}
                Добавить {номер} {дело}
                Удалить {номер}
                Изменить {номер} {новое дело}
                Выход
                Инфо
                """;
        System.out.println(info);
    }

    public static void greetings() {
        System.out.println("\t\tДобро пожаловать в программу \"Что делать!\"\n \t\t\tдля вызова справки наберите \"Инфо\".\n\n");
    }

}