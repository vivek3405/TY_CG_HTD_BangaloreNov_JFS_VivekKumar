package com.capgemini.forestrymanagementsystem.service;

import java.util.List;
import java.util.Map;

import com.capgemini.forestrymanagementsystem.dto.ProductBean;

public interface ProductService {

	public boolean addProduct(ProductBean bean);
	public boolean searchProduct(int productid, Map<Integer, List<ProductBean>> map);
	public boolean deleteProduct(int productid, Map<Integer, List<ProductBean>> map);
	public boolean modifyProduct(int productid, Map<Integer, List<ProductBean>> map);
	public List<ProductBean> getAllProduct();
}
