package com.example.laptop.controller;

import java.util.List;


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

import com.example.laptop.model.Product;
import com.example.laptop.service.ProductService;
@CrossOrigin(origins="http://localhost:4200")
@RestController //is controller which provides different end points to access the services 
@RequestMapping("/api/product")

public class ProductController {

	@Autowired
	private ProductService ProductService;


	public ProductController(ProductService ProductService){
		super();
		this.ProductService = ProductService;
		

	}
//to add Product to laptop
	@PostMapping("{laptopshopId}")
	public ResponseEntity<Product> addProduct(@Validated @RequestBody Product Product,@PathVariable long laptopshopid)
{
	
		return new ResponseEntity<Product>	(ProductService.addProduct(Product,laptopshopid),HttpStatus.CREATED);
	}
	
	//to get all Product
	@GetMapping   
	public List<Product> getAllProduct()
	{
		return ProductService.getAllproduct();
}
	
	//to get Product by Product id
	@GetMapping("Product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") long ProductID)
	{
		return new ResponseEntity<Product>(ProductService.getProductById(ProductID),HttpStatus.OK);
	}
	
	// to updateProduct
	@PutMapping("{id}")
	public ResponseEntity<Product> updateProduct(@Validated @PathVariable("id") long id, @RequestBody Product Product)
	{
		return new ResponseEntity<Product> (ProductService.updateProduct(Product, id),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Boolean> deleteProduct(@PathVariable("id") long id)
	{
		ProductService.deleteProduct(id);
		boolean flag=true;
		return new ResponseEntity<Boolean>(flag,HttpStatus.OK);
	}


}
