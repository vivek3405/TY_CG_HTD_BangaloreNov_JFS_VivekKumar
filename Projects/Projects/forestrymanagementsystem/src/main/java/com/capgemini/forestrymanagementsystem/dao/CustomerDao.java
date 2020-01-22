package com.capgemini.forestrymanagementsystem.dao;
import java.util.*;

import com.capgemini.forestrymanagementsystem.dto.CustomerBean;

public interface CustomerDao {
	
	public boolean addCustomer(CustomerBean bean);
	public boolean searchCustomer(int custid, Map<Integer, List<CustomerBean>> map);
	public boolean deleteCustomer(int custid, Map<Integer, List<CustomerBean>> map);
	public boolean modifyCustomer(int custid, Map<Integer, List<CustomerBean>> map);
	public List<CustomerBean> getAllCustomer();

}
