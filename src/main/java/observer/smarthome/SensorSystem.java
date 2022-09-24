package observer.smarthome;

import java.util.ArrayList;
import java.util.List;

public class SensorSystem implements Observable {
    private List<Observer> sensorList;

    public SensorSystem() {
        this.sensorList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        sensorList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        sensorList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer sensor : sensorList) {
            sensor.detect();
        }
    }
}
