package com.capgemini.forestrymanagementsystem.service;

import java.util.List;
import java.util.Map;

import com.capgemini.forestrymanagementsystem.dao.ProductDao;
import com.capgemini.forestrymanagementsystem.dto.ProductBean;
import com.capgemini.forestrymanagementsystem.factory.FmsFactory;

public class ProductServiceImpl implements ProductService {
	
	ProductDao dao=FmsFactory.instanceofProductDaoImpl();

	@Override
	public boolean addProduct(ProductBean bean) {
		return dao.addProduct(bean);
	}

	@Override
	public boolean searchProduct(int productid, Map<Integer, List<ProductBean>> map) {
		return dao.searchProduct(productid, map);
	}

	@Override
	public boolean deleteProduct(int productid, Map<Integer, List<ProductBean>> map) {
		return dao.deleteProduct(productid, map);
	}

	@Override
	public boolean modifyProduct(int productid, Map<Integer, List<ProductBean>> map) {
		return dao.modifyProduct(productid, map);
	}

	@Override
	public List<ProductBean> getAllProduct() {
		return dao.getAllProduct();
	}

}
