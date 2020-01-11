package com.capgemini.retailerapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailerapp.dto.UserInfoBean;
import com.capgemini.retailerapp.dto.UserInfoResponse;
import com.capgemini.retailerapp.service.UserInfoService;

@RestController
public class RetailController {
	
	@Autowired
	private UserInfoService service;
	
	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse auth(@RequestBody UserInfoBean bean) {

		UserInfoBean userInfoBean= service.login(bean.getEmail(), bean.getPassword());
		UserInfoResponse response=new UserInfoResponse();
		if(userInfoBean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDiscription("Employee found for the credentials");
			response.setBeans(Arrays.asList(userInfoBean));
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDiscription("Credentials invalid");
		}
		return response;
	}
	
	@PostMapping(path = "/create-profile", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse register(@RequestBody UserInfoBean bean) {
		UserInfoResponse response=new UserInfoResponse();
		if(service.register(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDiscription("employee registered");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDiscription("Email already exists");
		}
		return response;

	}
	@PutMapping(path = "/update-password", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse changePassword(@RequestBody UserInfoBean bean) {
		UserInfoResponse response=new UserInfoResponse();
		if(service.changePassword(bean.getId(), bean.getPassword())) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDiscription("password change succesfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDiscription("user not found/password not changed");
		}
		return response;
	}
	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse searchEmployee(@RequestParam("key") String key) {
		UserInfoResponse response=new UserInfoResponse();
		List<UserInfoBean> beans=service.getAllOrders(key);
		if(beans.isEmpty()) {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDiscription("Data not found");
		}else {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDiscription("employee data found");
			response.setBeans(beans);
		}
		return response;
		
	}

}
