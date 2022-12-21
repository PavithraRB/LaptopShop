package com.example.laptop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LaptopShop_table")
public class Laptop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="LaptopShop_id")
	private long laptopshopid;
	
	@Column(name="LaptopShop_name")
	private static String shopName;
		
		@Column(name="LaptopShop_place")
	private static String shopPlace;
		
		@Column(name="district")
		private String district;
		
		@Column(name="state")
		private String state;

		@Column(name="zip_code")
		private String zipCode;
		
	public long getId() {
		return laptopshopid;
	}

	public void setId(long id) {
		this.laptopshopid = id;
	}

	public static String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public static String getShopPlace() {
		return shopPlace;
	}

	public void setShopPlace(String shopPlace) {
		Laptop.shopPlace = shopPlace;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public static Object getLaptopShopDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLaptopShopDetails(Object laptopShopDetails) {
		// TODO Auto-generated method stub
		
	}


}
