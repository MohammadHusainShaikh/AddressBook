package com.self.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;	

public class AddressBookMain {
	Map<String,AddressBook> addressBookMap = new HashMap<>();
	Scanner scanner = new Scanner(System.in);
	public void addAddressBook() {
		System.out.println("Enter the addressBook name");
		String addressBookName = scanner.next();
		//AddressBook addressBook = new AddressBook();
		if(addressBookMap.containsKey(addressBookName)) {
			System.out.println("This AddressBook is Already Avvailable");
		}
		else {
			addressBookMap.put(addressBookName,new AddressBook()); 
			System.out.println("New Address Book Added.");
		}
	}
	
	public void displayAddressBook() {
		System.out.println(addressBookMap.keySet());
	}
	public void deleteAddressBook() {
		System.out.println("Enter the AddressBook name to delete");
		String addressBookName = scanner.next();
		if(addressBookMap.containsKey(addressBookName)) {
			addressBookMap.remove(addressBookName);
			System.out.println("AddressBook deleted");
		}else {
			System.out.println("AddressBook with given name is Not available");
		}
	}
	public void selectAddressBook() {
		displayAddressBook();
		System.out.println("Please enter the AddressBook name to select for contact:");
		String addressBookName = scanner.next();
		if(addressBookMap.containsKey(addressBookName)) {
			AddressBook addressBook = addressBookMap.get(addressBookName);
			addressBook.contactMenu();
		}else {
			System.out.println("AddressBook with given name is not available");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice=0;
		AddressBookMain addressBookMain = new AddressBookMain();
		do {
		System.out.println("***********Address Book***********");
		System.out.println("1: Add");
		System.out.println("2: Display");
		System.out.println("3: Delete");
		System.out.println("4: Select");
		System.out.println("5: Exit");
		System.out.println("Enter your choice");
		choice = addressBookMain.scanner.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("Add AddressBook");
				addressBookMain.addAddressBook();
			break;
			case 2 :
				System.out.println("Display AddressBook");
				addressBookMain.displayAddressBook();
			break;
			case 3 :
				System.out.println("Delete AddressBook");
				addressBookMain.deleteAddressBook();
			break;
			case 4 :
				System.out.println("Select AddressBook");
				addressBookMain.selectAddressBook();
			break;
			case 5:
				System.out.println("Exit");
			break;
			}
		}while(choice<=4);
	}
}

