public class Truck extends Car{

    public void move(){
        System.out.println("Машина Track движется со скоротью " + super.getMaxSpeed());
    }

    public Truck() {
    }

    public Truck(String mark, Double engineVolume, Integer maxSpeed) {
        super(mark, engineVolume, maxSpeed);
    }
}
