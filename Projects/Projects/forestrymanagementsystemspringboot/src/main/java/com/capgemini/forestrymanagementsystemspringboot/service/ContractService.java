package com.capgemini.forestrymanagementsystemspringboot.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemspringboot.dto.ContractBean;

public interface ContractService {
	
	public boolean addContract(ContractBean bean);
	public List<ContractBean> getAllContract();

}
