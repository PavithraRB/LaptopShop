package com.example.laptop.service;
import java.util.List;

import com.example.laptop.model.Product;

public interface ProductService {
	Product addProduct(Product product,long LaptopShopId);
	Product getProductById(long id) ;
	Product updateProduct(Product product, long id);
	void deleteProduct(long id);
	
	public List<Product> getAllproduct();
	

}
