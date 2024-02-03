public class Fen implements Device, Movable{
    @Override
    public void turnOff() {
        System.out.println("Фен выключен");
    }

    @Override
    public void turnOn() {
        System.out.println("Фен включен");
    }
    public void move(){
        System.out.println("Фен перенесли");
    }
}
