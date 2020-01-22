package com.capgemini.forestrymanagementsystemspringboot.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemspringboot.dto.ProductBean;

public interface ProductService {
	
	public boolean addProduct(ProductBean bean);
	public List<ProductBean> getAllProduct();
	public boolean modifyProduct(int id, String pname, double pcost);
	public boolean deleteProduct(int id);
	public List<ProductBean> searchProduct(String key);
	public List<ProductBean> searchProduct(int key);

}
