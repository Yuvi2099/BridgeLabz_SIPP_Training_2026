package oops_practice.gcr_codebase.Collection_Framework;

import java.util.*;

public class EventEntry {

    static HashSet<String> participants = new HashSet<>();

    static void register(String email) {

        if (participants.add(email))
            System.out.println("Registration Successful.");
        else
            System.out.println("Duplicate Registration Rejected.");
    }

    static void display() {

        System.out.println("\nRegistered Participants:");

        for (String email : participants)
            System.out.println(email);

        System.out.println("Total Participants: " + participants.size());
    }

    public static void main(String[] args) {

        register("rahul@gmail.com");
        register("amit@gmail.com");
        register("rahul@gmail.com");

        display();
    }
}