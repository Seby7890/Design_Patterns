package solid.srp.exercise.refactored;

public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    public String getCarsNames() {
        return carService.getCarsNames();
    }

    public Car getMostExpensiveCar() {
        return carService.findMostExpensiveCar();
    }
}