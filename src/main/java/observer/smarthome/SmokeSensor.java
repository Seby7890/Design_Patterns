package observer.smarthome;

public class SmokeSensor extends Sensor implements Observer {
    private final int activationVolume;
    private int currentVolume;

    public SmokeSensor(String name, int activationVolume) {
        super(name);
        this.activationVolume = activationVolume;
    }

    public int getActivationVolume() {
        return activationVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    @Override
    public void detect() {
        if (currentVolume > activationVolume) {
            Logger.getInstance().log("Volume has increased with " + (getCurrentVolume() - getActivationVolume()));
        }
    }
}