package com.example.demo;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Create and add a customer
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("John Doe");
		customer.setEmail("john.doe@example.com");
		customer.setContactNumber("1234567890");

		customerService.addCustomer(customer);

		// Retrieve and update a customer
		Customer retrievedCustomer = customerService.getCustomer(1);
		if (retrievedCustomer != null) {
			retrievedCustomer.setName("John Doe Jr.");
			customerService.updateCustomer(retrievedCustomer);
		}

		// Delete a customer
		customerService.deleteCustomer(1);
	}
}
