package stringbasic;

public class Person {

    private String name;
    private String email;
    private String taj;
    private String bankAccountNumber;
    private String phoneNumber;

    public Person(String name, String email, String taj, String bankAccountNumber, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.taj = taj;
        this.bankAccountNumber = bankAccountNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTaj() {
        return taj;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTaj(String taj) {
        this.taj = taj;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", taj='" + taj + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
