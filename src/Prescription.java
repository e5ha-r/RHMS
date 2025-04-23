import java.util.ArrayList;

public class Prescription
{

    private ArrayList<String> medications;
    private ArrayList<String> dosages;
    private ArrayList<String> schedules;

  
    public Prescription()
    {
        this.medications = new ArrayList<>();
        this.dosages = new ArrayList<>();
        this.schedules = new ArrayList<>();
    }

    ////////////////////////////////////////////// Getter and Setters/////////////////////////////////////////////
    public ArrayList<String> getMedications() {
        return medications;
    }

    public void addMedications(String medication) {
        this.medications.add(medication);
    }

    public ArrayList<String> getDosages() {
        return dosages;
    }

    public void addDosages(String dosage) {
        this.dosages.add(dosage);
    }

    public ArrayList<String> getSchedules() {
        return schedules;
    }

    public void addSchedules(String schedule) {
        this.schedules.add(schedule);
    }
    public void removeMedication(String medication) {
        this.medications.remove(medication);
    }
    @Override
    public String toString() {
        return "Prescription:\n" +
                "Medications: " + medications +
                "\nDosages: " + dosages +
                "\nSchedules: " + schedules;
    }
}