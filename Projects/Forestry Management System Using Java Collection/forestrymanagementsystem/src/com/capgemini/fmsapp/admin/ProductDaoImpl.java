package com.capgemini.fmsapp.admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import com.capgemini.fmsapp.scheduler.ProductBean;

public class ProductDaoImpl implements ProductDao{
	List<ProductBean> l;

	@Override
	public boolean addProduct(ProductBean bean) {
		l=new ArrayList<ProductBean>();
		l.add(bean);
		return true;
	}

	@Override
	public boolean modifyProduct(int prodid, Map<Integer, List<ProductBean>> m) {
		Set<Entry<Integer, List<ProductBean>>> e= m.entrySet();
		for (Entry<Integer, List<ProductBean>> entry : e) {
			if(entry.getKey()==prodid) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteProduct(int prodid, Map<Integer, List<ProductBean>> m) {
		Set<Entry<Integer, List<ProductBean>>> e= m.entrySet();
		for (Entry<Integer, List<ProductBean>> entry : e) {
			if(entry.getKey()==prodid) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<ProductBean> getAllProduct() {

        return l;
	}

	@Override
	public boolean searchProduct(int prodid, Map<Integer, List<ProductBean>> m) {
		Set<Entry<Integer, List<ProductBean>>> e= m.entrySet();
		for (Entry<Integer, List<ProductBean>> entry : e) {
			if(entry.getKey()==prodid) {
				return true;
			}
		}
		return false;
	}
	
	

}
