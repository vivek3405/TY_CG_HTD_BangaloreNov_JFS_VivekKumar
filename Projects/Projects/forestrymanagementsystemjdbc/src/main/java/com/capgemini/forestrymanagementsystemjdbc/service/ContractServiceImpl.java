package com.capgemini.forestrymanagementsystemjdbc.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.dao.ContractDao;
import com.capgemini.forestrymanagementsystemjdbc.dto.ContractBean;
import com.capgemini.forestrymanagementsystemjdbc.factory.FmsFactory;

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
