package com.capgemini.forestrymanagementsystemjdbc.factory;

import com.capgemini.forestrymanagementsystemjdbc.dao.ContractDao;
import com.capgemini.forestrymanagementsystemjdbc.dao.ContractDaoImpl;
import com.capgemini.forestrymanagementsystemjdbc.dao.CustomerDao;
import com.capgemini.forestrymanagementsystemjdbc.dao.CustomerDaoImpl;
import com.capgemini.forestrymanagementsystemjdbc.dao.HaulierDao;
import com.capgemini.forestrymanagementsystemjdbc.dao.HaulierDaoImpl;
import com.capgemini.forestrymanagementsystemjdbc.dao.LoginDao;
import com.capgemini.forestrymanagementsystemjdbc.dao.LoginDaoImpl;
import com.capgemini.forestrymanagementsystemjdbc.dao.OrdersDao;
import com.capgemini.forestrymanagementsystemjdbc.dao.OrdersDaoImpl;
import com.capgemini.forestrymanagementsystemjdbc.dao.ProductDao;
import com.capgemini.forestrymanagementsystemjdbc.dao.ProductDaoImpl;
import com.capgemini.forestrymanagementsystemjdbc.service.ContractService;
import com.capgemini.forestrymanagementsystemjdbc.service.ContractServiceImpl;
import com.capgemini.forestrymanagementsystemjdbc.service.CustomerService;
import com.capgemini.forestrymanagementsystemjdbc.service.CustomerServiceImpl;
import com.capgemini.forestrymanagementsystemjdbc.service.HaulierService;
import com.capgemini.forestrymanagementsystemjdbc.service.HaulierServiceImpl;
import com.capgemini.forestrymanagementsystemjdbc.service.LoginService;
import com.capgemini.forestrymanagementsystemjdbc.service.LoginServiceImpl;
import com.capgemini.forestrymanagementsystemjdbc.service.OrdersService;
import com.capgemini.forestrymanagementsystemjdbc.service.OrdersServiceImpl;
import com.capgemini.forestrymanagementsystemjdbc.service.ProductService;
import com.capgemini.forestrymanagementsystemjdbc.service.ProductServiceImpl;

public class FmsFactory {

	public static CustomerDao instanceOfCustomerDaoImpl() {
		CustomerDao dao = new CustomerDaoImpl();
		return dao;
	}

	public static CustomerService instanceOfCustomerServiceImpl() {
		CustomerService service = new CustomerServiceImpl();
		return service;
	}

	public static HaulierDao instanceofHaulierDaoImpl() {
		HaulierDao dao = new HaulierDaoImpl();
		return dao;
	}

	public static HaulierService instanceOfHaulierServiceImpl() {
		HaulierService service = new HaulierServiceImpl();
		return service;
	}

	public static ProductDao instanceofProductDaoImpl() {
		ProductDao dao = new ProductDaoImpl();
		return dao;
	}

	public static ProductService instanceOfProductServiceImpl() {
		ProductService service = new ProductServiceImpl();
		return service;
	}
	public static LoginDao instanceOfLoginDaoImpl() {
		LoginDao dao=new LoginDaoImpl();
		return dao;
	}
	public static LoginService instanceOfLoginServiceImpl() {
		LoginService service=new LoginServiceImpl();
		return service;
	}
	public static ContractDao instanceofContractDaoImpl() {
		ContractDao dao=new ContractDaoImpl();
		return dao;
	}
	public static ContractService instanceofContractServiceImpl() {
		ContractService service=new ContractServiceImpl();
		return service;
	}
	public static OrdersDao instanceOfOrdersDaoImpl() {
		OrdersDao dao=new OrdersDaoImpl();
		return dao;
	}
	public static OrdersService instanceOfOrdersServiceImpl() {
		OrdersService service=new OrdersServiceImpl();
		return service;
	}
}
