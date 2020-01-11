package com.capgemini.retailerapp.dao;

import java.util.List;

import com.capgemini.retailerapp.dto.OrderInfoBean;
import com.capgemini.retailerapp.dto.UserInfoBean;

public interface UserInfoDao {
	
	public UserInfoBean login(String email, String password);
	public boolean register(UserInfoBean bean);
	public boolean changePassword(int id, String password);
	public List<UserInfoBean> getAllOrders(String key);

}
