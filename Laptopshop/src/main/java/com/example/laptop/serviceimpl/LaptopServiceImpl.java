package com.example.laptop.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.laptop.service.LaptopService;
import com.example.laptop.exception.LaptopNotFoundException;
import com.example.laptop.model.Laptop;
import com.example.laptop.repository.LaptopRepository;
@Service
public class LaptopServiceImpl implements LaptopService{
	@Autowired
	private LaptopRepository LaptopRepository;
	public LaptopServiceImpl(LaptopRepository LaptopRepository) {
		super();
		this.LaptopRepository = LaptopRepository;
	}



	@Override
	public Laptop addLaptop(Laptop Laptop,long placeId) {
		return LaptopRepository.save(Laptop);
	}



	/*public List<LaptopShop> getAllLaptopShop(long placeId) {
		return com.example.laptopshopmanagementsystem.repository.LaptopShopRepository.findByPlacePlaceId(placeId);
	}*/



	public Laptop getLaptopShoplById(long id) throws LaptopNotFoundException {
		
		return LaptopRepository.findById(id).orElseThrow(()->new LaptopNotFoundException("Laptop","LaptopId",id));
	}



	public Laptop updateLaptopShop1(Laptop LaptopShopName,long id) {
		Laptop existingLaptopShop=LaptopRepository.findById(id).orElseThrow(()->new LaptopNotFoundException("Laptopshop","Id",id));
	

		existingLaptopShop.setLaptopShopDetails(Laptop. getLaptopShopDetails());

		
		LaptopRepository.save(existingLaptopShop);
		return existingLaptopShop;
	}

	public void deleteLaptopShop1(long laptopshopid) {
		LaptopRepository.findById(laptopshopid).orElseThrow(()->new LaptopNotFoundException("laptopshop","Id",laptopshopid));
		LaptopRepository.deleteById(laptopshopid);
		
	}



	@Override
	public Laptop getLaptopById(long laptopShopId) {
		// TODO Auto-generated method stub
		return null;
	}


	


}
