package ro.jademy.contactlist;

import java.util.*;

public class Phonebook {

    Map<String, ContactGroup> phonebook = new TreeMap<>();




        Set<Map.Entry<String,ContactGroup>> entryContacts = phonebook.entrySet();

        public void showAllContacts() {
            for (Map.Entry<String,ContactGroup > entry : entryContacts ){
                System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
            }
        }

        

}




