package com.capgemini.forestrymanagementsystemhibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemhibernate.dao.ProductDao;
import com.capgemini.forestrymanagementsystemhibernate.dto.ProductBean;
import com.capgemini.forestrymanagementsystemhibernate.factory.FmsFactory;

public class ProductServiceImpl implements ProductService{
	
	ProductDao dao=FmsFactory.instanceOfProductDaoImpl();

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
	public List<ProductBean> getAllProduct() {
		return dao.getAllProduct();
	}

	@Override
	public List<ProductBean> searchProduct(String pname) {
		return dao.searchProduct(pname);
	}

}
