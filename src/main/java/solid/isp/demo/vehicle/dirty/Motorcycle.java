package solid.isp.demo.vehicle.dirty;

public class Motorcycle implements Vehicle {
    public void drive() {
    }

    public void stop() {
    }

    public void refuel() {
    }

    public void openDoors() {
        throw new UnsupportedOperationException();
    }
}