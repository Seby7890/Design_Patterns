package solid.srp.exercise.refactored;

import java.util.Arrays;
import java.util.List;

public class CarRepository {
    private final List<Car> carsDb = Arrays.asList(new Car("1", "Golf III", "Volkswagen", 25000), new Car("2", "Panda", "Fiat", 15000), new Car("3", "Clio", "Renault", 17000));

    public Car findCarByID(final String carId) {
        for (Car car : carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> findAllCars() {
        return carsDb;
    }
}