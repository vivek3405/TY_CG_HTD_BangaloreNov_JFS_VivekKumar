package com.capgemini.phonesimulator.controller;

import java.util.Scanner;

import com.capgemini.phonesimulator.admin.ContactAdmin;

public class MainController {
	public static void main(String[] args) {
		while(true) {
			Scanner sc=new Scanner(System.in);

			System.out.println("Press 1 to show all contacts\nPress 2 to search all contact\nPress 3 to operate");
			int op=sc.nextInt();
			switch(op) {
			case 1:ContactAdmin.showContact();
			break;
			case 2:ContactAdmin.searchContact();
			break;
			case 3:System.out.println("Press 1 to add contact\nPress 2 to delete contact\nPress 3 to update number");
			int option=sc.nextInt();
			switch(option) {
			case 1:ContactAdmin.InsertContact();
			break;
			case 2:ContactAdmin.delete();
			break;
			case 3:ContactAdmin.update();
			break;
			}
			break;
			}
		}
	}


}
