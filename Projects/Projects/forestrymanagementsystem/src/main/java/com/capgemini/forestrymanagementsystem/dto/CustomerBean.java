package com.capgemini.forestrymanagementsystem.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString.Exclude;

@SuppressWarnings("serial")
@Data
public class CustomerBean implements Serializable {
	@Exclude
	private int customerId;
	private long mobileNo;
	private String customerName;
	private String town;
	private long postCode;
	private String email;

	@Override
	public String toString() {
		return "Customer ID\tMobile No.\tCustomer Name\tTown\tPostcode\tEmail\n" + customerId +"\t"+ mobileNo + "\t" + customerName + "\t"
				+ town + "\t" + postCode + "\t" + email;
	}

}
