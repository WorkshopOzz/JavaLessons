import java.util.*;

public class Main {
    static Map<String, Set<String>> phoneBook = new HashMap<>();
    static String keyName;
    static String phoneNumbers;
    public static void main(String[] args) {
        keyName = "Petya";
        phoneNumbers = "89652231232";

       phoneBook.computeIfAbsent(keyName, keyName -> new TreeSet<>()).add(phoneNumbers);
       phoneNumbers = "89998887766";
       phoneBook.computeIfAbsent(keyName, keyName -> new TreeSet<>()).add(phoneNumbers);
       phoneNumbers = "89998887766";
       keyName = "Vasya";
       phoneNumbers = "89252546387";
       phoneBook.computeIfAbsent(keyName, keyName -> new TreeSet<>()).add(phoneNumbers);

        for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            System.out.println(name);
            for (String phoneNumber : entry.getValue()) {
                System.out.println("\t" + phoneNumber);
            }
        }
    }
//      keyName = "Vasya";
//      phoneNumbers = "89252546387";
//      PhoneList phoneList = new PhoneList(keyName);



    }



