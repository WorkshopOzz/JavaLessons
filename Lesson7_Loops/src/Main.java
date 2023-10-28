import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        for (int i = 0;i < 5; i++) {                        // for (; СѓСЃР»РѕРІРёРµ РїСЂРё РєРѕС‚РѕСЂРѕРј С†РёРєР» СЂР°Р±РѕС‚Р°РµС‚;)
            System.out.println("Hello");
        }
        System.out.println("_____simple 2_____");
        for (int i = 0;i < 5; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println("Hello1");
        }

        System.out.println("_____Simple 3_____");
        for (int i = 0;i < 10; i++){
            if (i < 3 || i > 7){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("_____Simple 3v2_____");
        for (int i = 3; i <= 7; i++) {
            System.out.println(i);
        }
        System.out.println("------  Loop - While  ------");
        boolean isContinue = true;
        while (isContinue) {
            while (isContinue) {
                System.out.println("Hello");
                System.out.println("Continue? (1/0");
                int input = new Scanner(System.in).nextInt();
                if (input == 0) {
                    isContinue = false;
                }
            }

        }
    }
}

