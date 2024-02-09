import java.util.Scanner;

public class Sample2 {
    public static final String VALID_REGEX = "([А-яё-]+\\s){2}([А-яё-]+)";
    public static void main(String[] args) {
        String info = new Scanner(System.in).nextLine();
        if(info.matches(VALID_REGEX)) {
        System.out.println("valid");
    }     else {
            System.out.println("invalid");
        }
    }
}
