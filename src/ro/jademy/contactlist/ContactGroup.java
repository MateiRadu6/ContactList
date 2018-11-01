package ro.jademy.contactlist;

import java.util.HashSet;
import java.util.Set;

public class ContactGroup {

    private Set<Contact> contactGroup = new HashSet<>();

    public Set<Contact> getContactGroup() {
        return contactGroup;
    }
}
