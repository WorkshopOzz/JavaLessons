public class Main {
    public static void main(String[] args) {

      for (int i = 2; i <= 100; i = i + 2)
        {
            System.out.println("IT specialist with id " + i + " fired");
        }
      //second solution
        for (int i = 1; i <= 50; i++){
            if (i % 2 == 0) { // условие для определения кратности 2
                System.out.println("IT specialist with id " + i + " fired");
            }
        }
        //todo Тут увольняем айтишников
    }
}
