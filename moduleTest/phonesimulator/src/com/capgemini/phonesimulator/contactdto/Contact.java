package com.capgemini.phonesimulator.contactdto;

import java.io.Serializable;

import lombok.Data;
@Data
public class Contact implements Serializable {
	
	private String name;
	private int number;
	private String group;
	

}
