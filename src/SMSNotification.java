public class SMSNotification implements Notifiable
{
    @Override
    public void sendNotification(String recipient, String message, String subject) throws NotificationException
    {
        System.out.println("SMS Sending To:" + recipient + "\nSubject: " + subject + "\nMessage: " + message);
    }
}