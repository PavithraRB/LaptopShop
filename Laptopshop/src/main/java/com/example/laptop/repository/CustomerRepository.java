package com.example.laptop.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.laptop.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
		Optional<Customer> findByEmailIDAndPassword(String emailID,String password);
		Optional<Customer> findByEmailID(String emailID);
	}

