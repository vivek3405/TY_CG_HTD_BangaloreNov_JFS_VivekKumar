package com.capgemini.forestrymanagementsystemhibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemhibernate.dao.HaulierDao;
import com.capgemini.forestrymanagementsystemhibernate.dto.HaulierBean;
import com.capgemini.forestrymanagementsystemhibernate.factory.FmsFactory;

public class HaulierServiceImpl implements HaulierService {

	HaulierDao dao = FmsFactory.instanceOfHaulierDaoImpl();

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
		return dao.deleteHaulier(haulierid);
	}

	@Override
	public List<HaulierBean> getAllHauliers() {
		return dao.getAllHauliers();
	}

}
