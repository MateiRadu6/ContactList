package ro.jademy.contactlist;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class ContactGroup {

    Set<Contact> contactGroup   ;

    public ContactGroup(Set<Contact> contactGroup) {
        contactGroup = new HashSet<>();

    }
}
