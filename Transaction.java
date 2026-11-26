package bank;

import java.time.LocalDateTime;

public class Transaction {

    private String transactionType;
    private double amount;
    private LocalDateTime date;

  
    public Transaction(String transactionType, double amount) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.date = LocalDateTime.now();
    }
    
    public void displayTransaction() {

        System.out.println("Transaction Type : " + transactionType);
        System.out.println("Amount          : Rs. " + amount);
        System.out.println("Date & Time    : " + date);
    }
}
