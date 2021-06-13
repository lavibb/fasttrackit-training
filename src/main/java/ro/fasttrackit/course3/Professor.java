package ro.fasttrackit.course3;

// The class and its fields

public class Professor {

    String lastName;
    String firstName;
    String dateOfBirth;
    String dateOfHiring;
    String emailAdress;
    String phd;
    // getters and setters

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(String dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getPhd() {
        return phd;
    }

    public void setPhd(String phd) {
        this.phd = phd;
    }


// default constructor

 public Professor () {

 }
 // constructor with all parameters

 public  Professor( String lastName , String firstName , String dateOfBirth ,
                    String dateOfHiring ,String emailAdress, String phd) {
    lastName= lastName;
    firstName=firstName;
    dateOfBirth=dateOfBirth;
    dateOfHiring=dateOfHiring;
    emailAdress=emailAdress;
    phd=phd;
 }
}