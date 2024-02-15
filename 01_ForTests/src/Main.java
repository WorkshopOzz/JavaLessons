import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String outText = null;
        String textCase = "Добавить купить 4";
        String[] splitText = textCase.split(" ",3);
        System.out.println(Arrays.toString(splitText));
        if (splitText[1].matches("\\d")){
            System.out.println("work");
            outText = splitText[2];
            }else {
            String[] split = textCase.split(" ", 2);
            outText = split[1];
        }

        System.out.println(outText);

//        System.out.println(textCase.equals;

    }
}
