import java.util.ArrayList;

public class Administrator extends User
{
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;

    public Administrator(String firstName, String lastName, String email, String phoneNumber, char gender, int age, String address)
    {
        super(firstName, lastName, email, phoneNumber, gender, age, address);
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }


    public void addPatient(Patient patient)
    {
        this.patients.add(patient);
    }

    public ArrayList<Patient> getPatients()
    {
        return patients;
    }

    // Remove Patients
    public void removePatient(Patient patient)
    {
        this.patients.remove(patient);
    }

    // Add Doctors
    public void addDoctor(Doctor doctor)
    {
        this.doctors.add(doctor);
    }

    // Get Doctors
    public ArrayList<Doctor> getDoctors()
    {
        return doctors;
    }

    // Remove Doctors
    public void removeDoctor(Doctor doctor)
    {
        this.doctors.remove(doctor);
    }
}