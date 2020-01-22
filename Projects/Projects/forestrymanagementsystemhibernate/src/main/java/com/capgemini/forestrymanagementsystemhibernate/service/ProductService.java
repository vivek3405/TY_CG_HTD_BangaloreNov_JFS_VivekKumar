package com.capgemini.forestrymanagementsystemhibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemhibernate.dto.ProductBean;

public interface ProductService {

	public boolean addProduct(ProductBean bean);

	public List<ProductBean> searchProduct(int productid);

	public boolean deleteProduct(int productid);

	public List<ProductBean> getAllProduct();

	public List<ProductBean> searchProduct(String pname);

}
