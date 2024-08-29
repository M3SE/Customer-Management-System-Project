package com.example.demo.service.impl;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private List<Customer> customerList = new ArrayList<>();

    @Autowired
    private NotificationService notificationService;

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
        System.out.println("Customer added: " + customer.getName());
        notificationService.sendNotification(customer);
    }

    @Override
    public Customer getCustomer(int id) {
        return customerList.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void updateCustomer(Customer customer) {
        Customer existingCustomer = getCustomer(customer.getId());
        if (existingCustomer != null) {
            existingCustomer.setName(customer.getName());
            existingCustomer.setEmail(customer.getEmail());
            existingCustomer.setContactNumber(customer.getContactNumber());
            System.out.println("Customer updated: " + customer.getName());
        }
    }

    @Override
    public void deleteCustomer(int id) {
        customerList.removeIf(c -> c.getId() == id);
        System.out.println("Customer deleted with id: " + id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerList;
    }
}
