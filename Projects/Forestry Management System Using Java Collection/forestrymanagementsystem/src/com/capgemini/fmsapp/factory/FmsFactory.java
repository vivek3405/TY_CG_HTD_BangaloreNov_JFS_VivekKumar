package com.capgemini.fmsapp.factory;

import com.capgemini.fmsapp.admin.ContractorDao;
import com.capgemini.fmsapp.admin.ContractorDaoImpl;
import com.capgemini.fmsapp.admin.CustomerDao;
import com.capgemini.fmsapp.admin.CustomerDaoImpl;
import com.capgemini.fmsapp.admin.ProductDao;
import com.capgemini.fmsapp.admin.ProductDaoImpl;

public class FmsFactory {
	
	public static CustomerDao instanceOfCustomerDaoImpl() {
		CustomerDao dao=new CustomerDaoImpl();
		return dao;
		
	}
	public static ContractorDao instanceOfContractorDaoImpl() {
		ContractorDao dao =new ContractorDaoImpl();
		return dao;
		
	}
	public static ProductDao instanceOfProductDaoImpl() {
		ProductDao dao=new ProductDaoImpl();
		return dao;
	}

}
