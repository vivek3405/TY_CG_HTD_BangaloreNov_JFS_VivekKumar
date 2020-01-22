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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.forestrymanagementsystemspringrest.dto.ProductBean;
import com.capgemini.forestrymanagementsystemspringrest.dto.ProductResponse;
import com.capgemini.forestrymanagementsystemspringrest.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping(path = "/add-product", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody ProductBean bean) {
		ProductResponse response=new ProductResponse();
		if(service.addProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Added successfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Product already exists");
		}
		return response;

	}
	@PutMapping(path = "/modify-product", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse modifyProduct(@RequestBody ProductBean bean) {
		ProductResponse response=new ProductResponse();
		if(service.modifyProduct(bean.getProdid(), bean.getPname(), bean.getPcost())) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("change succesfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("product not found");
		}
		return response;
	}
	@DeleteMapping(path="/delete-product/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse deleteProduct(@PathVariable("id") int Prodid) {
		ProductResponse response=new ProductResponse();
		
		service.deleteProduct(Prodid);
		response.setStatusCode(201);
		response.setMessage("success");
		response.setDescription("Product Deleted");
		return response;
	}
	@GetMapping(path = "/search-product", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse searchCustomer(@RequestParam("key") String key) {
		ProductResponse response=new ProductResponse();
		List<ProductBean> beans=service.searchProduct(key);
		if(beans.isEmpty()) {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Product not found");
		}else {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Product found");
			response.setProduct(beans);
		}
		return response;
		
	}
	@GetMapping(path = "/search-product", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse searchCustomer(@RequestParam("key") int key) {
		ProductResponse response=new ProductResponse();
		List<ProductBean> beans=service.searchProduct(key);
		if(beans.isEmpty()) {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Product not found");
		}else {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Product found");
			response.setProduct(beans);
		}
		return response;
		
	}
	@GetMapping(path = "/get-product", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getAllCustomer() {
		ProductResponse response=new ProductResponse();
		List<ProductBean> beans=service.getAllProduct();
		if(beans.isEmpty()) {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Product not found");
		}else {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Product data found");
			response.setProduct(beans);
		}
		return response;
		
	}

}
