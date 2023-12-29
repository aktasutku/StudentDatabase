package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName, lastName, courses=null, studentID;
    private int gradeYear, tuitionBalance = 0;
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
    //Generate and ID
    private String setStudentID(){
        //Grade level + ID
        id++;
        return this.studentID = gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll(){
        //Get inside a loop,user hits 0
        do{
        System.out.print("Enter course to enroll(Q to quit): ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();

        if(!course.equals("Q")){
            courses = courses +"\n" + course;
            tuitionBalance = tuitionBalance + costOfCourse;
        }  else break;

        }while(true);


        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition balance: " + tuitionBalance);
    }

    // View balance

    //Pay Tuition

    //Show status

}
