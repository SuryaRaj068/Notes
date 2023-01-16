package Collection.Maps;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {
    HashMap<Integer, Student> map = new HashMap<Integer, Student>();
    Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        MainClass accessObj = new MainClass();
        System.out.println("Student portal");
        while (true) {
            System.out
                    .println(" 1 : AddStudent\n 2 : SearchStudent\n 3 : Delete Student\n 4 : update Student details\n");
            System.out.println("choice any one of case Above\n");
            int choice = accessObj.sc.nextInt();
            switch (choice) {
                case 1:
                    accessObj.addStudent();
                    break;
                case 2:
                    accessObj.SearchStudent();
                    break;
                case 3:
                    accessObj.deleteStudent();
                    break;
                case 4:
                    accessObj.updateStudent();
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("wrong choice \n");
            }

        }
    }

    void addStudent() {
        System.out.println("Enter Student Details in order");
        System.out.println("Enter Rollno");
        int rollno = sc.nextInt();
        System.out.println("Enter student name");
        String name = sc.next();
        System.out.println("Enter student place");
        String place = sc.next();
        System.out.println("Enter student college");
        String college = sc.next();
        System.out.println("Enter student branch");
        String branch = sc.next();
        System.out.println("Enter student sem");
        int sem = sc.nextInt();
        while (this.map.containsKey(rollno)) {
            System.out.println("Roll is not unique");
            System.out.println("Enter new rollno");
            rollno = sc.nextInt();
        }
        Student std = new Student(name, rollno, place, college, branch, sem); // std2
        this.map.put(rollno, std);
    }

    void SearchStudent() {
        System.out.println("enter Student rollno to serach");
        int rollno = sc.nextInt();
        if (this.map.containsKey(rollno)) {
            this.map.get(rollno).Display();
        } else {
            System.out.println("rollno is not present");
        }
    }

    void deleteStudent() {
        System.out.println("enter Student rollno to delete");
        int rollno = sc.nextInt();
        Student std = this.map.remove(rollno);
        if (std != null) {
            System.out.println("Deleted student details");
            std.Display();
        } else {
            System.out.println("rollno not found in list");
        }
    }

    void updateStudent() {
        System.out.println("enter student rollno to update");
        int rollno = sc.nextInt();
        if (this.map.containsKey(rollno)) {
            Student std = this.map.get(rollno);
            std.update();
            this.map.replace(rollno, std);
        } else {
            System.out.println("rollno not found");
        }

    }
}
