package com.capgemini.forestrymanagementsystem.dto;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class ContractBean implements Serializable {

	private int contractNo;
	private int customerId;
	private int productId;
	private int quantity;
	private String deliveryDate;

}