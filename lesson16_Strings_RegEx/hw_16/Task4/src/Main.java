import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
              String phoneNumberIn = new Scanner(System.in).nextLine();
        phoneNumberIn = phoneNumberIn.replaceAll("\\D+", "").trim();
//       System.out.println(phoneNumberIn);
//        System.out.println(phoneNumberIn.length());
//        System.out.println(phoneNumberIn.charAt(0));
        if (phoneNumberIn.length() == 11) {
            if (phoneNumberIn.charAt(0) == '7' || phoneNumberIn.charAt(0) == '8') {
//              phoneNumberIn = phoneNumberIn.replaceAll("^\\d", "7");
                phoneNumberIn = '7' + phoneNumberIn.substring(1);
                System.out.println(phoneNumberIn.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})","+$1($2)($3-$4-$5)"));
            }
        } else if (phoneNumberIn.length() == 10) {
            phoneNumberIn = '7' + phoneNumberIn;
            System.out.println(phoneNumberIn.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})","+$1($2)($3-$4-$5)"));
        } else {
            System.out.println("Неверный формат номера");
        }

    }
}


