package com.capgemini.fmsapp.admin;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.*;

import com.capgemini.fmsapp.client.CustomerBean;

public class CustomerDaoImpl implements CustomerDao {

	List<CustomerBean> l;
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

	public boolean addCustomer(CustomerBean b) {
		l=new ArrayList<CustomerBean>();
		l.add(b);
		return true;

	}

	@Override
	public List<CustomerBean> getAllCustomer() {
		return l;
	}
}
