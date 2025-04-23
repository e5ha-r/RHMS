public class Feedback
{
    // Instance Variables:
    private String doctorName;
    private String feedbackContent;
    private Prescription prescription;

    // Constructor:
    public Feedback(String doctorName, String feedbackContent, Prescription prescription)
    {
        this.doctorName = doctorName;
        this.feedbackContent = feedbackContent;
        this.prescription = prescription;
    }

    ///////////////////////////Getters and Setters/////////////////////////////////
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }


    @Override
    public String toString() {
        return "Feedback!!! \n" +
                "Doctor's Name: " + doctorName +
                "\nFeedback: " + feedbackContent +
                "\n" + prescription;
    }
}