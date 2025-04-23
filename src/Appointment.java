public class Appointment
{

    private String date;
    private String time;
    private Patient patient;
    private Doctor doctor;
    private AppointmentStatus status;

    
    public Appointment(String date, String time, Patient patient, Doctor doctor)
    {
        this.date = date;
        this.time = time;
        this.patient = patient;
        this.doctor = doctor;
        this.status = AppointmentStatus.REQUESTED;
    }

    /////////////////////////////////////////// Getters and Setters/////////////////////////////////////////
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Appointment:\n" +
                "Date: " + date +
                "\nTime: " + time +
                "\nPatient: " + patient +
                "\nDoctor: " + doctor +
                "\nStatus: " + status;
    }
}

enum AppointmentStatus
{
    REQUESTED,
    APPROVED,
    CANCELLED;
}