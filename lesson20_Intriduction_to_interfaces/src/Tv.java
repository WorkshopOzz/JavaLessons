public class Tv implements Device{
    @Override
    public void turnOff() {
        System.out.println("Телек выключен");
    }

    @Override
    public void turnOn() {
        System.out.println("Телек включен");
    }
}
