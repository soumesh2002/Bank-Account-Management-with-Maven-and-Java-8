package com.example.bankaccount.service;

import java.util.List;

import com.example.bankaccount.entity.Account;
import com.example.bankaccount.entity.Customer;
import com.example.bankaccount.entity.Transaction;

public class BankServiceImpl implements BankService {

    @Override
    public void createAccount(Customer customer, Account account) {
    }

    @Override
    public Account getAccountByID(String accountID) {
    }

    @Override
    public List<Account> getAccountByCustomerID(String customerID) {
    }

    @Override
    public void performTransaction(Transaction transaction) {
    }

    @Override
    public List<Transaction> getTransactionByAccountID(String accountID) {

    }

}
