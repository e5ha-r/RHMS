import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;

public class EmailNotification implements Notifiable {

    private static final String senderEmail = "youremail@gmail.com";
    private static final String senderPassword = "yourapppassword";

    @Override
    public void notifyUser(String contact, String messageText) {
        sendEmail(contact, "Notification from RPMS", messageText);
    }

    public static void sendEmail(String contact, String subject, String messageText) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(contact)
            );
            message.setSubject(subject);
            message.setText(messageText);

            Transport.send(message);
            System.out.println("Email sent to " + contact);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
