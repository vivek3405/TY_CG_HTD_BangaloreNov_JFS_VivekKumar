package com.capgemini.forestrymanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.capgemini.forestrymanagementsystem.dto.CustomerBean;

public class CustomerDaoImpl implements CustomerDao {

	List<CustomerBean> list;
	CustomerBean bean=new CustomerBean();

	@Override
	public boolean searchCustomer(int custid, Map<Integer, List<CustomerBean>> m) {
		
		Set<Entry<Integer, List<CustomerBean>>> e= m.entrySet();
		for (Entry<Integer, List<CustomerBean>> entry : e) {
			if(entry.getKey()==custid) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteCustomer(int custid, Map<Integer, List<CustomerBean>> m) {
		Set<Entry<Integer, List<CustomerBean>>> e= m.entrySet();
		for (Entry<Integer, List<CustomerBean>> entry : e) {
			if(entry.getKey()==custid) {
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean addCustomer(CustomerBean bean) {
		list=new ArrayList<CustomerBean>();
		list.add(bean);
		return true;

	}

	@Override
	public List<CustomerBean> getAllCustomer() {
		return list;
	}

	@Override
	public boolean modifyCustomer(int custid, Map<Integer, List<CustomerBean>> map) {
		Set<Entry<Integer, List<CustomerBean>>> e= map.entrySet();
		for (Entry<Integer, List<CustomerBean>> entry : e) {
			if(entry.getKey()==custid) {
				return true;
			}
		}
		return false;
	}
}
