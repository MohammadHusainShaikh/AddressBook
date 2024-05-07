package com.self.addressbook;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNo;
	private String emailId;
	
	public void setFirstName(String firstName ) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName ) {
		this.lastName = lastName;
	}
	public void setAddress(String address ) {
		this.address = address;
	}
	public void setCity(String city ) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(String zip ) {
		this.zip = zip;
	}
	public void setPhoneNo(String phoneNo ) {
		this.phoneNo = phoneNo;
	}
	public void setEmailId(String emailId ) {
		this.emailId = emailId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	
	  public String toString() {
	        return "Contact{" +
	                "firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                ", address='" + address + '\'' +
	                ", city='" + city + '\'' +
	                ", state='" + state + '\'' +
	                ", zip='" + zip + '\'' +
	                ", phoneNo='" + phoneNo + '\'' +
	                ", email='" + emailId + '\'' +
	                '}';
	  }              
 }
