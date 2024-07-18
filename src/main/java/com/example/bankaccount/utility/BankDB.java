package com.example.bankaccount.utility;

import java.util.HashMap;
import java.util.Map;

import com.example.bankaccount.entity.Account;
import com.example.bankaccount.entity.Customer;

public class BankDB {
    private Map<String, Customer> customerDB = new HashMap<>();
    private Map<String, Account> accountDB = new HashMap<>();

    public void addCustomer(Customer customer) {
        customerDB.putIfAbsent(customer.getCustomerID(), customer);
    }

    public void addAccount(String customerID, Account account) {
        Customer customer = customerDB.get(customerID);

        if (customer != null) {
            customer.addAccount(account);
            accountDB.put(account.getAccountNumber(), account);
        }
    }

    public Customer getCustomerByID(String customerID) {
        return customerDB.get(customerID);
    }

    public Account getAccountByID(String accountID) {
        return accountDB.get(accountID);
    }
}
