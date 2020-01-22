package com.capgemini.forestrymanagementsystemjdbc.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.dao.HaulierDao;
import com.capgemini.forestrymanagementsystemjdbc.dto.HaulierBean;
import com.capgemini.forestrymanagementsystemjdbc.factory.FmsFactory;

public class HaulierServiceImpl implements HaulierService {
	
	HaulierDao dao=FmsFactory.instanceofHaulierDaoImpl();

	@Override
	public boolean addHaulier(HaulierBean bean) {
		return dao.addHaulier(bean);
	}

	@Override
	public boolean searchHaulier(int haulierid) {
		return dao.searchHaulier(haulierid);
	}

	@Override
	public boolean deleteHaulier(int haulierid) {
		// TODO Auto-generated method stub
		return dao.deleteHaulier(haulierid);
	}

	@Override
	public List<HaulierBean> getAllHauliers() {
		return dao.getAllHauliers();
	}

}
