package com.capgemini.forestrymanagementsystemspringrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestrymanagementsystemspringrest.dao.ProductDao;
import com.capgemini.forestrymanagementsystemspringrest.dto.ProductBean;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao dao;

	@Override
	public boolean addProduct(ProductBean bean) {
		return dao.addProduct(bean);
	}
		

	@Override
	public List<ProductBean> getAllProduct() {
		return dao.getAllProduct();
	}

	@Override
	public boolean modifyProduct(int id, String pname, double pcost) {
		return dao.modifyProduct(id, pname, pcost);
	}

	@Override
	public boolean deleteProduct(int id) {
		return dao.deleteProduct(id);
	}

	@Override
	public List<ProductBean> searchProduct(String key) {
		return dao.searchProduct(key);
	}


	@Override
	public List<ProductBean> searchProduct(int key) {
		return dao.searchProduct(key);
	}

}
