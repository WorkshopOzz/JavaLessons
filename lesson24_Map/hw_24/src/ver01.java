import java.util.*;

public class ver01 {
    static Map<String, Set<String>> phoneBook = new HashMap<>();
    static String keyName;
    static String phoneNumber;
    static String command = "add";
    private static boolean flagExit;
    private static boolean isContains = false;
//    private static boolean flagContinue = false;

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу \"Телефонная книга\"");
        while (!flagExit) {
            dataInputFormat();
            dataProcessing(input());
            operation();

        }
        System.out.println("Программа завершила выполнение.");
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
        } else if (command.matches("Test")) {
            test();
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

    private static void test() {
        dataProcessing("Маша");
        dataProcessing("79001234567");
        dataProcessing("79007654321");
        dataProcessing("Маша");
        dataProcessing("Nfif@");
        dataProcessing("LIST");
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

    private static boolean keyNameCheck(String inPut) {
        //если в начальном вводе были буквы, далее идет обработка.
        return inPut.matches("\\w+");

    }


    private static void dataProcessing(String inPut) { //обработка полученных данных из консоли
        if (inPut.matches("\\d+")) { //Определение содержания данных полученных с консоли (текст или цифры)
            if (inPut.length() == 11) { //определение и приведение в нужный формат телефонного номера
                if (inPut.charAt(0) == '7' || inPut.charAt(0) == '8') { //приведение телефонного номера в нужный формат
                    inPut = '7' + inPut.substring(1);
                    System.out.println(inPut.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+$1($2)($3-$4-$5)"));
                    phoneNumber = inPut;
                } else { // если телефонный номер имеет длину 11 символов и начинается не 7 или 8
                    errorMessage("phoneNumber");
                    command = "errorMessage";


                }
            } else if (inPut.length() == 10) { // если телефонный номер имеет 10 символов
                inPut = '7' + inPut;
                System.out.println(inPut.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+$1($2)($3-$4-$5)"));
                phoneNumber = inPut;
            } else { // если телефонный номер имеет большее или меньшее число символов
                errorMessage("phoneNumber");
                command = "errorMessage";
            }
            boolean isContains = false; //проверка наличия номера в мапе
            for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
                for (String val : entry.getValue()) {
                    if (val.equals(phoneNumber)) {
                        isContains = true;
                        System.out.println("\"" + entry.getKey() + "\" " + "\"" + phoneNumber + "\"" + ".");
                    }
                }
            }
        }
        if (!isContains) {
            System.out.println("Такого номера нет в телефонной книге.\n" + "Введите имя абонента для номера:  " +
                    "\"" + phoneNumber + "\"" + ".");
            String nameBeforeCheck = input(); //проверка формата ввода имени
            if (keyNameCheck(nameBeforeCheck)) {
                keyName = nameBeforeCheck;
                System.out.println(keyName);
            } else errorMessage("name");
            command = "errorMessage";
        } else if (inPut.matches("\\w+")) { //если в начальном вводе были буквы, далее идет обработка.
            if (inPut.matches("List") || inPut.matches("Exit") || inPut.matches("Test") || inPut.matches("Command")) { //проверка на наличие команд вводе из консоли
                command = inPut;
            } else {
                keyName = inPut;
                if (!phoneBook.containsKey(keyName)) { //Проверка на наличие ключа в мапе
                    System.out.println("Такого имени в телефонной книге нет." + "\n" + "Введите номер телефона для абонента " + "\"" + keyName + "\"" + ".");
                    String beforCheckPhoneNumber = input();
                    checkPhoneNumber(beforCheckPhoneNumber);
                }
                if (phoneBook.containsKey(keyName)) { //если ключ существует
                    for (String contact : phoneBook.get(keyName)) {
                        System.out.println(contact);
                    }
                }
            }
        } else {
            command = "errorMessage";
            errorMessage("name");
        }

    }

    private static void checkPhoneNumber(String inPut) {
        if (inPut.matches("\\d+")) { //Определение содержания данных полученных с консоли (текст или цифры)
            if (inPut.length() == 11) { //определение и приведение в нужный формат телефонного номера
                if (inPut.charAt(0) == '7' || inPut.charAt(0) == '8') { //приведение телефонного номера в нужный формат
                    inPut = '7' + inPut.substring(1);
                    System.out.println(inPut.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+$1($2)($3-$4-$5)"));
                    phoneNumber = inPut;
                } else { // если телефонный номер имеет длину 11 символов и начинается не 7 или 8
                    errorMessage("phoneNumber");
                    command = "errorMessage";


                }
            } else if (inPut.length() == 10) { // если телефонный номер имеет 10 символов
                inPut = '7' + inPut;
                System.out.println(inPut.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+$1($2)($3-$4-$5)"));
                phoneNumber = inPut;
            } else { // если телефонный номер имеет большее или меньшее число символов
                errorMessage("phoneNumber");
                command = "errorMessage";
            }
            //проверка наличия номера в мапе
            for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
                for (String val : entry.getValue()) {
                    if (val.equals(phoneNumber)) {
                        isContains = true;
                        System.out.println("\"" + entry.getKey() + "\" " + "\"" + phoneNumber + "\"" + ".");
                    }
                }
            }
        }
    }


    private static void errorMessage(String phoneNumberOrName) {
        if (phoneNumberOrName.contains("phoneNumber")) {
            System.out.println("Неверный формат ввода номера телефона");
        } else if (phoneNumberOrName.contains("name")) {
            System.out.println("Неверный формат ввода имени абонента");
        }

    }

    private static String input() {
        return new Scanner(System.in).nextLine();
    } //ввод данных
}

