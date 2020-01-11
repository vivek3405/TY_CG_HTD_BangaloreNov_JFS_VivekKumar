package com.capgemini.retailerapp.service;

import java.util.List;

import com.capgemini.retailerapp.dto.UserInfoBean;

public interface UserInfoService {
	
	public UserInfoBean login(String email, String password);
	public boolean register(UserInfoBean bean);
	public boolean changePassword(int id, String password);
	public List<UserInfoBean> getAllOrders(String key);

}
