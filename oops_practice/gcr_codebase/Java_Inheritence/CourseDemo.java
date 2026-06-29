package oops_practice.gcr_codebase.Java_Inheritence;
class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName,int duration,String platform,boolean isRecorded) {

        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName,int duration,String platform,boolean isRecorded,double fee,double discount) {

        super(courseName, duration,
                platform, isRecorded);

        this.fee = fee;
        this.discount = discount;
    }

    void display() {
        System.out.println("Course: " + courseName);
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

public class CourseDemo {
    public static void main(String[] args) {

        PaidOnlineCourse p =
                new PaidOnlineCourse(
                        "Java",
                        60,
                        "Udemy",
                        true,
                        2000,
                        20);

        p.display();
    }
}
