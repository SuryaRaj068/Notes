package Collection;

import java.util.Scanner;

public class Student implements StudentInteface {
    String name = "";
    int age = 0;
    String place = "";
    String college = "";
    int count = 0;
    Scanner sc = new Scanner(System.in);
    Student arrayStudent[];

    public void addStudent() {
        if (count < arrayStudent.length) {
            Student std = new Student();
            System.out.println("Enter Student name");
            std.name = sc.next();
            System.out.println("Enter Student age");
            std.age = sc.nextInt();
            System.out.println("Enter Student place");
            std.place = sc.next();
            System.out.println("Enter Student collage");
            std.college = sc.next();
            arrayStudent[count] = std;
            count++;
        } else {
            System.out.println("Student obj canot be insert into array size is full");
        }

    }

    public void displayStudent() {
        for (Student std : arrayStudent) {
            try {
                System.out.println("Student name : " + std.name);
                System.out.println("Student age : " + std.age);
                System.out.println("Student place : " + std.place);
                System.out.println("Student college : " + std.college);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}