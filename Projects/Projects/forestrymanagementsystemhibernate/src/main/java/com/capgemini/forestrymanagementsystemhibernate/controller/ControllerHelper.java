package com.capgemini.forestrymanagementsystemhibernate.controller;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.capgemini.forestrymanagementsystemhibernate.dto.ContractBean;
import com.capgemini.forestrymanagementsystemhibernate.dto.CustomerBean;
import com.capgemini.forestrymanagementsystemhibernate.dto.HaulierBean;
import com.capgemini.forestrymanagementsystemhibernate.dto.OrdersBean;
import com.capgemini.forestrymanagementsystemhibernate.dto.ProductBean;
import com.capgemini.forestrymanagementsystemhibernate.exception.ProductException;
import com.capgemini.forestrymanagementsystemhibernate.factory.FmsFactory;
import com.capgemini.forestrymanagementsystemhibernate.service.ContractService;
import com.capgemini.forestrymanagementsystemhibernate.service.CustomerService;
import com.capgemini.forestrymanagementsystemhibernate.service.HaulierService;
import com.capgemini.forestrymanagementsystemhibernate.service.OrdersService;
import com.capgemini.forestrymanagementsystemhibernate.service.ProductService;

@SuppressWarnings("resource")
public class ControllerHelper {

	static CustomerService customerService = FmsFactory.instanceOfCustomerServiceImpl();
	static HaulierService haulierService = FmsFactory.instanceOfHaulierServiceImpl();
	static ProductService productService = FmsFactory.instanceOfProductServiceImpl();
	static OrdersService orderService = FmsFactory.instanceOfOrdersServiceImpl();
	static ContractService contractService = FmsFactory.instanceOfContractServiceImpl();

	public static void addCustomer() {

		CustomerBean bean = new CustomerBean();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer ID...");
		bean.setCustid(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Customer Name...");
		bean.setCname(sc.nextLine());
		System.out.println("Enter Mobile No...");
		bean.setTelno(sc.nextLine());
		System.out.println("Enter Town...");
		bean.setTown(sc.nextLine());
		System.out.println("Enter Postcode...");
		bean.setPostcode(sc.nextLine());
		System.out.println("Enter Email...");
		bean.setEmail(sc.next());
		System.out.println("Enter the password");
		bean.setPassword(sc.next());

		if (customerService.addCustomer(bean)) {
			System.out.println("Customer Added");
		} else {
			System.err.println("Something went wrong..");
		}

	}

	public static void regRequest() {

		CustomerBean bean = new CustomerBean();

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		bean.setCustid(20000 + random.nextInt(999));
		System.out.println("Enter Your Name...");
		bean.setCname(sc.nextLine());
		System.out.println("Enter Mobile No...");
		bean.setTelno(sc.nextLine());
		System.out.println("Enter Town...");
		bean.setTown(sc.nextLine());
		System.out.println("Enter Postcode...");
		bean.setPostcode(sc.nextLine());
		System.out.println("Enter Email...");
		bean.setEmail(sc.next());
		int count = 0;
		while (count == 0) {
			System.out.println("create password");
			String password = sc.next();
			System.out.println("re-type your password to confirm");
			String reType = sc.next();
			if (password.equals(reType)) {
				bean.setPassword(password);
				count++;
			} else {
				System.out.println("password didn't matched.. try again");
			}
		}

		if (customerService.addCustomer(bean)) {
			System.out.println("Request has been sent to the admin");
			System.out.println("You have been registered");
			System.out.println("Your Customer ID is " + bean.getCustid());
			System.out.println();
		} else {
			System.err.println("Something went wrong..");
		}

	}

	public static void getAllCustomer() {
		List<CustomerBean> list = customerService.getAllCustomer();
		if (list != null) {
			for (CustomerBean customerBean : list) {
				System.out.println(customerBean);
			}
		}
	}

	public static void searchCustomer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer ID");
		int custid = sc.nextInt();
		if (customerService.searchCustomer(custid)) {
			System.out.println("This customer exist in the database");
		} else {
			System.err.println("No customer found");
		}
	}

	public static void deleteCustomer() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer ID");
		int custid = sc.nextInt();

