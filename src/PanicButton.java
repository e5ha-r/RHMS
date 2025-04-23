public class PanicButton {

    private Patient patient;
    private EmergencyAlert emergencyAlert;

    public PanicButton(Patient patient, EmergencyAlert emergencyAlert)
    {
        this.patient = patient;
        this.emergencyAlert = emergencyAlert;
    }

    public void press()
    {
        System.out.println("Panic Button Pressed! \nPatient: " + patient.getfirstName() + " " + patient.getlastName());
        emergencyAlert.evaluate(patient);
    }
}