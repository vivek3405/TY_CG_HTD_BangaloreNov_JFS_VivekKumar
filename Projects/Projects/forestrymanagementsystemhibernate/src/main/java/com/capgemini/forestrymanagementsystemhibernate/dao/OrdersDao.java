package com.capgemini.forestrymanagementsystemhibernate.dao;

import java.util.List;

import com.capgemini.forestrymanagementsystemhibernate.dto.OrdersBean;

public interface OrdersDao {
	public boolean addOrder(OrdersBean bean);

	public List<OrdersBean> getAllOrders();

}
