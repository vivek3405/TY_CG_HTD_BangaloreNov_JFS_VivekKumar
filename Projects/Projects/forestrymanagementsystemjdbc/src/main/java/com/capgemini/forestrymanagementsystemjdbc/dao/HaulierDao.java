package com.capgemini.forestrymanagementsystemjdbc.dao;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.dto.HaulierBean;

public interface HaulierDao {
	
	public boolean addHaulier(HaulierBean bean);
	public boolean searchHaulier(int haulierid);
	public boolean deleteHaulier(int haulierid);
	public List<HaulierBean> getAllHauliers();

}
