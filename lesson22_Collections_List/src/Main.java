import java.util.ArrayList;
import java.util.List;

public class Main {
    //  В коллекции входят List, Queue (Кью), Set. Так же к ним принято относить Map, но они не унаследованы от Collection
//  List - в отличие от массива более гибкие. Они могут расширяться и уменьшатся динамически. Но в основе List всегда будет массив. Много жрёт памяти
    private static List<String> todos = new ArrayList<>();

    public static void main(String[] args) {
//    int[] array = new int[10];
//        ArrayList<Integer> listBad = new ArrayList<>(); // Плохой пример создания листа. Следует использовать интерфейсы
//        for (int i = 0; i < 2; i++) {
//            listBad.add(i);
//        }
//        listBad.forEach(System.out::println); // распечатка листа.
//        List<Integer> list = new ArrayList<>();
//**************************************************************

        todos.add("Buy 1");
        todos.add("Buy 2");
        todos.add("Buy 3");
        todos.add("Buy 4");

        add("Что то купить");
        delete(2);
        printAll();
        printByIndex(3);
        todos.add(1,"Сделать дело"); // заменяет элемент в листе
        todos.set(1,"Сделать задание"); // добавляет элемент по нужному индексу, смещая бывший элемент по этому индексу вниз по списку

    }

    public static void add(String todo) {
        if (todos.contains(todo)) {
            System.out.println("Дело " + "\"" + todo + " \"" + " уже есть в списке!");
            return;
        }
        todos.add(todo);
        System.out.println("Дело " +"\"" + todo + "\"" + " успешно добавлено!");
    }

    //   todos.size() - узнаем длину
    public static void delete(Integer index) {
        if (!checkIndex(index)) {
            System.out.println("Нет такого индекса!");
            return;
        }
        String todo = todos.get(index);
        todos.remove(todo); // удаляем информацию
        System.out.println("Дело " + "\"" + todo + "\"" + " успешно удалено");
    }

    public static void printAll() {
        for (int i = 0; i < todos.size(); i++) {
            System.out.println(todos.get(i));
        }
    }

    public static void printByIndex(Integer index) {
        if (!checkIndex(index)) {
            System.out.println("Нет такого индекса!");
            return;
        }
        System.out.println("Дело под индексом " + index + ": " + todos.get(index));
    }

    private static boolean checkIndex(Integer index) {
        return todos.size() > index;
//    System.out.println("Нет такого индекса!");
    }

}
