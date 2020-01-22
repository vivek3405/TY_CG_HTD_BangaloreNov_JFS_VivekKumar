package com.capgemini.forestrymanagementsystemjdbc.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.dao.ProductDao;
import com.capgemini.forestrymanagementsystemjdbc.dto.ProductBean;
import com.capgemini.forestrymanagementsystemjdbc.factory.FmsFactory;

public class ProductServiceImpl implements ProductService {
	
	ProductDao dao=FmsFactory.instanceofProductDaoImpl();

	@Override
	public boolean addProduct(ProductBean bean) {
		return dao.addProduct(bean);
	}

	@Override
	public List<ProductBean> searchProduct(int productid) {
		return dao.searchProduct(productid);
	}

	@Override
	public boolean deleteProduct(int productid) {
		return dao.deleteProduct(productid);
	}

	@Override
	public boolean modifyProduct(int productid) {
		return dao.modifyProduct(productid);
	}

	@Override
	public List<ProductBean> getAllProduct() {
		return dao.getAllProduct();
	}

	@Override
	public List<ProductBean> searchProduct(String pname) {
		return dao.searchProduct(pname);
	}

}
