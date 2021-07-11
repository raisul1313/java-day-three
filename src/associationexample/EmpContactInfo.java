package associationexample;

public class EmpContactInfo {
    private String phoneNumber;
    private String emailAddress;
    private String city;
    private String zipcode;

    public EmpContactInfo(String phoneNumber, String emailAddress, String city, String zipcode) {
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.city = city;
        this.zipcode = zipcode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "EmpContactInfo{" + "phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + ", city=" + city + ", zipcode=" + zipcode + '}';
    }

}
