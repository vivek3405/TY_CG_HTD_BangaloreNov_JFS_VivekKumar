package com.capgemini.forestrymanagementsystemspringrest.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemspringrest.dto.ContractBean;

public interface ContractService {
	
	public boolean addContract(ContractBean bean);
	public List<ContractBean> getAllContract();

}
