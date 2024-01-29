//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Sedan sedan = new Sedan("Lada", 1.6, 300);
sedan.signal();
sedan.move();
   Truck truck = new Truck("Kamaz", 3.5,180);
   truck.signal();
   truck.move();
   Electro electro = new Electro("Tesla",null,350);
   electro.move();
   electro.signal();

    }
}