package gcr_codebase.Heap;
import java.util.PriorityQueue;
public class InsertExtractHeap {

    static class Patient {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        @Override
        public String toString() {
            return name + " (Severity: " + severity + ")";
        }
    }

    static PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> b.severity - a.severity);

    public static void addPatient(String name, int severity) {
        triageQueue.offer(new Patient(name, severity));
    }

    // Extract highest priority patient
    public static Patient treatNext() {
        if (triageQueue.isEmpty()) {
            return null;
        }
        return triageQueue.poll();
    }

    public static void main(String[] args) {

        addPatient("Rahul", 5);
        addPatient("Aman", 9);
        addPatient("Priya", 7);
        addPatient("Riya", 3);

        System.out.println("Treatment Order:");

        while (!triageQueue.isEmpty()) {
            System.out.println(treatNext());
        }
    }
}