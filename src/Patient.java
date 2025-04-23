import java.util.ArrayList;

public class Patient extends User
{
  
    private VitalsDatabase vitals;
    private ArrayList<Appointment> appointments;
    private MedicalHistory medicalHistory;

    // Constructor:
    public Patient(String firstName, String lastName, String email, String phoneNumber, char gender, int age, String address)
    {
        super(firstName, lastName, email, phoneNumber, gender, age, address);
        this.appointments = new ArrayList<>();
        this.medicalHistory = new MedicalHistory();
        this.vitals = new VitalsDatabase();
    }

    // Uploading  Vitals
    public void uploadVitals(VitalSign vital)
    {
        vitals.addVitals(vital);
    }
    public VitalsDatabase getVitals()
    {
        return vitals;
    }


    public void scheduleAppointment(AppointmentManager manager, Appointment appointment)
    {
        manager.requestAppointment(appointment);
    }

    // Retrieve Appointments:
    public ArrayList<Appointment> getAppointments()
    {
        return appointments;
    }

    public void viewFeedback()
    {
        if(medicalHistory.getFeedbackRecords().isEmpty())
        {
            System.out.println("No feedback records found");
        }
        else
        {
            System.out.println("Feedback Records for " + this.getfirstName() + " " + this.getlastName() + " :");
            for (Feedback feedback : medicalHistory.getFeedbackRecords())
            {
                System.out.println(feedback);
                System.out.println("-----------------------------");
            }
        }
    }

    public MedicalHistory getMedicalHistory()
    {
        return medicalHistory;
    }
}