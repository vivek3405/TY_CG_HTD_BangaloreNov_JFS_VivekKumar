package com.capgemini.forestrymanagementsystemhibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemhibernate.dto.ContractBean;

public interface ContractService {

	public boolean addContract(ContractBean bean);

	public List<ContractBean> getAllContracts();

}
