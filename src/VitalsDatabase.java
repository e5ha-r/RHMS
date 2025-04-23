import java.util.ArrayList;

public class VitalsDatabase
{

    private ArrayList<VitalSign> vitalSigns;

 
    public VitalsDatabase()
    {
        vitalSigns = new ArrayList<VitalSign>();
    }

    public void addVitals(VitalSign vital)
    {
        vitalSigns.add(vital);
        System.out.println("Vitals Added Succesfully!");
    }
    public ArrayList<VitalSign> getVitals()
    {
        return vitalSigns;
    }

    // Retrieve Latest Vitals
    public VitalSign getLatestVitals() {
        if (!vitalSigns.isEmpty())
        {
            return vitalSigns.get(vitalSigns.size() - 1);
        } else
        {
            return null;
        }
    }


}