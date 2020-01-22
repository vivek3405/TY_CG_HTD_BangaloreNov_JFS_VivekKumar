package com.capgemini.forestrymanagementsystemjdbc.dao;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.dto.OrdersBean;

public interface OrdersDao {
	public boolean addOrder(OrdersBean bean);
	public List<OrdersBean> getAllOrders();

}
