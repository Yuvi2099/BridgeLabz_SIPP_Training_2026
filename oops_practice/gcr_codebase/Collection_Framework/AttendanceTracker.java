package oops_practice.gcr_codebase.Collection_Framework;

import java.util.*;

public class AttendanceTracker {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    static void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (students.contains(student))
            System.out.println(student + " already marked in " + subject);
        else {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        }
    }

    static void displayAttendance() {

        System.out.println();

        for (String subject : attendance.keySet()) {

            System.out.println("Subject: " + subject);

            ArrayList<String> students = attendance.get(subject);

            for (String s : students)
                System.out.println(s);

            System.out.println("Total Present: " + students.size());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Rahul");
        markAttendance("Java", "Amit");
        markAttendance("Java", "Rahul");

        markAttendance("Python", "Neha");
        markAttendance("Python", "Rahul");

        displayAttendance();
    }
}