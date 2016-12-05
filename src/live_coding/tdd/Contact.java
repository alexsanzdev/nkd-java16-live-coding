package live_coding.tdd;

public class Contact {

    private String firstName;
    private String lastName;
    private String emailAddress;

    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Contact(String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmailAddress(String address) {
        this.emailAddress = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void rename(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
