public class Main {
    public static void main(String[] args) {
        Pet duck = new Duck(2.0,3,"Donald");
        duck.move();
        duck.walk();
        Pet dog = new Dog(12.0,6,"Pluto");
        dog.move();
        dog.walk();
    }
}