package com.capgemini.fmsapp.controlleradmin;

import java.util.Scanner;

public class MainController {
	public static void main(String[] args) {
		System.out.println("========Forestry Management System=========");
		System.out.println();
		while(true) {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("******************************");
				System.out.println("Enter 1 for Customer Services");
				System.out.println("Enter 2 for Contractor Services");
				System.out.println("Enter 3 for Products");
				System.out.println("******************************");

				int s=sc.nextInt();

				switch(s) {
				case 1: AdminController.adminControlCustomer();
				break;
				case 2: AdminController.adinControlContractor();
				break;
				case 3: AdminController.adminControlProduct();
				break;
				default: 
					System.out.println("value not found.. please try again");
				}
				sc.close();
			}catch(RuntimeException e) {
				System.err.println("You can not Enter a value which is not in numeric format");
			}
		}
	}

}
