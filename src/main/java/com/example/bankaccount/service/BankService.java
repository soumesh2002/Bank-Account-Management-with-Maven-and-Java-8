package com.example.bankaccount.service;

import java.util.List;

import com.example.bankaccount.entity.Account;
import com.example.bankaccount.entity.Customer;
import com.example.bankaccount.entity.Transaction;

public interface BankService {
    void createAccount(Customer customer, Account account);

    Account getAccountByID(String accountID);

    List<Account> getAccountByCustomerID(String customerID);

    void performTransaction(Transaction transaction);

    List<Transaction> getTransactionByAccountID(String accountID);
}
