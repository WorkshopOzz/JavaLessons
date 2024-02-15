import java.util.*;

public class Main {
    static Set<String> phoneBook = new TreeSet<>();
//    static Boolean exit = true;

    public static void main(String[] args) {
        while (true) {
            String phoneNumber = phoneNumberinput();
            if (phoneNumber.toLowerCase().equals("выход")) {
                System.out.println("Программа завершена.");
               break;
            }
           else   if (phoneNumber.toLowerCase().equals("печать")){
               if (phoneBook.isEmpty()){
                   System.out.println("Список пуст");
                   return;
               }

                for (String phone : phoneBook){
                    System.out.println(phone);
                } continue;
            }
            phoneNumber = phoneNumberProcessing(phoneNumber);
            if (phoneNumber.contains("Неверный формат номера")) {
                System.out.println("Неверный формат номера");

            } else {
                phoneNumberOperation(phoneNumber);;
            }


        }
    }

   private static void phoneNumberOperation(String phoneNumber) {
        if (phoneBook.contains(phoneNumber)) {
            System.out.println("Такой номер уже есть в базе");
        } else {
            phoneBook.add(phoneNumber);
            System.out.println("Номер успешно добавлен");
        }
    }

   private static String phoneNumberProcessing(String phoneNumberIn) {
        String phoneNumberOut = null;
        phoneNumberIn = phoneNumberIn.replaceAll("\\D+", "").trim();
        if (phoneNumberIn.length() == 11) {
            if (phoneNumberIn.charAt(0) == '7' || phoneNumberIn.charAt(0) == '8') {
                return phoneNumberIn.substring(1);
            }
        } else if (phoneNumberIn.length() == 10) {
            return phoneNumberIn;
        }
            return "Неверный формат номера";
        }
        static String phoneNumberinput () {
            return new Scanner(System.in).nextLine();
        }


    }
