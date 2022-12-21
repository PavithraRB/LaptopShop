package com.example.laptop.repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.laptop.model.Laptop;
import com.example.laptop.model.Product;
import com.example.laptop.service.ProductService;


@Repository

public interface LaptopRepository<Laptop> extends JpaRepository<Laptop,Long>{
	public List<Laptop> findByShopName(String shopname);

	public Product save(Product room);

	public static   List<Laptop> findByPlacePlaceId(long placeId) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<ProductService> findByLaptopShopId(long laptopShopId) {
		// TODO Auto-generated method stub
		return null;

	}
}