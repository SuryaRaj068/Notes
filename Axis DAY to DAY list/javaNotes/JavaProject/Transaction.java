package JavaProject;

import java.util.Date;

import Axis.InterfaceDemo;

public class Transaction implements TransactionInterfce {
    int transactionId = 0;
    Date transactionDate;
    String transactionType;
    float transactionAmount;
    float currentBalance;

    @Override
    public void addTransaction(String transactionType, float transactionAmount, float currentBalance) {
        this.transactionDate = new Date();
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.currentBalance = currentBalance;
    }

}
