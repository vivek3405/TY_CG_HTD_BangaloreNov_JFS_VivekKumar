package com.capgemini.forestrymanagementsystemspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.forestrymanagementsystemspringboot.dto.ContractBean;
import com.capgemini.forestrymanagementsystemspringboot.dto.ContractResponse;
import com.capgemini.forestrymanagementsystemspringboot.service.ContractService;

@RestController
public class ContractController {
	
	@Autowired
	private ContractService service;

	@PostMapping(path = "/add-contract", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse addContract(@RequestBody ContractBean bean) {
		ContractResponse response=new ContractResponse();
		if(service.addContract(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("added successfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("already exists");
		}
		return response;

	}
	@GetMapping(path = "/get-contract", produces = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse getContract() {
		ContractResponse response=new ContractResponse();
		List<ContractBean> beans=service.getAllContract();
		if(beans.isEmpty()) {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Contract not found");
		}else {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Contract data found");
			response.setContract(beans);
		}
		return response;
		
	}
}
