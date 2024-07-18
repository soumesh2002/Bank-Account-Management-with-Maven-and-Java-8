package com.example.bankaccount.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.bankaccount.entity.Account;
import com.example.bankaccount.entity.Customer;
import com.example.bankaccount.entity.Transaction;

public class BankServiceImpl implements BankService {
    private Map<String, Customer> customerDB = new HashMap<>();
    private Map<String, Account> accountDB = new HashMap<>();
    private Map<String, List<Transaction>> transactionDB = new HashMap<>();

    @Override
    public void createAccount(Customer customer, Account account) {
        customerDB.putIfAbsent(customer.getCustomerID(), customer);
        accountDB.put(account.getAccountNumber(), account);
        customer.addAccount(account);
    }

    @Override
    public Account getAccountByID(String accountID) {
        return accountDB.get(accountID);
    }

    @Override
    public List<Account> getAccountByCustomerID(String customerID) {
        Customer customer = customerDB.get(customerID);
        return new ArrayList<>(customer.getAccounts());
    }

    @Override
    public void performTransaction(Transaction transaction) {
        Account account = accountDB.get(transaction.getAccountID());

        if (account != null) {
            if (transaction.getTransactionType().equalsIgnoreCase("deposit")) {
                account.setAccountBalance(account.getAccountBalance() + transaction.getAmount());
            } else if (transaction.getTransactionType().equalsIgnoreCase("withdraw")) {
                account.setAccountBalance(account.getAccountBalance() - transaction.getAmount());
            }
        }
    }

    @Override
    public List<Transaction> getTransactionByAccountID(String accountID) {
        return transactionDB.get(accountID);
    }

}
