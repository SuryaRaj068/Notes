package JavaProject;

import java.util.Scanner;

public class Customer implements CustomerInterface {
    public Account account;
    String name = "";
    int id = 0;
    String email = "";
    int password;
    long cardNo = 0;
    long phno = 0;
    String address = "";

    @Override
    public void addCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter customerID");
        this.id = sc.nextInt();
        System.out.println("customer name");
        this.name = sc.next();
        System.out.println("customer email");
        this.email = sc.next();
        System.out.println("customer password");
        this.password = sc.nextInt();
        System.out.println("customer cardNo");
        this.cardNo = sc.nextLong();
        System.out.println("customer phNo");
        this.phno = sc.nextLong();
        System.out.println("customer Address");
        this.address = sc.next();
        this.account = new Account().addAccount();

    }

    @Override
    public void deleteCustomer() {
        // TODO Auto-generated method stub

    }

    @Override
    public void editCustomer() {
        // TODO Auto-generated method stub

    }

}
