package com.example.demo.service.impl;

import com.example.demo.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendNotification(Customer customer) {
        System.out.println("Sending email notification to: " + customer.getEmail());
    }
}
