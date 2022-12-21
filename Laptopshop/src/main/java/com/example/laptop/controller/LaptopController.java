package com.example.laptop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.laptop.model.Laptop;
import com.example.laptop.service.LaptopService;

@CrossOrigin(origins="http://localhost:3306")

@RestController  
@RequestMapping("/api/LaptopShop")


public class LaptopController {
	@Autowired
	private LaptopService LaptopService;

	public LaptopController(LaptopService LaptopService) {
		super();
		this.LaptopService = LaptopService;
	}
	
//to add LaptopShop
	@PostMapping("{placeId}")
	public ResponseEntity<Laptop> addLaptopShop(@Validated @RequestBody Laptop laptopShop,@PathVariable long placeId)
{
	System.out.println("********************");
		return new ResponseEntity<Laptop>(LaptopService.addLaptop(laptopShop,placeId),HttpStatus.CREATED);
}
	//to get LaptopShop in particular place
	
	//to get LaptopShop details
	@GetMapping("LaptopShop/{id}")
	public ResponseEntity<Laptop> getLaptopShopById(@PathVariable("id") long LaptopShopid)
	{
		return new ResponseEntity<Laptop>(LaptopService.getLaptopById(LaptopShopid),HttpStatus.OK);
	}
	//update LaptopShop
	@PutMapping("{id}")
	public ResponseEntity<Laptop> updateLaptopShop(@Validated @PathVariable("id") long id, @RequestBody Laptop LaptopShop)
	{
		return new ResponseEntity<Laptop> (LaptopService.updateLaptopShop1(LaptopShop, id),HttpStatus.OK);
	}
	//delete LaptopShop
	@DeleteMapping("{id}")
	public ResponseEntity<Boolean> deleteLaptopShop(@PathVariable long id)
	{
		LaptopService.deleteLaptopShop1(id);
		boolean flag=true;
		return new ResponseEntity<Boolean>(flag,HttpStatus.OK);
	}


}
