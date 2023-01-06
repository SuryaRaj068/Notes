package Bank;

import java.util.Scanner;

public class BankBranch extends BankMain {
    String branchName;
    int branchId;
    long branchPhno;
    private int branchTotalFound;
    private float branchIntr;

    public BankBranch(String branchName, int branchId, long branchPhno, String bankName, int bankId, long bankPhno,
            int branchTotalFound, float branchIntr, int bankTotalFound, float bankIntr) {
        super(bankTotalFound, bankIntr);
        super.bankName = bankName;
        super.bankId = bankId;
        super.bankPhno = bankPhno;
        this.branchName = branchName;
        this.branchId = branchId;
        this.branchPhno = branchPhno;
        this.branchTotalFound = branchTotalFound;
        this.branchIntr = branchIntr;
    }

    public static void main(String args[]) {
        BankBranch Axis = new BankBranch("Axis", 5672, 989893483, "RBI", 345, 76787676, 1000000, 2, 10000000, 4);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the loan amount");
        //Axis.INname;
        int loan = sc.nextInt();
        Axis.checkLoan(loan, Axis.branchIntr);
    }
}
