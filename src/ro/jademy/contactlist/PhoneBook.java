package ro.jademy.contactlist;


import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    Map<String, ContactGroup> phoneBook = new TreeMap<>();

    public void showAllContacts() {
        for (Map.Entry<String, ContactGroup> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey());
            ContactGroup contactGroup = entry.getValue();

            for (Contact c : contactGroup.getContactGroup()) {
                System.out.println(c);
            }
        }
    }

    public void addContact(String firstName, String lastName, String phoneNumber) throws Exception {

        if (phoneNumber == null) {
            throw new IllegalArgumentException("Phone number cannot be null");
        }

        if (phoneNumber.length() != 10) {
            throw new IllegalArgumentException("Phone number length not valid: " + phoneNumber);
        }


        Contact contact = new Contact(firstName, lastName, phoneNumber);
        String firstLetter = getFirstLetter(contact);

        ContactGroup gr = phoneBook.get(firstLetter);
        if (gr == null) {
            gr = new ContactGroup();
            phoneBook.put(firstLetter, gr);
        }

        gr.getContactGroup().add(contact);
    }

    public String getFirstLetter(Contact c) {
        return c.getLastname().substring(0, 1);
    }

//    public PhoneNumber inputPhoneNumber() {
//
//
//        System.out.println("input phone number");
//        String inputnumber = scanner.nextLine();
//
//        PhoneNumber phoneNumber = new PhoneNumber(inputnumber, "Vodafone");
//
//        System.out.println("Want to input another number?");
//
//        return phoneNumber;
//    }

}




