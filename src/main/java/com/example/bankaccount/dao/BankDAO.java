package com.example.bankaccount.dao;

import com.example.bankaccount.entity.Customer;

public interface BankDAO {
    void addCustomer(Customer customer);

    Customer getCustomerById(String customerId);
}
