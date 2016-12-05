package live_coding.tdd;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    public void addContact(String firstName, String lastName) {
        contacts.add(new Contact(firstName, lastName));
    }

    public boolean contains(String firstName, String lastName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName) &&  contact.getLastName().equals(lastName))
                return true;
        }
        return false;
    }

}
