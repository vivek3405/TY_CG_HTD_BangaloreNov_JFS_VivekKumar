package com.capgemini.forestrymanagementsystemjdbc.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.dto.HaulierBean;

public interface HaulierService {
	
	public boolean addHaulier(HaulierBean bean);
	public boolean searchHaulier(int haulierid);
	public boolean deleteHaulier(int haulierid);
	public List<HaulierBean> getAllHauliers();

}
