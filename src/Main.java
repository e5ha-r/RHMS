public class Main {
    public static void main(String[] args) {

        // CREATE ADMIN, DOCTOR, PATIENT
        Administrator admin = new Administrator("Mr.", "Toby", "Toby@gmail.com", "+92333333333", 'M', 30, "Nust Campus");
        Patient p1 = new Patient("Peter", "Parker", "erehman.bsai24seecs@seecs.edu.pk", "+923222222222", 'M', 21, "Nust Campus");
        Doctor d1 = new Doctor("Dr.", "Roha", "roha@gmail.com", "+923111111111", 'M', 22, "AMC", "Cardiologist");

        admin.addPatient(p1);
        admin.addDoctor(d1);

        // APPOINTMENT scheduling:
        AppointmentManager appointmentManager = new AppointmentManager();
        Appointment appointment1 = new Appointment("2025-08-11", "08:00", p1, d1);
        {
            p1.scheduleAppointment(appointmentManager, appointment1);
            appointmentManager.approveAppointment(appointment1);
            d1.addAppointment(appointment1);
        }
        if (d1.getAppointments().size() < 2)
        {
            System.out.println("Appointment Scheduled");
        } else
        {
            System.out.println("Appointment Cancelled! Doctor is not available for appointment");
        }

        // PRESCRIPTION & FEEDBACK:
        Prescription prescription1 = new Prescription();
        prescription1.addMedications("Ibuprofen");
        prescription1.addDosages("500mg twcie a day");
        prescription1.addSchedules("Daily");
        d1.giveFeedback(p1, "Avoid Junk and Take regular medicines", prescription1);

        System.out.println("\n============Feedback Records=================");
        for (Feedback fb : p1.getMedicalHistory().getFeedbackRecords()) {
            System.out.println(fb);
        }

        // Vitals of the patient
        VitalSign vital1 = new VitalSign(120, 39.0, 80.0, 180);
        p1.uploadVitals(vital1);

        System.out.println("\n===========Patient Vitals=================");
        for (VitalSign vs : p1.getVitals().getVitals()) {
            System.out.println(vs);
        }

        //NOTIFICATION SETUP:
        NotificationService ns = new NotificationService();
        ns.addChannel(new EmailNotification());
        ns.addChannel(new SMSNotification());

        // EMERGENCY ALERT:
        EmergencyAlert alert = new EmergencyAlert(ns);
        alert.evaluate(p1);

        // PANIC BUTTON:
        System.out.println("\n=================== PANIC BUTTON TRIGGERED ========================");
        PanicButton panic = new PanicButton(p1, alert);
        panic.press();

        // CHAT
        System.out.println("\n=======================CHATClient=========================");
        ChatServer chatServer = new ChatServer();
        ChatClient doctor = new ChatClient("Dr. Roha", chatServer);
        ChatClient patient = new ChatClient("Peter", chatServer);

        doctor.sendMessage("Hello Peter, It's Dr.Roha here.How are you feeling?");
        patient.sendMessage("Hello doctor! I am not feeling well.");
        doctor.sendMessage("That is unfortunate. Can you please tell me your symptoms?");
        patient.sendMessage("I have a headache and fever.");
        doctor.sendMessage("Okay, I will prescribe you some medicines.");
        patient.sendMessage("Thank you doctor!");

        // VIDEO CALL (the link is a fake link that means it is not valid and is used only for code purposes)
        System.out.println("\n==========================VIDEO CALL==========================");
        VideoCall.startCall("https://meet.google.com/dummy-link");

        System.out.println("\n===Patient===\n" + p1);
        System.out.println("\n===Doctor===\n" + d1);
        System.out.println("\n===Admin===\n" + admin);
        System.out.println("\n======================= END OF SIMULATION ========================");
    }
}