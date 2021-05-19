package com.mainee.customer.loader;


public class customer {
	String customerID;
	

	String CustomerName;
	String City;
	float discount;
	
	public customer(String custID, String CustName, String City,float discount) {
		this.customerID = custID;
		this.CustomerName=CustName;
		this.City=City;
		this.discount=discount;
		
	}
	
	
	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
}
