import  java.util.*;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();


    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(contact.getFirstName()) &&
                    c.getLastName().equalsIgnoreCase(contact.getLastName())) {
                System.out.println("⚠ Contact with the name "
                        + contact.getFirstName() + " "
                        + contact.getLastName() + " already exists!");
                return;
            }
        }
        contacts.add(contact);
        System.out.println("✅ Contact added successfully!");
    }
}