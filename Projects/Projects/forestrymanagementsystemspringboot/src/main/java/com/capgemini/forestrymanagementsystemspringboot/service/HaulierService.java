package com.capgemini.forestrymanagementsystemspringboot.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemspringboot.dto.HaulierBean;

public interface HaulierService {
	
	public boolean register(HaulierBean bean);
	public List<HaulierBean> getAllCustomer();
	public boolean modifyHaulier(HaulierBean bean);
	public boolean deleteHaulier(int id);
	public List<HaulierBean> searchHaulier(int key);

}
