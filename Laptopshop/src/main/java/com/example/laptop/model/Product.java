package com.example.laptop.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table(name="product_table")


public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")    
	private long id;
	
	@Column (name= "product_name")
	private String productname;

@Column (name= "product_price")
private String productprice;

public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	public static void setLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		
	}

}
