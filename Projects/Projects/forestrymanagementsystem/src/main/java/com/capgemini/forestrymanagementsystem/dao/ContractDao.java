package com.capgemini.forestrymanagementsystem.dao;

import java.util.List;

import com.capgemini.forestrymanagementsystem.dto.ContractBean;
public interface ContractDao {
	
	public boolean addContract(ContractBean bean);
	public List<ContractBean> getAllContracts();

}
