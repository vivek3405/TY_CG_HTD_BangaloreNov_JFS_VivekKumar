package com.capgemini.forestrymanagementsystemhibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemhibernate.dao.ContractDao;
import com.capgemini.forestrymanagementsystemhibernate.dto.ContractBean;
import com.capgemini.forestrymanagementsystemhibernate.factory.FmsFactory;

public class ContractServiceImpl implements ContractService {
	ContractDao dao = FmsFactory.instanceOfContractDaoImpl();

	@Override
	public boolean addContract(ContractBean bean) {
		return dao.addContract(bean);
	}

	@Override
	public List<ContractBean> getAllContracts() {
		return dao.getAllContracts();
	}

}
