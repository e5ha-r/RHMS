import java.util.ArrayList;


public class Patient extends User{


    private String assignedDoctoremail;
    private String Address;
    private String Gender;
    private String EmergencyContact;
    private String nearestHospitalEmail;



    private boolean hasUploadedVitals;

    public Patient(int patientID, String patientName, String email, String password, String assignedDoctoremail,
                   String Address, String Gender, String EmergencyContact, String nearestHospitalEmail){
        super(patientID , patientName , email , password);


        this.assignedDoctoremail = assignedDoctoremail;
        this.Address = Address;
        this.Gender = Gender;
        this.EmergencyContact = EmergencyContact;
        this.nearestHospitalEmail = nearestHospitalEmail;
        hasUploadedVitals = false;
    }

    /// /////////////////////////////////PRESS PANIC BUTTON/////////////////////////////
    public void pressPanicButton(){
        NotificationService.sendNotificationToDoctor(getUserId(),getAddress(),getUsername() , getAssignedDoctoremail());
        NotificationService.sendNotificationToHospital(getAddress(), getUsername(), getAssignedDoctoremail());
        NotificationService.sendNotificationToEmergencyContact(getAddress(), getUsername(), getEmergencyContact());
    }

    /// /////////////////////////////VIDEO CALL///////////////////////////////////////
    public void requestVideoCall(){
        VideocallDAO.requestVideoCall(getUserId(),getAssignedDoctoremail());
    }

    public ArrayList<String> getLinkForApprovedVideoCall(){
        ArrayList<String> linkForApprovedVideoCall = VideocallDAO.getApprovedVideoLinks(this.getUserId());
        return linkForApprovedVideoCall;
    }








    /////////////////////////////////getters and setters//////////////////////////////////


    public String getAssignedDoctoremail() {return assignedDoctoremail;}
    public String getAddress() {return Address;}
    public String getGender() {return Gender;}
    public String getEmergencyContact() {return EmergencyContact;}
    public String getNearestHospitalEmail() {return nearestHospitalEmail;}
    public boolean getHasUploadedVitals() {return hasUploadedVitals;}


    //Method for signIN
    public static Patient getInstanceOfPateintAndValidatePassword(String patientEmail, String password) {
        Patient patient = AdminDAO.authenticatePatient(patientEmail, password);
        return patient;
    }

    //Method for SignUP
    public static Patient signUpPatient(int patientID, String patientName, String email, String password, String assignedDoctoremail,
                                        String Address, String Gender, String EmergencyContact, String nearestHospitalEmail){
        Patient newPatient = new Patient(patientID, patientName, email, password, assignedDoctoremail,
                Address, Gender, EmergencyContact, nearestHospitalEmail);
        AdminDAO.addNewPatient(newPatient);
        return newPatient;
    }
}
