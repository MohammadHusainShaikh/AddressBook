package com.self.addressbook;

import java.util.Scanner;
public class AddressBook {
	
	Scanner scanner = new Scanner(System.in);
	Contact contact = new Contact();
	
	public void addContact() {
	System.out.println("Enter the first name");
	contact.setFirstName(scanner.next());
	System.out.println("Enter the last name");
	contact.setLastName(scanner.next());
	System.out.println("Enter the address");
	contact.setAddress(scanner.next());
	System.out.println("Enter the city name");
	contact.setCity(scanner.next());
	System.out.println("Enter the state name");
	contact.setState(scanner.next());
	System.out.println("Enter the zip code");
	contact.setZip(scanner.next());
	System.out.println("Enter the Phone number");
	contact.setPhoneNo(scanner.next());
	System.out.println("Enter the email id");
	contact.setEmailId(scanner.next());
	}
	
	public void displayContacts() {
	        System.out.println(contact.getFirstName());
	        System.out.println(contact.getLastName());
	        System.out.println(contact.getAddress());
	        System.out.println(contact.getCity());
	        System.out.println(contact.getState());
	        System.out.println(contact.getZip());
	        System.out.println(contact.getPhoneNo());
	        System.out.println(contact.getEmailId());
	    
	}
	
	public void editContact() {
		
		String fname;
		System.out.println("Enter the First name to edit contact");
		fname = scanner.next();
		
		if(fname.equals(contact.getFirstName()))
		{
			
			System.out.println("Contact list found");
			System.out.println("Enter the last name");
			contact.setLastName(scanner.next());
			System.out.println("Enter the address");
			contact.setAddress(scanner.next());
			System.out.println("Enter the city name");
			contact.setCity(scanner.next());
			System.out.println("Enter the state name");
			contact.setState(scanner.next());
			System.out.println("Enter the zip code");
			contact.setZip(scanner.next());
			System.out.println("Enter the Phone number");
			contact.setPhoneNo(scanner.next());
			System.out.println("Enter the email id");
			contact.setEmailId(scanner.next());
		}
			else {
			System.out.println("Contact list not found");
		}
	}
	
	public void deleteContact() {
		
		String fname;
		System.out.println("Enter the first name to delete a contact");
		fname = scanner.next();
		if(fname.equals(contact.getFirstName()))
			{
				System.out.println("Contact Deleted");
				contact.setFirstName(null);
				contact.setLastName(null);
				contact.setAddress(null);
				contact.setCity(null);
				contact.setState(null);
				contact.setZip(null);
				contact.setPhoneNo(null);
				contact.setEmailId(null);
			}else
				{
				System.out.print("name not found");
				}
	}
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		addressBook.addContact();
		addressBook.displayContacts();
		//addressBook.editContact();
		//addressBook.displayContacts();
		addressBook.deleteContact();
		addressBook.displayContacts();
	}

}
