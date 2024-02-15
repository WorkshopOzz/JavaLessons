import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    /*
    * HashSet<>()- главное отличие хэш сета от ArrayList является особенности хранения информации.
    * Хэш сет сам назначает индекс для хранения информации. Из-за этого вывод информации по индексу бессмысленен.
    * Два одинаковых объекта не возможно добавить в хэш сет. Он перезапишет один объект другим. В хэш сете находится только один уникальный объект.
    * Используются для удаления повторов объектов из БД.
    * TreeSet - хранит элементы в порядке возрастания. Строки сортируются по алфавиту (вначале заглавные буквы)
    *
    *
    * */
    private static Set<String> words = new TreeSet<>();
    public static void main(String[] args) {
       /* Set<String> strings = new HashSet<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("two");
        strings.remove("three");
        for (String s : strings) { //конструкция фор ич
            System.out.println(s);
        }
        Set<String> stringsTree = new TreeSet<>();
        stringsTree.add("1");
        stringsTree.add("2");
        stringsTree.add("3");
        stringsTree.add("two");
        stringsTree.add("three");
        stringsTree.add("two");
        stringsTree.remove("three");
        for (String s : strings) { //конструкция фор ич
            System.out.println(s);
        }*/
while (true){
    System.out.println("Введите слово: ");
    String word = new Scanner(System.in).nextLine();
    if (word.matches("[А-я]+")) {
        if (word.contains(word)){
            System.out.println("Слово " + word + " уже добавлено ранее");
            continue;
        }
    words.add(word);
        System.out.println(word + " успешно добавлено");
        continue;
    }else if (word.equals("print")){
        for (String w: words ){
            System.out.println(w);
        }
    }

     System.out.println(word + " не русское слово!");

}
    }
}
