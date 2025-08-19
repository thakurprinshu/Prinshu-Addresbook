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
                return; // don't add duplicate
            }
        }
        contacts.add(contact);
        System.out.println("✅ Contact added successfully!");
    }

    public void editContact(String firstName, Scanner sc) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println("Enter new address: ");
                contact.setAddress(sc.nextLine());

                System.out.println("Contact updated: " + contact);
                return;
            }
        }
        System.out.println("⚠ Contact not found.");
    }
}



