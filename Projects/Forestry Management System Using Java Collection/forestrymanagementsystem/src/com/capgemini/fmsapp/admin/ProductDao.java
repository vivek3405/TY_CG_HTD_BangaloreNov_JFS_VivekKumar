package com.capgemini.fmsapp.admin;

import java.util.List;
import java.util.Map;

import com.capgemini.fmsapp.scheduler.ProductBean;


public interface ProductDao {
	
	public boolean addProduct(ProductBean bean);
	public boolean modifyProduct(int prodid, Map<Integer, List<ProductBean>> m);
	public boolean deleteProduct(int prodid, Map<Integer, List<ProductBean>> m);
	public boolean searchProduct(int prodid, Map<Integer, List<ProductBean>> m);
	public List<ProductBean> getAllProduct();

}
