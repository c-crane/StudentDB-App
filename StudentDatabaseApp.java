import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        // Test student
        // Student stu1 = new Student();
        // stu1.enroll();
        // stu1.payTuition();
        // System.out.println(stu1.showInfo());

        // Ask how many students you want to add
        System.out.print("Enter number of students you want to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        for (int n = 0; n < numOfStudents; n++) {
            System.out.println(students[n].showInfo());
        }
    }
    
}
