package com.capgemini.forestrymanagementsystemspringrest.dao;

import java.util.List;

import com.capgemini.forestrymanagementsystemspringrest.dto.HaulierBean;

public interface HaulierDao {
	
	public boolean register(HaulierBean bean);
	public List<HaulierBean> getAllCustomer();
	public boolean modifyHaulier(HaulierBean bean);
	public boolean deleteHaulier(int id);
	public List<HaulierBean> searchHaulier(int key);

}
