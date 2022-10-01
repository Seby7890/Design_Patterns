package solid.ocp.demo.vehicle.dirty;

import solid.ocp.demo.vehicle.refactored.Bike;
import solid.ocp.demo.vehicle.refactored.Car;
import solid.ocp.demo.vehicle.refactored.Vehicle;

public class VehicleComputations {
    public double calculateValue(Vehicle v) {
        if (v instanceof Car) {
            return v.getValue() * 0.8;
        }

        if (v instanceof Bike) {
            return v.getValue() * 0.5;
        }
        return 0;
    }
}