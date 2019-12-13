package com.capgemini.phonesimulator.admin;

import java.util.List;
import java.util.Scanner;

import com.capgemini.phonesimulator.contactdao.ContactDao;
import com.capgemini.phonesimulator.contactdto.Contact;
import com.capgemini.phonesimulator.controller.MainController;
import com.capgemini.phonesimulator.factory.ContactFactory;

public class ContactAdmin {
	public static void InsertContact() {
		ContactDao dao=ContactFactory.instanceOfContactDaoImpl();

		Contact user=new Contact();

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number...");
		user.setNumber(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Name...");
		user.setName(sc.nextLine());
		System.out.println("Enter Group...");
		user.setGroup(sc.nextLine());

		if(dao.insertContact(user)) {
			System.out.println("Contact inserted");
		}
		else {
			System.err.println("Something went wrong..");
		}
	}
	public static void showContact() {
		ContactDao dao=ContactFactory.instanceOfContactDaoImpl();

		//Contact user=new Contact();

		List<Contact> list=dao.showContact();

		if(list!=null) {
			for (Contact user1 : list) {
				System.out.println(user1);

			}
		}
	}
	public static void searchContact() {
		ContactDao dao=ContactFactory.instanceOfContactDaoImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name");
		String s=scanner.next();
		if(dao.searchContact(s)) {
			while(true) {
				System.out.println("Press 1 to call\nPress 2 to message\npress 3 go back to main menu");
				int option=scanner.nextInt();
				switch(option) {
				case 1: System.out.println("Calling......");
				System.out.println(("press 1 key to end the call"));
				int end=scanner.nextInt();
				if(end==1) {
					System.out.println("Your call disconnected");
				}
				else {
					System.out.println("still in progress");
				}

				break;
				case 2: System.out.println("write a message..");
				scanner.next();
				System.out.println("message sent...");
				break;
				case 3: 
					MainController.main(null);
				}
			}
		}
	}
	public static void delete() {
		ContactDao dao= ContactFactory.instanceOfContactDaoImpl();

		Contact user=new Contact();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String s=sc.next();

		if(dao.deleteContact(s)) {
			System.out.println("contact deleted...");
		}
		else {
			System.err.println("something went wrong...");

		}
	}
	public static void update() {
		ContactDao dao= ContactFactory.instanceOfContactDaoImpl();

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String s=(sc.next());
		System.out.println("Enter number");
		int a=sc.nextInt();

		if(dao.updateContact(s, a)) {
			System.out.println("email updated succesfully");
		}
		else
			System.err.println("error");
	}
}


