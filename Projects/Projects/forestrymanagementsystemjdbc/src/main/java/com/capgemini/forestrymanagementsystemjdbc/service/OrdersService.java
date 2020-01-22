package com.capgemini.forestrymanagementsystemjdbc.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.dto.OrdersBean;

public interface OrdersService {
	public boolean addOrder(OrdersBean bean);
	public List<OrdersBean> getAllOrders();
}
