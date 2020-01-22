package com.capgemini.forestrymanagementsystemhibernate.dao;

import java.util.List;

import com.capgemini.forestrymanagementsystemhibernate.dto.ContractBean;

public interface ContractDao {

	public boolean addContract(ContractBean bean);

	public List<ContractBean> getAllContracts();

}
