package com.capgemini.forestrymanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.capgemini.forestrymanagementsystem.dto.ProductBean;

public class ProductDaoImpl implements ProductDao {

	List<ProductBean> list;
	@Override
	public boolean addProduct(ProductBean bean) {
		list=new ArrayList<ProductBean>();
		list.add(bean);
		return true;
	}

	@Override
	public boolean searchProduct(int productid, Map<Integer, List<ProductBean>> map) {
		Set<Entry<Integer, List<ProductBean>>> e= map.entrySet();
		for (Entry<Integer, List<ProductBean>> entry : e) {
			if(entry.getKey()==productid) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteProduct(int productid, Map<Integer, List<ProductBean>> map) {
		Set<Entry<Integer, List<ProductBean>>> e= map.entrySet();
		for (Entry<Integer, List<ProductBean>> entry : e) {
			if(entry.getKey()==productid) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean modifyProduct(int productid, Map<Integer, List<ProductBean>> map) {
		Set<Entry<Integer, List<ProductBean>>> e= map.entrySet();
		for (Entry<Integer, List<ProductBean>> entry : e) {
			if(entry.getKey()==productid) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<ProductBean> getAllProduct() {
		return list;
	}

}
