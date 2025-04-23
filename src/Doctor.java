import java.util.ArrayList;

public class Doctor extends User
{

    private ArrayList<Patient> patients;
    private ArrayList<Appointment> appointments;
    private String specialization;
    public Doctor(String firstName, String lastName, String email, String phoneNumber, char gender, int age, String address, String specialization)
    {
        super(firstName, lastName, email, phoneNumber, gender, age, address);
        this.patients = new ArrayList<>();
        this.appointments = new ArrayList<>();
        this.specialization = specialization;
    }

  
    public void addPatient(Patient patient)
    {
        if (!patients.contains(patient))
        {
            patients.add(patient);
        }
    }

    public ArrayList<Patient> getPatients()
    {
        return patients;
    }

    // Displaying patient vitals
    public void viewPatientVitals(Patient patient)
    {
        if(patient.getVitals().getVitals().isEmpty())
        {
            System.out.println("No vitals found for the patient. Please add vitals first.");
        }
        else
        {
            System.out.println("Vitals of the patient:  " + patient.getfirstName() + " " + patient.getlastName() + " :");
            for (VitalSign vital : patient.getVitals().getVitals())
            {
                System.out.println(vital);
                System.out.println("=============================");
            }
        }
    }
    public String getspecialization()
    {
        return specialization;
    }

    //  patient feedback
    public void giveFeedback(Patient patient, String feedbackContent, Prescription prescription)
    {
        Feedback temp = new Feedback(this.getfirstName() + " " + this.getlastName(), feedbackContent, prescription);
        patient.getMedicalHistory().addFeedback(temp);
    }

    
    public void addAppointment(Appointment appointment)
    {
        if (!appointments.contains(appointment))
        {
            appointments.add(appointment);
        }
    }
    public ArrayList<Appointment> getAppointments()
    {
        return appointments;
    }

}