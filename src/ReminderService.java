public class ReminderService {
    private Notifiable notifier;

    public ReminderService(Notifiable notifier) {
        this.notifier = notifier;
    }

    public void sendReminder(String contact, String message) {
        notifier.notifyUser(contact, message);
    }
}