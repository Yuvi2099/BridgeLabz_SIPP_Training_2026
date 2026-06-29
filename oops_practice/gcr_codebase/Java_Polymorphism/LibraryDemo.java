package oops_practice.gcr_codebase.Java_Polymorphism;
class LibraryMember {

    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void printDetails() {
        System.out.println("Member Name : " + memberName);
        System.out.println("Member ID   : " + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int days) {
        return days * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int days) {
        return days * 1;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int days) {
        return days * 5;
    }
}

public class LibraryDemo {

    static void searchMember(LibraryMember[] members, String id) {

        boolean found = false;

        for (LibraryMember m : members) {

            if (m.memberId.equals(id)) {
                System.out.println("\nMember Found");
                m.printDetails();
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Member Not Found");
    }

    public static void main(String[] args) {

        LibraryMember[] members = {

                new StudentMember("Rahul", "S101"),
                new FacultyMember("Amit", "F201"),
                new GuestMember("Priya", "G301")
        };

        int overdueDays = 5;

        System.out.println("Library Members\n");

        for (LibraryMember m : members) {

            m.printDetails();
            System.out.println("Fine = ₹" + m.calculateFine(overdueDays));
            System.out.println();
        }

        searchMember(members, "F201");
    }
}