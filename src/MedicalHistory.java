import java.util.ArrayList;

public class MedicalHistory
{
    private ArrayList<Feedback> feedbackRecords;

    public MedicalHistory()
    {
        feedbackRecords = new ArrayList<>();
    }

    public void addFeedback(Feedback feedback)
    {
        feedbackRecords.add(feedback);
    }

    //  REMOVING fEEDBACK RECORDS:
    public void removeFeedback(Feedback feedback)
    {
        feedbackRecords.remove(feedback);
    }
    // Get Feedback Records
    public ArrayList<Feedback> getFeedbackRecords()
    {
        return feedbackRecords;
    }
}