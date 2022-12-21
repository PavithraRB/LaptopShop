package com.example.laptop.service;

//import java.util.List;


import com.example.laptop.model.Laptop;

public interface LaptopService {
	void deleteLaptopShop1(long id);
	Laptop addLaptop(Laptop LaptopShop, long placeId);
	Laptop getLaptopById( long laptopShopId);
	Laptop updateLaptopShop1(Laptop laptopShop, long id);
	//List<LaptopShop> getAllLaptopShop(long placeId);

}
