package com.capgemini.forestrymanagementsystemjdbc.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class OrdersBean implements Serializable {
	
	private String pname;
	private int quantity;

}
