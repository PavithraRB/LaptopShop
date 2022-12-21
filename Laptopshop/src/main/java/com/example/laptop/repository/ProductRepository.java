package com.example.laptop.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.laptop.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	//public List<Product> findByIdAndName(long Product,String productname);
}
