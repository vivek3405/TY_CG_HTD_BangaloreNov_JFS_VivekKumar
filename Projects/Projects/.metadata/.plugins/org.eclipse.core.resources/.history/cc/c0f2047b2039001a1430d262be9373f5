package com.capgemini.forestrymanagementsystemspringrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestrymanagementsystemspringrest.dao.HaulierDao;
import com.capgemini.forestrymanagementsystemspringrest.dto.HaulierBean;

@Service
public class HaulierServiceImpl implements HaulierService {
	
	@Autowired
	private HaulierDao dao;

	@Override
	public boolean register(HaulierBean bean) {
		return dao.register(bean);
	}

	@Override
	public List<HaulierBean> getAllCustomer() {
		return dao.getAllCustomer();
	}

	@Override
	public boolean modifyHaulier(HaulierBean bean) {
		return dao.modifyHaulier(bean);
	}

	@Override
	public boolean deleteHaulier(int id) {
		return dao.deleteHaulier(id);
	}

	@Override
	public List<HaulierBean> searchHaulier(int key) {
		return dao.searchHaulier(key);
	}

}
