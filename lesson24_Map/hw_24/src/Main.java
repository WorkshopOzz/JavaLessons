import java.util.*;

public class Main {
    static Map<String, Set<String>> phoneBook = new HashMap<>();
    static String keyName;
    static String phoneNumber;
    static String command = "add";
    private static boolean flagExit;

    //    private static boolean isContains = false;
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу \"Телефонная книга\"");
        while (!flagExit) {
            dataInputFormat();
            dataProcessing(input());
            operation();

        }
        System.out.println("Программа завершила выполнение.");
    }

    private static void dataProcessing(String inPut) {
        if (inPut.matches("\\d+")) {

        } else if (inPut.matches("\\w+")) {
            if (inPut.matches("List") || inPut.matches("Exit") || inPut.matches("Test") || inPut.matches("Command")) { //проверка на наличие команд вводе из консоли
                command = inPut;
            } else {
                if (checkNameContact(inPut).equals(inPut)) {
                    System.out.println("Такого имени в телефонной книге нет." + "\n" + "Введите номер телефона для абонента " + "\"" + inPut + "\"" + ":");
                    inPut = keyName;
                    String beforCheckPhoneNumber = input();
                    checkPhoneNumber(beforCheckPhoneNumber);
                }
                else System.out.println(checkNameContact(inPut));
            }
        }
        else errorMessage(TypeError.GENERAL);
    }

    private static String checkNameContact(String nameContact) {
        if (phoneBook.containsKey(nameContact)) { //Проверка на наличие ключа в мапе
            for (String contact : phoneBook.get(keyName)) {
                return contact;
            }
        }
        return nameContact;
    }

    private static void checkPhoneNumber(String beforCheckPhoneNumber) {
    }

    private static void dataInputFormat() {
        System.out.println("Введите номер телефона (формата 79151112233, 89151112233, 9151112233) или имя контакта (состоящие из букв).\n" +
                "Для получения списка команд введите  \"Command\"");
    }

    private static void operation() {
        if (command.matches("List")) {
            printList();
        } else if (command.matches("Exit")) {
            exit();
        } else if (command.matches("errorMessage")) {
            System.out.println("Повторите ввод");
        } else if (command.matches("Command")) {
            listCommand();
        } else add();
    }

    private static void listCommand() {
        System.out.println("List - вывод списка контакта на экран.\n" +
                "Exit - выход из программы.");
    }

    private static void add() {
        phoneBook.computeIfAbsent(keyName, setPhoneNumbers -> new TreeSet<>()).add(phoneNumber);
    }

    private static void exit() {
        flagExit = false;
    } //флаг для завершения программы

    private static void printList() {  //метод для печати телефонной книги
        for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            System.out.println(name);
            for (String phoneNumber : entry.getValue()) {
                System.out.println("\t" + phoneNumber);
            }
        }
    }

    private static void errorMessage(TypeError typeError) {
        System.out.println(typeError.getValue());
    }

    private static String input() {
        return new Scanner(System.in).nextLine();
    } //ввод данных
}

