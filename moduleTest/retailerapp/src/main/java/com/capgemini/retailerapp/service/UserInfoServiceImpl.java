package com.capgemini.retailerapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.retailerapp.dao.UserInfoDao;
import com.capgemini.retailerapp.dto.UserInfoBean;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	
	@Autowired
	private UserInfoDao dao;
	
	@Override
	public UserInfoBean login(String email, String password) {
		return dao.login(email, password);
	}

	@Override
	public boolean register(UserInfoBean bean) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(bean.getPassword());
		bean.setPassword(encodedPassword);
		
		return dao.register(bean);
	}

	@Override
	public boolean changePassword(int id, String password) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		return dao.changePassword(id, encoder.encode(password));
	}

	@Override
	public List<UserInfoBean> getAllOrders(String key) {
		return dao.getAllOrders(key);
	}

}
