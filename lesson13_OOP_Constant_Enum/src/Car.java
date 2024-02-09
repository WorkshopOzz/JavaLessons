public class Car {
    private Engine engine;
    private Body body;
    private Wheels wheels;

    public Car(Engine engine, Body body, Wheels weels) {
        this.engine = engine;
        this.body = body;
        this.wheels = weels;
    }

    public Engine getEngine() {
        return engine;
    }

    public Body getBody() {
        return body;
    }

    public Wheels getWeels() {
        return wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setWeels(Wheels weels) {
        this.wheels = weels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", body=" + body +
                ", wheels=" + wheels +
                '}';
    }
}
