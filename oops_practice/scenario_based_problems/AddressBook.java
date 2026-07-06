package oops_practice.scenario_based_problems;
import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

public class AddressBook {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    static void addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number not allowed.");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);
        System.out.println("Contact added.");
    }

    static void searchContact(String name) {
        Contact c = map.get(name);
        if (c != null)
            System.out.println(c);
        else
            System.out.println("Contact not found.");
    }

    static void deleteContact(String name) {
        Contact c = map.remove(name);

        if (c != null) {
            contacts.remove(c);
            phoneSet.remove(c.phone);
            System.out.println("Contact deleted.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    static void displayContacts() {
        Collections.sort(contacts, (a, b) -> a.name.compareToIgnoreCase(b.name));

        System.out.println("\nContacts:");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        addContact("Vishal", "9876543210", "vishal@gmail.com");
        addContact("Aman", "9123456789", "aman@gmail.com");
        addContact("Riya", "9988776655", "riya@gmail.com");
        addContact("Rahul", "9876543210", "rahul@gmail.com");

        searchContact("Aman");

        deleteContact("Riya");

        displayContacts();
    }
}
