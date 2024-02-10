public class Dog extends Pet{
   @Override
    public void move(){
        System.out.println("Собака по кличке " + super.getName() + " бежит по земле" );
    }

    public Dog(Double weight, Integer age, String name) {
        super(weight, age, name);
    }

    public Dog() {
    }
}
