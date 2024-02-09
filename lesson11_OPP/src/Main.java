// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Duck.footCount = 2;
        Human vasya = new Human("Vasya", "m", 51);
        System.out.println("Name " + vasya.name + " Age " + vasya.age + " Gender " + vasya.gender);
        Human petya = new Human("Petronela", "f", 13);
        petya.walk();
        petya.walk(30);
        System.out.println("Name " + petya.name + " Age " + petya.age + " Gender " + petya.gender);
    Duck kray = new Duck("Кря", 2, "Серая");
    Duck gylya = new Duck("Гуля", 4, "коричневая");
    kray.fly();
    gylya.fly();
    }
}