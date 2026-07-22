import java.util.*;

abstract class CourseType {
    String title;

    CourseType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

class ExamCourse extends CourseType {
    ExamCourse(String title) {
        super(title);
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String title) {
        super(title);
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String title) {
        super(title);
    }
}

class Course<T extends CourseType> {

    List<T> courses = new ArrayList<>();

    void addCourse(T course) {
        courses.add(course);
    }

    List<T> getCourses() {
        return courses;
    }
}

public class CourseManagementSystem {

    static void display(List<? extends CourseType> list) {

        for (CourseType c : list)
            System.out.println(c);
    }

    public static void main(String[] args) {

        Course<ExamCourse> exams = new Course<>();
        exams.addCourse(new ExamCourse("Data Structures"));

        Course<ResearchCourse> research = new Course<>();
        research.addCourse(new ResearchCourse("Artificial Intelligence"));

        display(exams.getCourses());
        display(research.getCourses());
    }
}