package com.capgemini.fmsapp.admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.capgemini.fmsapp.client.ContractorBean;

public class ContractorDaoImpl implements ContractorDao {

	List<ContractorBean> l;
	ContractorBean b=new ContractorBean();
	@Override
	public boolean addContractor(ContractorBean bean) {
		l=new ArrayList<ContractorBean>();
		if(bean.getContractno()== b.getContractno()) {
			return false;
		}
		l.add(bean);
		return true;
	}

	@Override
	public boolean searchContracter(int contractno, Map<Integer, List<ContractorBean>> m) {
		Set<Entry<Integer, List<ContractorBean>>> e= m.entrySet();
		for (Entry<Integer, List<ContractorBean>> entry : e) {
			if(entry.getKey()==contractno) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteContractor(int contractno, Map<Integer, List<ContractorBean>> m) {
		Set<Entry<Integer, List<ContractorBean>>> e= m.entrySet();
		for (Entry<Integer, List<ContractorBean>> entry : e) {
			if(entry.getKey()==contractno) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean modifyContractor(int contractno, Map<Integer, List<ContractorBean>> m) {
		Set<Entry<Integer, List<ContractorBean>>> e= m.entrySet();
		for (Entry<Integer, List<ContractorBean>> entry : e) {
			if(entry.getKey()==contractno) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<ContractorBean> getAllContractors() {
		return l;
	}

}
