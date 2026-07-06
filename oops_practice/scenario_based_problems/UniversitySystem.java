package oops_practice.scenario_based_problems;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {
    final int studentId;
    double gpa;

    Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Student ID: " + studentId +
                ", GPA: " + gpa;
    }
}

class GradStudent extends Student {
    String thesis;

    GradStudent(String name, int age, int studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Thesis: " + thesis;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        GradStudent gradStudent = new GradStudent(
                "Vishal",
                22,
                101,
                9.2,
                "Artificial Intelligence"
        );

        System.out.println("GradStudent Details:");
        System.out.println(gradStudent);

        // IS-A Relationship
        Person person = gradStudent;
        Student student = gradStudent;

        System.out.println("\nIS-A Relationship Demonstration:");
        System.out.println("GradStudent IS-A Student : " + (gradStudent instanceof Student));
        System.out.println("GradStudent IS-A Person  : " + (gradStudent instanceof Person));
        System.out.println("Student IS-A Person      : " + (student instanceof Person));

        System.out.println("\nUsing Person Reference:");
        System.out.println(person);

        System.out.println("\nUsing Student Reference:");
        System.out.println(student);
    }
}