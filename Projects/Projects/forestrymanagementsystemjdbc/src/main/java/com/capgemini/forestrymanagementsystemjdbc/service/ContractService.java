package com.capgemini.forestrymanagementsystemjdbc.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.dto.ContractBean;

public interface ContractService {
	
	public boolean addContract(ContractBean bean);
	public List<ContractBean> getAllContracts();

}
