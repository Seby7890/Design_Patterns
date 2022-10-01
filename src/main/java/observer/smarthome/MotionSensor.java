package observer.smarthome;

public class MotionSensor extends Sensor implements Observer {
    private final int activationDistance;
    private int currentDistance;

    public MotionSensor(String name, int activationDistance) {
        super(name);
        this.activationDistance = activationDistance;
    }

    public int getActivationDistance() {
        return activationDistance;
    }

    public int getCurrentDistance() {
        return currentDistance;
    }

    public void setCurrentDistance(int currentDistance) {
        this.currentDistance = currentDistance;
    }

    @Override
    public void detect() {
        if (currentDistance < activationDistance) {
            Logger.getInstance().log("Distance has been reduced with " + (getActivationDistance() - getCurrentDistance()));
        }
    }
}