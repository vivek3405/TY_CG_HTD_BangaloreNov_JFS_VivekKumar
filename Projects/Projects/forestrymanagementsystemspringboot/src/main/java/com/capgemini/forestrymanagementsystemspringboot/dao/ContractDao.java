package com.capgemini.forestrymanagementsystemspringboot.dao;

import java.util.List;

import com.capgemini.forestrymanagementsystemspringboot.dto.ContractBean;

public interface ContractDao {
	
	public boolean addContract(ContractBean bean);
	public List<ContractBean> getAllContract();

}
