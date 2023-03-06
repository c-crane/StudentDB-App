import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;


    //Constructor: prompt to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman\n2 - for Sophmore\n3 - for Junior\n4 - for Senior\nEnter student class level: ");
        this.year = in.nextInt();

        setStudentID();

        // System.out.println(firstName + " " + lastName + " " + studentID);
    }

    // Generate ID
    private void setStudentID() {
        id++;
        studentID = year + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else { break; }
        } while (1 != 0);

        // System.out.println("ENROLLED IN: " + courses);
        // System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay Tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Show status
    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
        "\nGrade Level: " + year +
        "\nStudent ID: " + studentID +
        "\nCourses Enrolled: " + courses +
        "\nBalance: $" + tuitionBalance;
    }


}