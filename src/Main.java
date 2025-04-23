public class Main {
    public static void main(String[] args) {
        // Emergency Alert
        EmergencyAlert alert = new EmergencyAlert();
        NotificationService panicButton = new NotificationService(alert);
        panicButton.press(101, "H-12, Islamabad", "Ahmed", "doctor@example.com", "hospital@example.com", "emergency@example.com");

        // Chat Example
        ChatServer server = new ChatServer();
        ChatClient doctor = new ChatClient("Dr. abc", server);
        ChatClient patient = new ChatClient("Patient xyz", server);
        patient.sendMessage("Dr. Alice", "I feel dizzy.");
        doctor.sendMessage("Patient Bob", "Please take rest and monitor your vitals.");

        // Video Call
        VideoCall call = new VideoCall(0, null);
        call.startCall("Zoom", "https://zoom.us/sample-link");

        // Reminders
        Notifiable emailNotifier = new EmailNotification();
        ReminderService reminderEmail = new ReminderService(emailNotifier);
        reminderEmail.sendReminder("bob@example.com", "Take your medication.");

        Notifiable smsNotifier = new SMSNotification();
        ReminderService reminderSMS = new ReminderService(smsNotifier);
        reminderSMS.sendReminder("123-456-7890", "Your appointment is tomorrow.");
    }
}
