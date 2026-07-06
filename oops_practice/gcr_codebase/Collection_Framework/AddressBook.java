package oops_practice.gcr_codebase.Collection_Framework;

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

    public String toString() {
        return "Name: " + name +
                ", Phone: " + phone +
                ", Email: " + email;
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

        System.out.println("Contact Added.");
    }

    static void search(String name) {
        if (map.containsKey(name))
            System.out.println(map.get(name));
        else
            System.out.println("Contact not found.");
    }

    static void delete(String name) {
        Contact c = map.remove(name);

        if (c != null) {
            contacts.remove(c);
            phoneSet.remove(c.phone);
            System.out.println("Contact Deleted.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    static void display() {

        Collections.sort(contacts, (a, b) -> a.name.compareTo(b.name));

        for (Contact c : contacts)
            System.out.println(c);
    }

    public static void main(String[] args) {

        addContact("Rahul", "9876543210", "rahul@gmail.com");
        addContact("Amit", "9123456789", "amit@gmail.com");
        addContact("Neha", "9876543210", "neha@gmail.com");

        System.out.println("\nSearch:");
        search("Rahul");

        System.out.println("\nAll Contacts:");
        display();

        System.out.println("\nDelete:");
        delete("Rahul");

        System.out.println("\nAfter Delete:");
        display();
    }
}