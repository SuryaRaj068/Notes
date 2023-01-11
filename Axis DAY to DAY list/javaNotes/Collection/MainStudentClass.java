package Collection;

import java.util.Scanner;

public class MainStudentClass {
    public static void main(String args[]) throws Exception {
        Student stdObj = new Student();
        System.out.println("Enter size of array");
        int n = stdObj.sc.nextInt();
        stdObj.arrayStudent = new Student[n];
        while (true) {
            System.out.println("Enter Case\n 1:addStudent\n 2:Display\n 3:exit");
            int choice = stdObj.sc.nextInt();
            switch (choice) {
                case 1:
                    stdObj.addStudent();
                    break;
                case 2:
                    stdObj.displayStudent();
                    break;
                case 3:
                    System.exit(1);
            }
        }

    }
}
