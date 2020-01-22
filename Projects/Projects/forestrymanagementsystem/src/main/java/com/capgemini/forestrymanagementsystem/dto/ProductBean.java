package com.capgemini.forestrymanagementsystem.dto;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class ProductBean implements Serializable {

	private int productId;
	private String productName;
	private double productCost;
}