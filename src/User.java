public class User
{

    private static int userID = 0;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private char gender;
    private int age;
    private String address;

    @SuppressWarnings("static-access")
    public User(String firstName, String lastName, String email, String phoneNumber, char gender, int age, String address)
    {
        this.userID += 1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getfirstName()
    {
        return firstName;
    }

    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getlastName()
    {
        return lastName;
    }

    public void setlastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public char getGender()
    {
        return gender;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
 @Override
    public String toString() {
        return "User:\n" +
                "User ID: " + userID +
                "\nFirst Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nEmail: " + email +
                "\nPhone Number: " + phoneNumber+
                "\nGender: " + gender +
                "\nAge: " + age +
                "\nAddress: " + address;
    }
}