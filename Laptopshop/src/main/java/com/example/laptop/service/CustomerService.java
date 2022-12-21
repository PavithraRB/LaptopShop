package com.example.laptop.service;
import java.util.List;

import com.example.laptop.model.Customer;

public interface CustomerService {
	Customer saveCustomer(Customer customer);
	Customer loginCustomer(Customer customer);
	Customer updateCustomer(Customer customer,long id);
	Customer getCustomerById(long id);
	List<Customer> getAllCustomers();
	Customer getCustomerByEmail(Customer customer);
	void deleteCustomer(long id);

}
