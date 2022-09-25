package factorymethod.notificationexample;

public class Client {
    public static void main(String[] args) {
        new NotificationFactory();

        try {
            Notification emailNotification = NotificationFactory.createNotification("email");
            emailNotification.notifyUser();
        } catch (UnknownChannelException e) {
            System.out.println(e.getMessage());
        }

        try {
            Notification SMSNotification = NotificationFactory.createNotification("SMS");
            SMSNotification.notifyUser();
        } catch (UnknownChannelException e) {
            System.out.println(e.getMessage());
        }
    }
}