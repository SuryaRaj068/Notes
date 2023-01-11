package Collection.ExceptionHandle;

import java.util.Scanner;

public class ThrowExceptionDemo {
    void checkAge(int age) throws AgeNotValid, ArithmeticException {
        if (age < 18) {

            throw new AgeNotValid("he's not eligible for work");
            // System.out.println("he's not eligible for work");
        } else {
            throw new ArithmeticException();
            // System.out.println("Your eligible for work");
        }
    }

    public static void main(String args[]) throws AgeNotValid {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        ThrowExceptionDemo obj = new ThrowExceptionDemo();
        obj.checkAge(age);
        // try {
        // obj.checkAge(age);
        // } catch (AgeNotValid e) {
        // System.out.println(e.getMessage());
        // }
    }
}
