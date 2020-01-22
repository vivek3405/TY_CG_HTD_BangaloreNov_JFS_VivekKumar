package com.capgemini.forestrymanagementsystemspringrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.forestrymanagementsystemspringrest.dto.OrderResponse;
import com.capgemini.forestrymanagementsystemspringrest.dto.OrdersBean;
import com.capgemini.forestrymanagementsystemspringrest.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping(path = "/add-order", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse registerCustomer(@RequestBody OrdersBean bean) {
		OrderResponse response=new OrderResponse();
		if(service.addOrder(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("order added successfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("order already exists");
		}
		return response;

	}
	@GetMapping(path = "/get-order", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse getAllOrder() {
		OrderResponse response=new OrderResponse();
		List<OrdersBean> beans=service.getAllOrder();
		if(beans.isEmpty()) {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not found");
		}else {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Haulier data found");
			response.setOrder(beans);
		}
		return response;
		
	}
	@PutMapping(path = "/modify-order", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse modifyOrder(@RequestBody OrdersBean bean) {
		OrderResponse response=new OrderResponse();
		if(service.modifyOrder(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("modification succesfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("order not found");
		}
		return response;
	}
	@DeleteMapping(path="/delete-order/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse deleteOrder(@PathVariable("id") int id) {
		OrderResponse response=new OrderResponse();
		
		service.deleteOrder(id);
		response.setStatusCode(201);
		response.setMessage("success");
		response.setDescription("Order Details Deleted");
		return response;
	}
	

}
