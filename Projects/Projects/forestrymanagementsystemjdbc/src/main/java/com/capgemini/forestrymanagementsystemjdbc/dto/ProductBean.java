package com.capgemini.forestrymanagementsystemjdbc.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProductBean implements Serializable {
	
    private int prodid;
    private String pname;
    private double pcost;
}
