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
        Transaction transaction = new Transaction();
        transaction.addTransaction("deposite", amount, customer.account.account_balance);
        customer.account.transaction.add(transaction);
        return customer;
    }

    @Override
    public Customer withdraw(Customer customer) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your cardNo");
        long cardNo = sc.nextLong();
        System.out.println("Enter your pin");
        long pin = sc.nextLong();
        if (cardNo == customer.cardNo && pin == customer.password) {
            System.out.println("enter your withdraw amount");
            float amount = sc.nextFloat();
            if (amount < customer.account.account_balance && (customer.account.account_balance - amount) > 10000) {
                System.out.println("collect you amout");
                customer.account.account_balance = customer.account.account_balance - amount;
                System.out.println("current balance : " + customer.account.account_balance);
                Transaction transaction = new Transaction();
                transaction.addTransaction("withdraw", amount, customer.account.account_balance);
                customer.account.transaction.add(transaction);
                return customer;
            } else {
                System.out.println("don't have enough balance to withdraw");
            }

        } else {
            System.out.println("wrong credential");
        }
        return customer;

    }

    @Override
    public Customer checkBalance(Customer customer) {
        System.out.println("Your current balance : " + customer.account.account_balance);
        Transaction transaction = new Transaction();
        transaction.addTransaction("checkBalance", 0, customer.account.account_balance);
        customer.account.transaction.add(transaction);
        return customer;
    }

}
