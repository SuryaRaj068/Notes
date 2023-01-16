package Collection.Maps;

import java.util.Scanner;

public class Student {
    String name;
    int rollno;
    String place;
    String college;
    String branch;
    int sem;

    public Student(String name, int rollno, String place, String college, String branch, int sem) {
        this.name = name;
        this.rollno = rollno;
        this.place = place;
        this.college = college;
        this.branch = branch;
        this.sem = sem;
    }

    public void Display() {
        System.out.println("Student Name : " + this.name);
        System.out.println("Student rollno : " + this.rollno);
        System.out.println("Student place : " + this.place);
        System.out.println("Student college : " + this.college);
        System.out.println("Student branch : " + this.branch);
        System.out.println("Student sem : " + this.sem);
    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter student branch name to update");
        this.branch = sc.next();
    }
}