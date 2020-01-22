package com.capgemini.forestrymanagementsystemhibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemhibernate.dto.OrdersBean;

public interface OrdersService {
	public boolean addOrder(OrdersBean bean);

	public List<OrdersBean> getAllOrders();
}
