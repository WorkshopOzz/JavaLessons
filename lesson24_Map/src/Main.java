import java.util.*;

public class Main {
    /*Map - список элементов entry (энтри)
    Entry - это пара значений со связью: 1(ключ)<==>2(значение)- пара вместе entrySet
    */
    public static void main(String[] args) {
        Map<String, Integer> nameAge = new TreeMap<>();
        nameAge.put("Artem",18);
        nameAge.put("Vasya",12);
        nameAge.put("Alice", 44);
        System.out.println(nameAge.get("Artem"));
        System.out.println(nameAge.containsKey("Vasya"));
        for ( Map.Entry<String, Integer> entry: nameAge.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
                    }
        System.out.println("*************");
        for (Integer age : nameAge.values()){
            System.out.println(age);
        }
        System.out.println("*********************");
        Map<String, Set<String>> nameTodos = new HashMap<>();
        Set<String> todosVasya = new TreeSet<>();
        todosVasya.add("Buy");
        todosVasya.add("Sell");
        nameTodos.put("Vasya", todosVasya);
        Set<String> todosPetya = new TreeSet<>();
        todosPetya.add("Sell P");
        todosPetya.add("Buy P");
        nameTodos.put("Petya", todosPetya);
        for (String todo : nameTodos.get("Vasya")) {   // печатает каждое дело Васи в отдельности
            System.out.println(todo);
        }
        for (Map.Entry<String,Set<String>> entry : nameTodos.entrySet()){
            String name = entry.getKey();
            System.out.println(name); //
            for (String todo : entry.getValue()) {
                System.out.println("\t" + todo);
            }
        }
        System.out.println("*****************");
        System.out.println(nameTodos.containsKey("Vasya"));
//         Проверка значений
        boolean isContains = false;
        for (Map.Entry<String, Set<String>> entry : nameTodos.entrySet()){
            for (String val : entry.getValue()){
                if(val.equals("Buy")){
                    System.out.println(val + " contains in the to-do listТус " + entry.getKey());
                    isContains = true;
                }
            }
        }
        if (!isContains){
            System.out.println("The task is not on the to-do list");
        }
    }

}
