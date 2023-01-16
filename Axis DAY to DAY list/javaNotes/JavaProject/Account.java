package JavaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Account extends Bank implements AccountInterface {
    ArrayList<Transaction> transaction = new ArrayList<Transaction>();
    long account_no = 0;
    float account_balance = 0;
    String account_Type = "";

    @Override
    public Account addAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account no");
        this.account_no = sc.nextLong();
        System.out.println("Enter Account balanced");
        this.account_balance = sc.nextFloat();
        System.out.println("Enter Account type");
        this.account_Type = sc.next();
        return this;
    }

    @Override
    public void deleteAccount() {
        // TODO Auto-generated method stub

    }

    @Override
    public void searchAccount() {
        // TODO Auto-generated method stub

    }

    @Override
    public void editAccount() {
        // TODO Auto-generated method stub

    }

    public void Transaction() {
        for (Transaction obj : transaction) {
            System.out.println(obj.transactionDate);
            System.out.println(obj.transactionType);
            System.out.println(obj.transactionAmount);
            System.out.println(obj.currentBalance);
            System.out.println("--------------------");
        }
    }

}
