import java.util.ArrayList;

public class AppointmentManager
{
  
    private ArrayList<Appointment> appointments;

  
    public AppointmentManager()
    {
        appointments = new ArrayList<>();
    }

    // Requesting an Appointment
    public void requestAppointment(Appointment appointment)
    {
        appointments.add(appointment);
        System.out.println("Processing Appointment Request...");
    }

    // Approving and Cancelling Appointment
    public void approveAppointment(Appointment appointment)
    {
        appointment.setStatus(AppointmentStatus.APPROVED);
        System.out.println("Appointment Approved!");
    }


    public void cancelAppointment(Appointment appointment)
    {
        appointment.setStatus(AppointmentStatus.CANCELLED);
        System.out.println("Appointment Cancelled!");
    }

    // Shpw Appointments
    public ArrayList<Appointment> getAppointments()
    {
        return appointments;
    }
}