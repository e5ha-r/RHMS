public class VitalSign
{

    private double heartRate;
    private double temperature;
    private double oxygenLevel;
    private double bloodPressure;

    public VitalSign(double heartRate, double temperature, double oxygenLevel, double bloodPressure)
    {
        this.heartRate = heartRate;
        this.temperature = temperature;
        this.oxygenLevel = oxygenLevel;
        this.bloodPressure = bloodPressure;
    }

    ///////////////////////////////////Getters and Setters///////////////////////////////////////
    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(double oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    @Override
    public String toString() {
        return "Vitals: \n" +
                "Heart Rate: " + heartRate +
                "\nTemperature: " + temperature +
                "\nOxygen Level: " + oxygenLevel +
                "\nBlood Pressure: " + bloodPressure;
    }
}