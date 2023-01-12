package JavaProject;

import java.util.Date;

public interface TransactionInterfce {
    int transactionId = 0;
    Date transactionDate = new Date();
    String tranctionType = "";
    float transactionAmount = 0;
    float currentBalance = 0;

    void addTransaction();
}