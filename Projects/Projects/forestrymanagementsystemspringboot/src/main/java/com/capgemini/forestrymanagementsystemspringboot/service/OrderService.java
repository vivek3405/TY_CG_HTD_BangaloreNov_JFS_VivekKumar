package com.capgemini.forestrymanagementsystemspringboot.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemspringboot.dto.OrdersBean;

public interface OrderService {
	public boolean addOrder(OrdersBean bean);
	public List<OrdersBean> getAllOrder();
	public boolean modifyOrder(OrdersBean bean);
	public boolean deleteOrder(int id);
	
}
