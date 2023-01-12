package JavaProject;

import java.util.Scanner;

public class MainFile {
    Bank BankObj = new Bank();

    public static void main(String args[]) {
        MainFile mainFile = new MainFile();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1:ADD customer");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Customer customer = new Customer();
                    customer.addCustomer();
                    mainFile.BankObj.map.put(customer.account.account_no, customer);
                    break;
                case 2:
                    System.out.println("enter account no");
                    long accountNo = sc.nextLong();
                    if (mainFile.BankObj.map.containsKey(accountNo)) {
                        Atm atmobj = new Atm();
                        mainFile.BankObj.map.put(accountNo, atmobj.deposite(mainFile.BankObj.map.get(accountNo)));

                    }
                    break;
                case 3:
                    System.out.println("enter account no");
                    long accountNo1 = sc.nextLong();
                    if (mainFile.BankObj.map.containsKey(accountNo1)) {
                        Atm atmobj = new Atm();
                        atmobj.checkBalance(mainFile.BankObj.map.get(accountNo1));

                    }
            }
        }

    }

}
