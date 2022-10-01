package solid.srp.exercise.dirty;

import java.util.Arrays;
import java.util.List;

public class CarManager {
    private List<Car> carsDb = Arrays.asList(new Car("1", "Golf III", "Volkswagen", 25000), new Car("2", "Panda", "Fiat", 15000), new Car("3", "Clio", "Renault", 17000));

    public Car getFromDb(final String carId) {
        for (Car car : carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();

        for (Car car : carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car findMostExpensiveCar() {
        Car bestCar = carsDb.get(0);

        for (Car car : carsDb) {
            if (car.getPrice() > bestCar.getPrice()) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}