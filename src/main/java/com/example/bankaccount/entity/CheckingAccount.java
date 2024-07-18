package com.example.bankaccount.entity;

import java.util.ArrayList;
import java.util.List;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class CheckingAccount extends Account {

    private List<Transaction> transactions;

    public CheckingAccount(String accountNumber, String accountHolderName, String accountType, double accountBalance) {
        super(accountNumber, accountHolderName, accountType, accountBalance);

        // for storing transaction details
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> geTransactions() {
        return transactions;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (getAccountBalance() >= amount) {
            setAccountBalance(getAccountBalance() - amount);
        } else {
            throw new InsufficientBalanceException("Insufficient balance, cannot process the transaction");
        }
    }

    @Override
    public void deposit(double amount) {
        setAccountBalance(getAccountBalance() + amount);
        System.out.println("Account balance is updated to: " + getAccountBalance());
    }

}