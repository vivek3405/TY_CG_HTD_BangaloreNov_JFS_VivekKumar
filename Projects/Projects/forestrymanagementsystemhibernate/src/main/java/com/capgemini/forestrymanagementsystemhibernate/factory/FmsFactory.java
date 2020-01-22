package com.capgemini.forestrymanagementsystemhibernate.factory;

import com.capgemini.forestrymanagementsystemhibernate.dao.ContractDao;
import com.capgemini.forestrymanagementsystemhibernate.dao.ContractDaoImpl;
import com.capgemini.forestrymanagementsystemhibernate.dao.CustomerDao;
import com.capgemini.forestrymanagementsystemhibernate.dao.CustomerDaoImpl;
import com.capgemini.forestrymanagementsystemhibernate.dao.HaulierDao;
import com.capgemini.forestrymanagementsystemhibernate.dao.HaulierDaoImpl;
import com.capgemini.forestrymanagementsystemhibernate.dao.LoginDao;
import com.capgemini.forestrymanagementsystemhibernate.dao.LoginDaoImpl;
import com.capgemini.forestrymanagementsystemhibernate.dao.OrdersDao;
import com.capgemini.forestrymanagementsystemhibernate.dao.OrdersDaoImpl;
import com.capgemini.forestrymanagementsystemhibernate.dao.ProductDao;
import com.capgemini.forestrymanagementsystemhibernate.dao.ProductDaoImpl;
import com.capgemini.forestrymanagementsystemhibernate.service.ContractService;
import com.capgemini.forestrymanagementsystemhibernate.service.ContractServiceImpl;
import com.capgemini.forestrymanagementsystemhibernate.service.CustomerService;
import com.capgemini.forestrymanagementsystemhibernate.service.CustomerServiceImpl;
import com.capgemini.forestrymanagementsystemhibernate.service.HaulierService;
import com.capgemini.forestrymanagementsystemhibernate.service.HaulierServiceImpl;
import com.capgemini.forestrymanagementsystemhibernate.service.LoginService;
import com.capgemini.forestrymanagementsystemhibernate.service.LoginServiceImpl;
import com.capgemini.forestrymanagementsystemhibernate.service.OrdersService;
import com.capgemini.forestrymanagementsystemhibernate.service.OrdersServiceImpl;
import com.capgemini.forestrymanagementsystemhibernate.service.ProductService;
import com.capgemini.forestrymanagementsystemhibernate.service.ProductServiceImpl;

public class FmsFactory {

	public static CustomerDao instanceOfCustomerDaoImpl() {
		CustomerDao dao = new CustomerDaoImpl();
		return dao;
	}

	public static CustomerService instanceOfCustomerServiceImpl() {
		CustomerService service = new CustomerServiceImpl();
		return service;
	}

	public static ContractDao instanceOfContractDaoImpl() {
		ContractDao dao = new ContractDaoImpl();
		return dao;
	}

	public static ContractService instanceOfContractServiceImpl() {
		ContractService service = new ContractServiceImpl();
		return service;
	}

	public static ProductDao instanceOfProductDaoImpl() {
		ProductDao dao = new ProductDaoImpl();
		return dao;
	}

	public static ProductService instanceOfProductServiceImpl() {
		ProductService service = new ProductServiceImpl();
		return service;
	}

	public static LoginDao instanceOfLoginDaoImpl() {
		LoginDao dao = new LoginDaoImpl();
		return dao;
	}

	public static LoginService instanceOfLoginServiceImpl() {
		LoginService service = new LoginServiceImpl();
		return service;
	}

	public static HaulierDao instanceOfHaulierDaoImpl() {
		HaulierDao dao = new HaulierDaoImpl();
		return dao;
	}

	public static HaulierService instanceOfHaulierServiceImpl() {
		HaulierService service = new HaulierServiceImpl();
		return service;
	}

	public static OrdersDao instanceOfOrdersDaoImpl() {
		OrdersDao dao = new OrdersDaoImpl();
		return dao;
	}

	public static OrdersService instanceOfOrdersServiceImpl() {
		OrdersService service = new OrdersServiceImpl();
		return service;
	}

}
