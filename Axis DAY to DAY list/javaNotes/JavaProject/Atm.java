package JavaProject;

import java.util.Scanner;

public class Atm implements AtmInterfaces {

    @Override
    public Customer deposite(Customer customer) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your deposit amount");
        float amount = sc.nextFloat();
        customer.account.account_balance = customer.account.account_balance + amount;
        System.out.println(customer.account.account_balance);
        return customer;
    }

    @Override
    public void withdraw() {
        // TODO Auto-generated method stub

    }

    @Override
    public void checkBalance(Customer customer) {
        System.out.println(customer.account.account_balance);

    }

}
