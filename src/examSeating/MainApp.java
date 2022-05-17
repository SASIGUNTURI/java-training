package examSeating;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Exam Seating Arrangement System ");
        System.out.println("the student details");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numOfStudents = in.nextInt();
        Student[] arr = new Student[numOfStudents];
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter the student "+ (i+1) +" details");
            arr[i] = getStudentDetails();
        }



        System.out.println("Enter the getStudent value : ");
        int getStudent = in.nextInt();
        int count = 0;
        for (Student student : arr) {
            if (student.getHallTicketNumber() == getStudent){
                student.display();
                count++;
            }
        }


        for (Student student : arr) {
            if (count == 0){
                student.display();
            }
        }
    }
    private static int getRandomNumber() {
        int min = 202200;
        int max = 202500;
        return ( (int) (Math.random() * (max - min + 1) + min));
    }
    private static Student getStudentDetails() {
        Student student = new Student();
        student.addStudentDetails();
        int hallTicketNumber = getRandomNumber();
        student.setHallTicketNumber(hallTicketNumber);
        System.out.println("hall ticket no:"+hallTicketNumber);
        return student;
    }
}
