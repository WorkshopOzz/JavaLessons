//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck(2.0,3,"Donald");
        duck.move();
        duck.walk();
        Dog dog = new Dog(12.0,6,"Pluto");
        dog.move();
        dog.walk();
    }
}