package ro.jademy.contactlist;

import java.util.List;
import java.util.Objects;

public class Contact implements Comparable<Contact> {

    private String firstName;
    private String lastname;
    private List<PhoneNumber> phoneNumber;

    public Contact(String firstName, String lastname, List<PhoneNumber> phoneNumber) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public List<PhoneNumber> getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(firstName, contact.firstName) &&
                Objects.equals(lastname, contact.lastname) &&
                Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastname, phoneNumber);
    }

    @Override
    public int compareTo(Contact other) {
        int lastNameCompare = this.lastname.compareTo(other.lastname);
        if (lastNameCompare == 0) {
            return lastNameCompare;
        }

        int firstnameCompare = this.firstName.compareTo(other.firstName);
        if (firstnameCompare == 0) {
            return firstnameCompare;
        }

        return lastNameCompare;
    }
}
