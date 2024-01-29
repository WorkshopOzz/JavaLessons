public class Sedan extends Car{

    public void move(){
        System.out.println("Машина Sedan движется со скоротью " + super.getMaxSpeed());
    }

    public Sedan() {
    }

    public Sedan(String mark, Double engineVolume, Integer maxSpeed) {
        super(mark, engineVolume, maxSpeed);
    }
}
