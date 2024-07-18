package com.example.bankaccount.entity;

import java.util.Date;

public class Transaction {
    private String transactionID;
    private String accountID;
    private double amount;
    private Date transactionDate;
    private String transactionType;

    public Transaction(String transactionID, String accountID, double amount, Date transactionDate,
            String transactionType) {
        this.transactionID = transactionID;
        this.accountID = accountID;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
