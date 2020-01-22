package com.capgemini.forestrymanagementsystem.service;

import java.util.List;

import com.capgemini.forestrymanagementsystem.dao.ContractDao;
import com.capgemini.forestrymanagementsystem.dto.ContractBean;
import com.capgemini.forestrymanagementsystem.factory.FmsFactory;

public class ContractServiceImpl implements ContractService {
	
	ContractDao dao=FmsFactory.instanceofContractDaoImpl();

	@Override
	public boolean addContract(ContractBean bean) {
		return dao.addContract(bean);
	}

	@Override
	public List<ContractBean> getAllContracts() {
		return dao.getAllContracts();
	}

}
