package com.self.addressbook;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {

	ArrayList<Contact> contactList = new ArrayList<>();	
	Scanner scanner = new Scanner(System.in);

	public void addContact() {
		Contact contact = new Contact();
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
		contactList.add(contact);
	}
	
	public void displayContacts() {
		if(!contactList.isEmpty()) {
			for(int i = 0; i<contactList.size(); i++) {
				Contact contact = contactList.get(i);
				System.out.println(contact.toString());
			}
		}
	}
	
	public void editContacts() {
		if(!contactList.isEmpty()){
			String fname;
			System.out.println("Enter the First name to edit contact");
			fname = scanner.next();
			Contact contact = null;
			boolean flag = false;
			for(int i = 0; i<contactList.size(); i++) {
				contact = contactList.get(i);
				if(fname.equals(contact.getFirstName()))
				{
					flag = true;
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
				else
				{
					System.out.println("Contact not found");
				}
			}
		}
	}
	public void deleteContact() {
		if(!contactList.isEmpty()) {
			String fname;
			System.out.println("Enter the first name to delete a contact");
			fname = scanner.next();
			boolean flag = false;
			for(int i = 0; i<contactList.size(); i++) {
				
				Contact contact = contactList.get(i);
				if(fname.equals(contact.getFirstName()))
					{
						flag = true;
						contactList.remove(contact);
						System.out.println("Contact is deleted");	
					}
				else
					{
						System.out.println("Contact not found");
					}
			}		
		}
	}
		public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		int choice=0;
		do {
		System.out.println("***********Address Book***********");
		System.out.println("1: Add");
		System.out.println("2: Edit");
		System.out.println("3: Delete");
		System.out.println("4: Display");
		System.out.println("5: Exit");
		System.out.println("Enter your choice");
		choice = addressBook.scanner.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("Add Contact");
				addressBook.addContact();
			break;
			case 2 :
				System.out.println("Edit contact");
				addressBook.editContacts();
			break;
			case 3 :
				System.out.println("Delete contact");
				addressBook.deleteContact();
			break;
			case 4 :
				System.out.println("Display contact");
				addressBook.displayContacts();
			break;
			case 5:
				System.out.println("Exit");
			break;
			}
		}while(choice<=4);
	}

}
