package com.capgemini.forestrymanagementsystemjdbc.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.dao.OrdersDao;
import com.capgemini.forestrymanagementsystemjdbc.dto.OrdersBean;
import com.capgemini.forestrymanagementsystemjdbc.factory.FmsFactory;

public class OrdersServiceImpl implements OrdersService {
	
	OrdersDao dao=FmsFactory.instanceOfOrdersDaoImpl();

	@Override
	public boolean addOrder(OrdersBean bean) {
		return dao.addOrder(bean);
	}

	@Override
	public List<OrdersBean> getAllOrders() {
		return dao.getAllOrders();
	}

}
