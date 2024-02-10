import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputText = new Scanner(System.in).nextLine();
        System.out.println("**************************");
        System.out.println(filter(inputText));
       // String[] split = filter(inputText).split("\\s");
        //for (String e: split){
          //  System.out.println(e);
        //}

    }
public static String filter (String inputText) {
String text = inputText.replaceAll("(\\W+)"," ").trim();
text = text.replaceAll("(\\d+)"," ").trim();
text = text.replaceAll("(\\s){2,}", " ").trim();
text = text.replaceAll("(\\s)", "\n").trim();
    System.out.println(text);
return text;
}
}