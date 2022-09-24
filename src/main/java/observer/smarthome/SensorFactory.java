package observer.smarthome;

public class SensorFactory {
    public static Sensor createSensor(String type, String name, int threshold) {
        return switch (type) {
            case "motionSensor" -> new MotionSensor(name, threshold);
            case "smokeSensor" -> new SmokeSensor(name, threshold);
            default -> throw new IllegalArgumentException("sensor type not available");
        };
    }
}
