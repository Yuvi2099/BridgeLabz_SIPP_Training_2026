package oops_practice.gcr_codebase.Java_Polymorphism;
class Notification {

    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    void sendNotification() {
        System.out.println("Notification Sent");
    }
}

class EmailNotification extends Notification {

    EmailNotification(String name, String msg) {
        super(name, msg);
    }

    @Override
    void sendNotification() {
        System.out.println("Email sent to " + recipientName);
        System.out.println("Message: " + message);
    }
}

class SMSNotification extends Notification {

    SMSNotification(String name, String msg) {
        super(name, msg);
    }

    @Override
    void sendNotification() {
        System.out.println("SMS sent to " + recipientName);
        System.out.println("Message: " + message);
    }
}

class PushNotification extends Notification {

    PushNotification(String name, String msg) {
        super(name, msg);
    }

    @Override
    void sendNotification() {
        System.out.println("Push Notification sent to " + recipientName);
        System.out.println("Message: " + message);
    }
}

public class NotificationDemo {

    public static void main(String[] args) {

        Notification[] notifications = {

                new EmailNotification("Rahul", "Meeting at 10 AM"),
                new SMSNotification("Priya", "OTP: 987654"),
                new PushNotification("Amit", "New Offer Available")
        };

        System.out.println("Sent Notifications\n");

        for (Notification n : notifications) {
            n.sendNotification();
            System.out.println();
        }
    }
}