public class Electro extends Car{
    public Electro() {
    }

    public Electro(String mark, Double engineVolume, Integer maxSpeed) {
        super(mark, engineVolume, maxSpeed);
    }

    public void move(){
        System.out.println("Машина elektro движется со скоротью " + super.getMaxSpeed());
    }
}
