package com.capgemini.forestrymanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.forestrymanagementsystem.dto.ContractBean;

public class ContractDaoImpl implements ContractDao {
	
	List<ContractBean> list;

	@Override
	public boolean addContract(ContractBean bean) {
		list=new ArrayList<ContractBean>();
		list.add(bean);
		return true;

	}

	@Override
	public List<ContractBean> getAllContracts() {
		return list;
	}

}
