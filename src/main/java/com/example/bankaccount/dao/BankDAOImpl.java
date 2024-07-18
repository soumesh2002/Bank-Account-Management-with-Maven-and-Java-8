package com.example.bankaccount.dao;

import java.util.HashMap;
import java.util.Map;

import com.example.bankaccount.entity.Customer;

public class BankDAOImpl implements BankDAO {
    private Map<String, Customer> customerDB = new HashMap<>();

    @Override
    public void addCustomer(Customer customer) {
        customerDB.put(customer.getCustomerID(), customer);
    }

    @Override
    public Customer getCustomerById(String customerId) {
        return customerDB.get(customerId);
    }

}
