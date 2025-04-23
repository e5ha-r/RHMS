import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;

public class EmailNotification implements Notifiable {
   
    private final String smtpHost = "smtp.gmail.com";
    private final String smtpPort = "587";
    private final String senderEmail = "haideraitezaz2@gmail.com"; //your email
    private final String senderPassword = "cdcndkdkvidbaeja";  // App Password

  
    @Override
    public void sendNotification(String recipient, String messageText, String subject) throws NotificationException
    {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", smtpPort);

        Session session = Session.getInstance(props,
                new Authenticator()
                {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(senderEmail, senderPassword);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject(subject);
            message.setText(messageText);

            Transport.send(message);
            System.out.println("Email sent successfully To: " + recipient);
        } catch (MessagingException e)
        {
            throw new NotificationException("Error sending the email " + e.getMessage());
        }
    }
}