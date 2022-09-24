package factorymethod.notificationexample;

public class NotificationFactory {
    public static Notification createNotification(String channel) throws UnknownChannelException {
        return switch (channel) {
            case "email" -> new EmailNotification();
            case "SMS" -> new SMSNotification();
            default -> throw new UnknownChannelException("Channel " + channel + "doesn't exist");
        };
    }
}