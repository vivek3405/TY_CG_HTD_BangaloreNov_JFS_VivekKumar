package com.capgemini.forestrymanagementsystemjdbc.dao;
import java.util.*;

import com.capgemini.forestrymanagementsystemjdbc.dto.CustomerBean;

public interface CustomerDao {
	
	public boolean addCustomer(CustomerBean bean);
	public boolean searchCustomer(int custid);
	public boolean deleteCustomer(int custid);
	public boolean modifyMobile(int custid, String number);
	public List<CustomerBean> getAllCustomer();
	public String login(String email, String password);

}