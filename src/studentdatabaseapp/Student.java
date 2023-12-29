package studentdatabaseapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Student {
    private String firstName, lastName, studentID;
    HashSet<String> coursesSet = new HashSet<>();
    private int gradeYear, tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id=1000;
    //Constructor: prompt user to enter students name and year
    public Student(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter students class level: ");
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
            if(!course.equals("") && coursesSet.add(course)){
                System.out.println(course + " Added");
            }else{
                System.out.println(course + " already added");
            }
            tuitionBalance = tuitionBalance + costOfCourse;
        }  else break;

        }while(true);


        System.out.println("Enrolled in: " + coursesSet);
        System.out.println("Tuition balance: " + tuitionBalance);
    }

    // View balance
    public void viewBalance(){
        System.out.println("Your current balance is: $"+ tuitionBalance);
    }

    //Pay Tuition
    public void payTuition(){
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //Show status

}
