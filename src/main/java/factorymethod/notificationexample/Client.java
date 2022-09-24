package factorymethod.notificationexample;

public class Client {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        try {
            Notification emailNotification = notificationFactory.createNotification("email");
            emailNotification.notifyUser();
        } catch (UnknownChannelException e) {
            System.out.println(e.getMessage());
        }

        try {
            Notification SMSNotification = notificationFactory.createNotification("SMS");
            SMSNotification.notifyUser();
        } catch (UnknownChannelException e) {
            System.out.println(e.getMessage());
        }
    }
}