package com.example.bankaccount.entity;

public abstract class Account {

    private String accountNumber;
    private String accountHolderName;
    private String accountType;
    private double accountBalance;

    public Account(String accountNumber, String accountHolderName, String accountType, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public abstract void withdraw(double amount) throws InsufficientBalanceException;

    public abstract void deposit(double amount);

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", accountType="
                + accountType + ", accountBalance=" + accountBalance + "]";
    }
}