		if (customerService.deleteCustomer(custid)) {
			System.out.println("Customer deleted...");
		} else {
			System.err.println("something went wrong...");

		}
	}

	public static void updateMobile() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer ID");
		int custid = (sc.nextInt());
		System.out.println("Enter new number");
		String num = sc.next();

		if (customerService.modifyMobile(custid, num)) {
			System.out.println("Mobile number updated succesfully");
		} else
			System.err.println("Something went wrong please try again");
	}

	public static void addHaulier() {

		HaulierBean bean = new HaulierBean();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Haulier ID...");
		bean.setHaulid(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Mobile number...");
		bean.setHtelno(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter name..");
		bean.setHname(sc.nextLine());
		System.out.println("Enter Town...");
		bean.setHtown(sc.nextLine());
		System.out.println("Enter Postcode...");
		bean.setHpostcode(sc.nextLine());
		System.out.println("Enter Email...");
		bean.setHemail(sc.nextLine());

		if (haulierService.addHaulier(bean)) {
			System.out.println("Haulier Added");
		} else {
			System.err.println("Something went wrong..");
		}
	}

	public static void getAllHaulier() {
		List<HaulierBean> list = haulierService.getAllHauliers();

		if (list != null) {
			for (HaulierBean bean : list) {
				System.out.println(bean);
			}
		}
	}

	public static void searchHaulier() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer ID");
		int haulierid = sc.nextInt();
		if (haulierService.searchHaulier(haulierid)) {
			System.out.println("This haulier exist in the database");
		} else {
			System.err.println("No haulier found");
		}
	}

	public static void deleteHaulier() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Haulier ID");
		int haulierid = sc.nextInt();

		if (haulierService.deleteHaulier(haulierid)) {
			System.out.println("Haulier deleted...");
		} else {
			System.err.println("something went wrong...");

		}
	}

	public static void addProduct() {
		ProductBean bean = new ProductBean();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product ID");
		int prodid = sc.nextInt();
		bean.setProdid(prodid);
		System.out.println("Enter Product Name");
		bean.setPname(sc.next());
		System.out.println("Enter Product's Cost");
		bean.setPcost(sc.nextDouble());

		if (productService.addProduct(bean)) {
			System.out.println("Product added successfully");
		} else {
			System.out.println("not added");
		}

	}

	public static void viewAllProducts() {
		List<ProductBean> list = productService.getAllProduct();

		if (list != null) {
			for (ProductBean bean : list) {
				System.out.println(bean);
			}
		} else {
			System.out.println("no product found");
		}
	}

	public static void searchProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product ID");
		int productid = sc.nextInt();

		List<ProductBean> list = productService.searchProduct(productid);
		if (list.isEmpty()) {
			throw new ProductException("Product not found");

		} else {
			for (ProductBean productBean : list) {
				System.out.println("Product found");
				System.out.println(productBean);
			}
		}
	}

	public static void searchProd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product name");
		String pname = sc.next();

		List<ProductBean> list = productService.searchProduct(pname);
		if (list.isEmpty()) {
			System.out.println("no product found");

		} else {
			for (ProductBean productBean : list) {
				System.out.println("Product found");
				System.out.println(productBean);
			}
		}
	}

	public static void deleteProduct() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product ID");
		int productid = sc.nextInt();

		if (productService.deleteProduct(productid)) {
			System.out.println("product deleted...");
		} else {
			System.err.println("something went wrong...");

		}
	}

	public static void addOrders() {
		Scanner sc = new Scanner(System.in);
		OrdersBean bean = new OrdersBean();
		System.out.println("Enter the Product name");
		bean.setPname(sc.next());
		System.out.println("Enter the quatity in kg");
		bean.setQuantity(sc.nextInt());

		if (orderService.addOrder(bean)) {
			System.out.println("order sent successfully");
		} else {
			System.out.println("product is out of stock");
		}
	}

	public static void viewOrders() {
		List<OrdersBean> list = orderService.getAllOrders();

		if (list != null) {
			for (OrdersBean bean : list) {
				System.out.println(bean);
			}
		} else {
			System.out.println("no orders found");
		}
	}

	public static void addContract() {
		Scanner sc = new Scanner(System.in);
		ContractBean bean = new ContractBean();
		System.out.println("Enter contractNo");
		bean.setContractNo(sc.nextInt());
		System.out.println("Enter Customer Id");
		bean.setCustId(sc.nextInt());
		System.out.println("Enter Haulier Id");
		bean.setHaulId(sc.nextInt());
		System.out.println("Enter Product Id");
		bean.setProdId(sc.nextInt());
		System.out.println("Enter Quantity in kg");
		bean.setQuantity(sc.nextInt());
		System.out.println("Enter Delivery Date");
		bean.setDeliveryDate(sc.next());

		if (contractService.addContract(bean)) {
			System.out.println("Contract has been added successfully");
		} else {
			System.out.println("something went wrong");
		}
	}

	public static void viewContract() {
		List<ContractBean> list = contractService.getAllContracts();

		if (list != null) {
			for (ContractBean bean : list) {
				System.out.println(bean);
			}
		} else {
			System.out.println("No contract found");
		}
	}
}