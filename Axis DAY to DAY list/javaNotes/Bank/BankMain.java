package Bank;

public class BankMain extends InternationalBank {
    String bankName;
    int bankId;
    long bankPhno;
    private int bankTotalFound;
    private float bankInt;

    public BankMain(int bankTotalFound, float bankInt) {
        this.bankTotalFound = bankTotalFound;
        this.bankInt = bankInt;
    }

    public void checkLoan(int loanAmount, float branchIntr) {
        if (loanAmount < bankTotalFound) {
            System.out.println("loan can be approve");
            totalIntr(branchIntr);
            // this.INname;
        }
    }

    void totalIntr(float branchIntr) {
        System.err.println("Your total intr will be : " + (branchIntr + this.bankInt + this.interest()));
        // System.err.println("total amount you need to pay :");
    }

}
// GST
// statetax+CGTax
