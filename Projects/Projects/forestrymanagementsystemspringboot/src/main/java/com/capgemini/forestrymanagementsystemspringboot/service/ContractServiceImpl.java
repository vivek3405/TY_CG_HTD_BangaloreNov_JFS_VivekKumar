package com.capgemini.forestrymanagementsystemspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestrymanagementsystemspringboot.dao.ContractDao;
import com.capgemini.forestrymanagementsystemspringboot.dto.ContractBean;
import com.capgemini.forestrymanagementsystemspringboot.dto.CustomerBean;
import com.capgemini.forestrymanagementsystemspringboot.dto.HaulierBean;
import com.capgemini.forestrymanagementsystemspringboot.dto.ProductBean;
import com.capgemini.forestrymanagementsystemspringboot.exception.CustomerException;
import com.capgemini.forestrymanagementsystemspringboot.exception.ProductException;

@Service
public class ContractServiceImpl implements ContractService {
	
	@Autowired
	private ContractDao dao;
	
	@Autowired
	private ProductService productService;
	@Autowired
	private CustomerService customerService;
	private HaulierService haulierService;

	@Override
	public boolean addContract(ContractBean bean) {
		List<ProductBean> productList=productService.searchProduct(bean.getProdId());
		List<CustomerBean> customerList= customerService.searchCustomer(bean.getCustId());
		List<HaulierBean> haulierList=  haulierService.searchHaulier(bean.getHaulId());
		if(productList.isEmpty()) {
			throw new ProductException("Product not found with this ID");
		}
		else if(customerList.isEmpty()) {
			throw new CustomerException("Customer not found with this ID");
		}
		else if(haulierList.isEmpty()) {
			throw new CustomerException("Haulier not found with this ID");
		}
		
		return dao.addContract(bean);
	}

	@Override
	public List<ContractBean> getAllContract() {
		return dao.getAllContract();
	}

}
