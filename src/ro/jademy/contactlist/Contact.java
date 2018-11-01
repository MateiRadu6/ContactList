package ro.jademy.contactlist;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Contact implements Comparable<Contact> {

    private String firstName;
    private String lastname;
    private Set<PhoneNumber> phoneNumberSet = new HashSet<>();

    public Contact(String firstName, String lastname, String phoneNumber) {
        this.firstName = firstName;
        this.lastname = lastname;
        PhoneNumber pNumber = new PhoneNumber(phoneNumber);
        phoneNumberSet.add(pNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public Set<PhoneNumber> getPhoneNumberSet() {
        return phoneNumberSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(firstName, contact.firstName) &&
                Objects.equals(lastname, contact.lastname) &&
                Objects.equals(phoneNumberSet, contact.phoneNumberSet);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumberSet=" + phoneNumberSet +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastname, phoneNumberSet);
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
