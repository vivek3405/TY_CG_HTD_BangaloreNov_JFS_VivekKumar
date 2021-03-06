package com.capgemini.forestrymanagementsystemspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestrymanagementsystemspringboot.dao.OrderDao;
import com.capgemini.forestrymanagementsystemspringboot.dto.OrdersBean;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDao dao;

	@Override
	public boolean addOrder(OrdersBean bean) {
		return dao.addOrder(bean);
	}

	@Override
	public List<OrdersBean> getAllOrder() {
		return dao.getAllOrder();
	}

	@Override
	public boolean modifyOrder(OrdersBean bean) {
		return dao.modifyOrder(bean);
	}

	@Override
	public boolean deleteOrder(int id) {
		return dao.deleteOrder(id);
	}

}
