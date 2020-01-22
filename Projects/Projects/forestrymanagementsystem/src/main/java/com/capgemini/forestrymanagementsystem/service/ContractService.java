package com.capgemini.forestrymanagementsystem.service;

import java.util.List;

import com.capgemini.forestrymanagementsystem.dto.ContractBean;

public interface ContractService {
	
	public boolean addContract(ContractBean bean);
	public List<ContractBean> getAllContracts();

}
