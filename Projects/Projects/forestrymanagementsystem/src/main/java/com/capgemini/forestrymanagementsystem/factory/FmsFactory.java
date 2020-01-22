package com.capgemini.forestrymanagementsystem.factory;

import com.capgemini.forestrymanagementsystem.dao.ContractDao;
import com.capgemini.forestrymanagementsystem.dao.ContractDaoImpl;
import com.capgemini.forestrymanagementsystem.dao.CustomerDao;
import com.capgemini.forestrymanagementsystem.dao.CustomerDaoImpl;
import com.capgemini.forestrymanagementsystem.dao.ProductDao;
import com.capgemini.forestrymanagementsystem.dao.ProductDaoImpl;

public class FmsFactory {

	public static CustomerDao instanceOfCustomerDaoImpl() {
		CustomerDao dao = new CustomerDaoImpl();
		return dao;
	}

	public static ProductDao instanceofProductDaoImpl() {
		ProductDao dao = new ProductDaoImpl();
		return dao;
	}

	public static ContractDao instanceofContractDaoImpl() {
		ContractDao dao = new ContractDaoImpl();
		return dao;
	}

}
