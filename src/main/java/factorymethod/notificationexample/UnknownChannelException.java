package factorymethod.notificationexample;

public class UnknownChannelException extends Exception {
    public UnknownChannelException(String message) {
        super(message);
    }
}