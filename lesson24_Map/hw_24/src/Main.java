import java.util.*;

public class Main {
    static Map<String, Set<String>> phoneBook = new HashMap<>();
    static Set<String> setNames = new TreeSet<>();
    static final String VALID_REGEX = "([А-яйё-]+\\s){2}([А-яйё-]+)";
    static String keyName;
    static String setPhoneNumber;
    static String command;
    private static boolean flagExit;
    private static boolean flagContinue = false;

    public static void main(String[] args) {
        while (flagExit) {
            dataProcessing(input());
            operation();
        }
    }

    private static void operation() {
        if (command.matches("List")) {
            printList();
        } else if (command.matches("Exit")) {
            exit();
        } else if (command.matches("Test")) {
            test();
        }else add();

    }

    private static void add() {

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
    }

    private static void printList() {
        for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            System.out.println(name); //
            for (String phoneNumber : entry.getValue()) {
                System.out.println("\t" + phoneNumber);
            }
        }
    }

    private static String inputCheck() {


        return null;
    }

    private static void dataProcessing(String inPut) {
        if (inPut.matches("\\d+")) {
            if (inPut.length() == 11) {
                if (inPut.charAt(0) == '7' || inPut.charAt(0) == '8') {
                    inPut = '7' + inPut.substring(1);
                    System.out.println(inPut.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+$1($2)($3-$4-$5)"));
                    setPhoneNumber = inPut;
                }else {
                    System.out.println("Неверный формат номера");
                    flagContinue = true;
                }
            }
            else if (inPut.length() == 10) {
                inPut = '7' + inPut;
                System.out.println(inPut.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+$1($2)($3-$4-$5)"));
                setPhoneNumber = inPut;
            }
            else {
                System.out.println("Неверный формат номера");
                flagContinue = true;
            }
           if (!phoneBook.containsValue(setNames.contains(setPhoneNumber))){

           }
        } else if (inPut.matches("\\w+")) {
            if (inPut.matches("List") || inPut.matches("Exit") || inPut.matches("Test")) {
                command = inPut;
            } else {
                keyName = inPut;
                if (!phoneBook.containsKey(keyName)) {
                    System.out.println("Такого имени в телефонной книге нет." + "\n" + "Введите номер телефона для абонента " + "\"" + keyName + "\"" + ".");
                    setPhoneNumber = input();
                }
                if (phoneBook.containsKey(keyName)){
                    for (String contact : phoneBook.get(keyName)) {
                        System.out.println(contact);
                    }
                    flagContinue = true;
                }
            }
        } else {
            System.out.println("Неверный формат данных");
            flagContinue = true;
        }
    }


private static String input() {
    return new Scanner(System.in).nextLine();
}
    }

