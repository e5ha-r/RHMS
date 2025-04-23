public class SMSNotification implements Notifiable {
    public void notifyUser(String phone, String message) {
        System.out.println("SMS to " + phone + ": " + message);
    }
}
