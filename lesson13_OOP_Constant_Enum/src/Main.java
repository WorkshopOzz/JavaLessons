public class Main {
    public static void main(String[] args) {
        Deliver deliver = new Deliver();
        deliver.calculatedDeliverPrice(DeliverTypes.AERO);

        Body body = new Body("Sedan");
        Wheels wheels = new Wheels(4);
        Engine engine = new Engine("BMW", 3);
        Car car = new Car(engine, body, wheels);
        System.out.println("Объем двигателя: " + car.getEngine().getVolume());
        System.out.println(car);

    }
}