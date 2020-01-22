package com.capgemini.forestrymanagementsystemhibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemhibernate.dao.OrdersDao;
import com.capgemini.forestrymanagementsystemhibernate.dto.OrdersBean;
import com.capgemini.forestrymanagementsystemhibernate.factory.FmsFactory;

public class OrdersServiceImpl implements OrdersService {

	OrdersDao dao = FmsFactory.instanceOfOrdersDaoImpl();

	@Override
	public boolean addOrder(OrdersBean bean) {
		return dao.addOrder(bean);
	}

	@Override
	public List<OrdersBean> getAllOrders() {
		return dao.getAllOrders();
	}

}
