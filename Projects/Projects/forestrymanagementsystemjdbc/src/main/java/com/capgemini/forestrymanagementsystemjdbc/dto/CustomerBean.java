package com.capgemini.forestrymanagementsystemjdbc.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class CustomerBean implements Serializable{
	private int custid;
    private String telno;
    private String cname;
    private String town;
    private String postcode;
    private String email;
    private String password;
    
    
    
}
