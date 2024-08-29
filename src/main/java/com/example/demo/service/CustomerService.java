package com.example.demo.service;

import com.example.demo.model.Customer;
import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);
    Customer getCustomer(int id);
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
    List<Customer> getAllCustomers();
}
