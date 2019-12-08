package com.capgemini.fmsapp.admin;

import java.util.List;
import java.util.Map;

import com.capgemini.fmsapp.client.ContractorBean;

public interface ContractorDao {
	
	public boolean addContractor(ContractorBean bean);
	public boolean searchContracter(int contractno, Map<Integer, List<ContractorBean>> m);
	public boolean deleteContractor(int contractno, Map<Integer, List<ContractorBean>> m );
	public boolean modifyContractor(int contractno, Map<Integer, List<ContractorBean>> m);
	public List<ContractorBean> getAllContractors();

}
