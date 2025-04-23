public class EmergencyAlert {

    private NotificationService notificationService;

    // Instance Variables to Define Thresholds:
    private final double MAX_HEART_RATE = 120;
    private final double MAX_TEMP = 39.0;
    private final double MIN_OXYGEN = 90;
    private final double MAX_BP = 190;

    public EmergencyAlert(NotificationService notificationService)
    {
        this.notificationService = notificationService;
    }

    public void evaluate(Patient patient)
    {
        VitalSign vitals = patient.getVitals().getLatestVitals();

        if (vitals == null)
        {
            System.out.println("XX No vitals found for " + patient.getfirstName()+ "Please add vitals first.");
            return;
        }

        boolean alertNeeded = false;
        StringBuilder alert = new StringBuilder();
        alert.append("Emergency Alert for ")
                .append(patient.getfirstName()).append(" ").append(patient.getlastName()).append(":\n");

        if (vitals.getHeartRate() > MAX_HEART_RATE)
        {
            alertNeeded = true;
            alert.append("High Heart Rate: ").append(vitals.getHeartRate()).append(" bpm\n");
        }

        if (vitals.getTemperature() > MAX_TEMP)
        {
            alertNeeded = true;
            alert.append("High Temperature: ").append(vitals.getTemperature()).append(" °C\n");
        }

        if (vitals.getOxygenLevel() < MIN_OXYGEN)
        {
            alertNeeded = true;
            alert.append("Low Oxygen Level: ").append(vitals.getOxygenLevel()).append(" %\n");
        }

        if (vitals.getBloodPressure() > MAX_BP)
        {
            alertNeeded = true;
            alert.append("High Blood Pressure: ").append(vitals.getBloodPressure()).append(" mmHg\n");
        }

        if (alertNeeded)
        {
            String msg = alert.toString();
            notificationService.send(patient.getEmail(), msg, "EMERGENCY ALERT ACTIVATED!");
            notificationService.send(patient.getPhoneNumber(), msg, "EMERGENCY ALERT ACTIVATED!");
            System.out.println("Alert has been sent to " + patient.getfirstName());
        }
        else
        {
            System.out.println("" + patient.getfirstName() + " has normal vitals.");
        }
    }
}