package JavaProject;

import java.util.Scanner;

public class MainFile {
    Bank BankObj = new Bank();

    public static void main(String args[]) {
        MainFile mainFile = new MainFile();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "1:ADD customer\n 2:deposit\n 3 : checkBalance\n 4: withdraw\n 5 : Transaction histry\n 6 :exit");
            int choice = sc.nextInt();
            long account_no;
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

                    } else {
                        System.out.println("Accout No not valid");
                    }
                    break;
                case 3:
                    System.out.println("enter account no");
                    long accountNo1 = sc.nextLong();
                    if (mainFile.BankObj.map.containsKey(accountNo1)) {
                        Atm atmobj = new Atm();
                        mainFile.BankObj.map.replace(accountNo1,
                                atmobj.checkBalance(mainFile.BankObj.map.get(accountNo1)));

                    }
                    break;
                case 4:
                    System.out.println("enter account no");
                    account_no = sc.nextLong();
                    if (mainFile.BankObj.map.containsKey(account_no)) {
                        Atm atmobj = new Atm();
                        mainFile.BankObj.map.replace(account_no,
                                atmobj.withdraw(mainFile.BankObj.map.get(account_no)));

                    }
                    break;
                case 5:
                    System.out.println("enter account no");
                    account_no = sc.nextLong();
                    if (mainFile.BankObj.map.containsKey(account_no)) {
                        mainFile.BankObj.map.get(account_no).account.Transaction();
                    }
                    break;
                case 6:
                    System.exit(1);
                default:
                    System.out.println("wrong choice");

            }
        }

    }

}
