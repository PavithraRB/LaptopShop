package com.example.laptop.model;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="payment_table")

public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long paymentId;
	
@Column(name="room_number")
private String roomNumber;

@Column(name="room_type")
private String roomType;

@Column(name="room_price_per_night")
private int roomPrice;

@Column(name="total_price")
private  int totalPrice;

@Column(name="room_id")
private  long roomId;

@Column(name="first_name")
private String firstName;

@Column(name="last_name")
private String lastName;

@Column(name="district")
private String district;

@Column(name="state")
private String state;

@Column(name="zip_code")
private String zipCode;

@Column(name="email_id")
public String emailID;
@Column(name="check_in")
private Date checkIn;

@Column(name="check_out")
private Date checkOut;

@Column(name="name_on_card")
//@NotEmpty
//@Size(min=3 , message="name must contain atleast 3 characters")
private String nameOnCard;

@Column(name="card_number")
@Nonnull
//@Size(min=16 , max=16,message="cardNumber must contain 16 digits")
private String cardNumber;

@Column(name="exp_year")
private String expYear;

@Column(name="cvv")
@Nonnull
private int cvv;

@Column(name="hotel_name")
private String hotelName;

@Column(name="hotel_place")
private String hotelPlace;

@Column(name="paid_date")
private String paidDate;

@ManyToOne( cascade=CascadeType.MERGE)
@JoinColumn(name="customer_id")
@JsonIgnore
private Customer customer;

public String getPaidDate() {
	return paidDate;
}

public void setPaidDate(String paidDate) {
	this.paidDate = paidDate;
}

public String getHotelName() {
	return hotelName;
}

public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}

public String getHotelPlace() {
	return hotelPlace;
}

public void setHotelPlace(String hotelPlace) {
	this.hotelPlace = hotelPlace;
}

public long getRoomId() {
	return roomId;
}

public void setRoomId(long roomId) {
	this.roomId = roomId;
}

public Payment()
{
}

public long getPaymentId() {
	return paymentId;
}

public void setPaymentId(long paymentId) {
	this.paymentId = paymentId;
}

public String getRoomNumber() {
	return roomNumber;
}

public void setRoomNumber(String roomNumber) {
	this.roomNumber = roomNumber;
}

public String getRoomType() {
	return roomType;
}

public void setRoomType(String roomType) {
	this.roomType = roomType;
}

public int getRoomPrice() {
	return roomPrice;
}

public void setRoomPrice(int roomPrice) {
	this.roomPrice = roomPrice;
}

public int getTotalPrice() {
	return totalPrice;
}

public void setTotalPrice(int totalPrice) {
	this.totalPrice = totalPrice;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
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

public String getEmailID() {
	return emailID;
}

public void setEmailID(String emailID) {
	this.emailID = emailID;
}

public Date getCheckIn() {
	return checkIn;
}

public void setCheckIn(Date checkIn) {
	this.checkIn = checkIn;
}

public Date getCheckOut() {
	return checkOut;
}

public void setCheckOut(Date checkOut) {
	this.checkOut = checkOut;
}

public String getNameOnCard() {
	return nameOnCard;
}

public void setNameOnCard(String nameOnCard) {
	this.nameOnCard = nameOnCard;
}

public String getCardNumber() {
	return cardNumber;
}

public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}

public String getExpYear() {
	return expYear;
}

public void setExpYear(String expYear) {
	this.expYear = expYear;
}

public int getCvv() {
	return cvv;
}

public void setCvv(int cvv) {
	this.cvv = cvv;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

}
