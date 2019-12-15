package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class DeleteUser {
	public static void main(String[] args) {

		UserServices services= UserFactory.instanceOfUserServices();

		UserBean user=new UserBean();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter userId...");
		user.setUserid(sc.nextInt());
		System.out.println("Enter the password...");
		user.setPassword(sc.next());

		if(services.deleteUser(user.getUserid(), user.getPassword())) {
			System.out.println("user deleted...");
		}
		else {
			System.err.println("something went wrong...");

		}
	}
}
