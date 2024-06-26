package be.pxl.paj.servlets.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PhoneBookEntry {
    @Id
    private String phoneNumber;
    private String firstName;
    private String lastName;

    // jpa only
    public PhoneBookEntry() {
    }

    public PhoneBookEntry(String phoneNumber, String firstName, String lastName) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
