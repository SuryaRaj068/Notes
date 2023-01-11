package Encapsulation;

import java.util.Scanner;

public class Login extends EmailUser {
    public static void main(String args[]) {
        // Login loginObj=new Login();
        // loginObj.userName;
        EmailUser userData = new EmailUser();
        Login loginObj = new Login();
        loginObj.userLogin(userData);
        System.out.println("change password");
        loginObj.changePassword(userData);

    }

    void userLogin(EmailUser userData) {
        System.out.println("enter User Name");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        System.out.println("enter user password");
        String password = sc.next();
        if (userName.equals(userData.getUserName()) && password.equals(userData.getPassword())) {
            System.out.println("User can login");
        }
        System.out.println(userData.getPassword());
    }

    void changePassword(EmailUser userData) {
        System.out.println("enter User Name");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        System.out.println("enter Old user password");
        String password = sc.next();
        if (userName.equals(userData.getUserName()) && password.equals(userData.getPassword())) {
            System.out.println("enter new user password");
            String newpassword = sc.next();
            userData.setPassword(newpassword);
            System.out.println("password is updated");
        }
    }

}