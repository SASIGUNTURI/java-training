package examSeating;

import java.util.Scanner;

public class Student {
    private Integer rollNo;
    private String firstName;
    private String lastName;
    private String address;
    private Long phoneNo;
    private int hallTicketNumber;

    public void addStudentDetails() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the roll number : ");
        this.rollNo = Integer.parseInt(in.nextLine());
        System.out.println("Enter the first name : ");
        this.firstName = in.nextLine();
        System.out.println("Enter the last name : ");
        this.lastName = in.nextLine();
        System.out.println("Enter the Address : ");
        this.address = in.nextLine();
        System.out.println("Enter the phone number : ");
        this.phoneNo = Long.parseLong(in.nextLine());

    }
    public void display() {
        System.out.println("Student Name : " + firstName );
        System.out.println("Student Name : " + lastName);
        System.out.println("RollNo : " + rollNo);
        System.out.println("Address : " + address);
        System.out.println("Phone No: " + phoneNo);

    }

    public int getHallTicketNumber() {
        return hallTicketNumber;
    }

    public void setHallTicketNumber(int hallTicketNumber) {

        this.hallTicketNumber = hallTicketNumber;
    }

}
