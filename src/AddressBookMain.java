import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book!");

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Display Contacts");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter First Name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    Contact contact = new Contact(firstName, lastName, address, phone);
                    addressBook.addContact(contact);
                    break;

                case 2:
                    System.out.print("Enter First Name of contact to edit: ");
                    String nameToEdit = sc.nextLine();
                    addressBook.editContact(nameToEdit, sc);
                    break;

                case 3:
                    addressBook.displayContacts();
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}