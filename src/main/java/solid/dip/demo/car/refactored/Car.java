package solid.dip.demo.car.refactored;

public class Car {
    private final Engine engine;

    public Car(Engine e) {
        engine = e;
    }

    public void start() {
        engine.start();
    }
}