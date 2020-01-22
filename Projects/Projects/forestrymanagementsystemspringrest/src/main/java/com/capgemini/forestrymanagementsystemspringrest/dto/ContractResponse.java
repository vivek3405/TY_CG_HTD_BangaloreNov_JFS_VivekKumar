package com.capgemini.forestrymanagementsystemspringrest.dto;

import java.util.List;

import lombok.Data;

@Data
public class ContractResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<ContractBean> contract;

}
