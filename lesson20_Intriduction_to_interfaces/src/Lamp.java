public class Lamp implements Device, Movable{

    @Override
    public void turnOff() {
        System.out.println("Лампа выключен");
    }

    @Override
    public void turnOn() {
        System.out.println("Лампа включен");
    }


    @Override
    public void move() {
        System.out.println("Лампу перенесли");
    }
}
