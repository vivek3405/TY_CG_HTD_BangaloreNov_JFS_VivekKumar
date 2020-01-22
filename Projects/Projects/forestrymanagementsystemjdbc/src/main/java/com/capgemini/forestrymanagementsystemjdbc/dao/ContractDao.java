package com.capgemini.forestrymanagementsystemjdbc.dao;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.dto.ContractBean;
public interface ContractDao {
	
	public boolean addContract(ContractBean bean);
	public List<ContractBean> getAllContracts();

}
