package com.example.laptop.model;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_table")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")    
	private long customerid;

	@Column (name= "customer_first name")
	//@NotEmpty
	//@Size(min=3 , message="firstName must contain atleast 3 characters")
		private String firstname;

	@Column (name= "customer_last name")
	//@NotEmpty
	//@Size(min=1 , message="lastName must contain atleast 1 characters")
		private String lastname;

	@Column(name="date_of_birth")
	private Date DateOfBirth;

	@Column(name = "customer_password")
	//@NotEmpty
	//@Size(min=8, message="Password length must be 8 and contain uppercase,lowercase,digits")
	//@Pattern(regexp="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}")
	public String password; 

	@Column(name = "customer_emailid")

	//@NotEmpty
	//@Email(message="Email  is not valid!")
	public String emailID;

	@Column(name = "phone number")
	//@NotEmpty
	//@Size(min=10 ,max=10, message="phoneNumber must contain  10 digits")
	private String phonenumber;

	@Column(name="gender")
	//@NotEmpty
	//@Size(min=4 , message="gender must contain atleast 4 characters")
	public String gender;

	@Column(name="district")
	private String district;


	@Column(name="state")
	private String state;

	@Column(name="zip_code")
	//@NotEmpty
	//@Size(min=6 ,max=6, message="zipCode must contain 6 digits")
	private String zipCode;

		public long getId() {
			return customerid;
		}
		public void setId(long id) {
			this.customerid = id;
		}
		public String getfirstname() {
			return firstname;
		}
		public void setfirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLname(String lastname) {
			this.lastname = lastname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmailID() {
			return emailID;
		}
		public void setEmailID(String emailID) {
			this.emailID = emailID;
		}
		
		public Date getDateOfBirth() {
			return DateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			DateOfBirth = dateOfBirth;
		}
		public String getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}
		
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
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

}
