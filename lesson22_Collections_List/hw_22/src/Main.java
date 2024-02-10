import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        //todo для выполнения дз создавать классы не нужно. Просто создавайте
        // необходимые вам методы и переменные. Основная логика программы будет в методе main
        operation("Добавить дело 1");
        operation("Добавить дело 2");
        operation("Добавить дело 3");
        operation("Добавить дело 4");
        while (true) {
            String output = inputToDolist();
            operation(output);
            System.out.println("*************************************");

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

            printAll(toDoList);
            if (output.equals("Выход")) {
                break;
            }
        }
    }

    public static String inputToDolist() {
        System.out.println("Введите команду");
        return new Scanner(System.in).nextLine();
    }
    public static String command(String input) {
        String[] inputCutText = input.split(" ", 2);

//            System.out.println(Arrays.toString(inputCutText));
        return inputCutText[0];
    }
    public static String textCase(String inputTo) {
        String[] input = inputTo.split(" ", 2);
        String inputCutText = input[1];
        inputCutText = inputCutText.replaceAll("\\d+", " ").trim();
        return inputCutText;
    }
    private static boolean checkIndex(Integer index) {
        return toDoList.size() > index;
//    System.out.println("Нет такого индекса!");
    }
    public static void operation(String input) {
        if (command(input).equals("Добавить")) {
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
        }

        if (command(input).equals("Удалить")) {
            remove(input);
        }

        if (command(input).equals("Изменить")) {
           /* if (!checkIndex(index(input))) {
                System.out.println("Дела под номером " + index(input) + " нет!");
            } else {
                String unchange = toDoList.get(index(input));
                toDoList.set(index(input), textCase(input));
                System.out.println("Дело " + unchange + " изменено на " + textCase(input));
            }*/
            change(input);
        }

        if (command(input).equals("Печать")) {
            printAll(toDoList);
        }
        if (command(input).equals("Выход")) {
            exit(input);
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
            System.out.println("На" + index(input) + " добавлено дело: " + textCase(input));
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
        public static void change(String input) {
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
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println("Дело: № " + (i + 1) + ". " + toDoList.get(i));
        }
    }
        public static void exit(String input) {
        if (command(input) == "Выход") {
            System.out.println("Выполнение программы завершено");
        }
    }



}