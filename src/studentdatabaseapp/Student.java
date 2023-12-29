package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName, lastName, courses, tuitionBalance, studentID;
    private int gradeYear;
    private static int costOfCourse = 600;
    private static int id=1000;
    //Constructor: prompt user to enter students name and year
    public Student(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter students class level: ");
        this.gradeYear = in.nextInt();
        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }

    private String setStudentID(){
        //Grade level + ID
        id++;
        return this.studentID = gradeYear + "" + id;
    }

    //Generate and ID

    //Enroll in courses

    // View balance

    //Pay Tuition

    //Show status

}
