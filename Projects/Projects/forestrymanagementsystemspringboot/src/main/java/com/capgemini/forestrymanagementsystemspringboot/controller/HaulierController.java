package com.capgemini.forestrymanagementsystemspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.forestrymanagementsystemspringboot.dto.HaulierBean;
import com.capgemini.forestrymanagementsystemspringboot.dto.HaulierResponse;
import com.capgemini.forestrymanagementsystemspringboot.service.HaulierService;

@RestController
public class HaulierController {
	
	@Autowired
	private HaulierService service;
	
	@PostMapping(path = "/add-haulier", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse registerCustomer(@RequestBody HaulierBean bean) {
		HaulierResponse response=new HaulierResponse();
		if(service.register(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("registered successfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Email/ID already exists");
		}
		return response;

	}
	@GetMapping(path = "/get-haulier", produces = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse getAllCustomer() {
		HaulierResponse response=new HaulierResponse();
		List<HaulierBean> beans=service.getAllCustomer();
		if(beans.isEmpty()) {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not found");
		}else {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Haulier data found");
			response.setHaulier(beans);
		}
		return response;
		
	}
	@PutMapping(path = "/modify-haulier", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse modifyHaulier(@RequestBody HaulierBean bean) {
		HaulierResponse response=new HaulierResponse();
		if(service.modifyHaulier(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("modification succesfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("user not found");
		}
		return response;
	}
	@DeleteMapping(path="/delete-haulier/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse deleteHaulier(@PathVariable("id") int id) {
		HaulierResponse response=new HaulierResponse();
		
		service.deleteHaulier(id);
		response.setStatusCode(201);
		response.setMessage("success");
		response.setDescription("Haulier Details Deleted");
		return response;
	}
	@GetMapping(path = "/search-haulier", produces = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse searchCustomer(@RequestParam("key") int key) {
		HaulierResponse response=new HaulierResponse();
		List<HaulierBean> beans=service.searchHaulier(key);
		if(beans.isEmpty()) {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not found");
		}else {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("employee data found");
			response.setHaulier(beans);
		}
		return response;
		
	}

}
