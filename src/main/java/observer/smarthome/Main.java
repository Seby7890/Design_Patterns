package observer.smarthome;

public class Main {
    public static void main(String[] args) {


        try {
            Sensor smokeSensor= SensorFactory.createSensor("smokeSensor", "kitchen", 10);
            Sensor motionSensor= SensorFactory.createSensor("motionSensor", "kitchen", 10);
            SensorSystem sensorSystem = new SensorSystem();

            sensorSystem.registerObserver((Observer)motionSensor);
            sensorSystem.registerObserver((Observer)smokeSensor);

            MotionSensor sensor1 = (MotionSensor) motionSensor;
            SmokeSensor sensor2 = (SmokeSensor) smokeSensor;

            sensor1.setCurrentDistance(3);
            sensor2.setCurrentVolume(12);

            sensorSystem.notifyObservers();

//            motionSensor.setCurrentDistance(6);
//            smokeSensor.setCurrentVolume(12);

            sensorSystem.notifyObservers();
        }catch(IllegalArgumentException e){
            Logger.getInstance().log(e.getMessage());
        }

//        SensorSystem sensorSystem = new SensorSystem();
//
//        sensorSystem.registerObserver(motionSensor);
//        sensorSystem.registerObserver(smokeSensor);
//
//        motionSensor.setCurrentDistance(3);
//        smokeSensor.setCurrentVolume(12);
//
//        sensorSystem.notifyObservers();
//
//        motionSensor.setCurrentDistance(6);
//        smokeSensor.setCurrentVolume(12);

 //       sensorSystem.notifyObservers();
    }
}
