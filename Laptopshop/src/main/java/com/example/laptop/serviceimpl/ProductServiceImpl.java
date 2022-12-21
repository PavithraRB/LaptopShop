package com.example.laptop.serviceimpl;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.laptop.model.Laptop;
import com.example.laptop.model.Product;
import com.example.laptop.repository.LaptopRepository;
import com.example.laptop.repository.ProductRepository;
import com.example.laptop.service.LaptopService;
import com.example.laptop.service.ProductService;

@Service
public class ProductServiceImpl <Room> implements ProductService {
	@Autowired
	private LaptopRepository laptopRepository;
	@Autowired
	private LaptopService laptopService;
	@Autowired
	private ProductRepository productRepository;
	

	


	public ProductServiceImpl(LaptopRepository laptopRepository, LaptopService laptopService,
			ProductRepository productRepository) {
		super();
		this.laptopRepository = laptopRepository;
		this.laptopService = laptopService;
		this.productRepository = productRepository;
	}

	public Product addProduct(Product product, long laptopShopId) {
		Laptop laptop =laptopService.getLaptopById(laptopShopId);
		product.setLaptop(laptop);
		return ProductRepository.save(product);
	}

	@Override
	public List<Product> getAllproduct() {

    return productRepository.findAll();

	}

	/*public LaptopShop getById(long Product) {

		return laptopshopRepository.findById(Product).orElseThrow();
	}*/

	public Product updateProduct(Product product, long productid) {
		
		Laptop existingProduct=laptopRepository.findById(productid).orElseThrow();
			
		laptopRepository.save(existingProduct);
		return product;
	}


	@Override
	public void deleteProduct(long id) {
	
		laptopRepository.findById(id).orElseThrow();
		laptopRepository.deleteById(id);
		
	}

	@Override
	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Product","productId",id));
	}
	


}
